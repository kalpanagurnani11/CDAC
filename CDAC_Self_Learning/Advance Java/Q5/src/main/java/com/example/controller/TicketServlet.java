package com.example.controller;

import com.example.dao.TicketDAO;
import com.example.model.Flight;
import com.example.model.Reservation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/")
public class TicketServlet extends HttpServlet {
    private TicketDAO ticketDAO;

    public void init() {
        ticketDAO = new TicketDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/findFlights":
                    findFlights(request, response);
                    break;
                case "/selectFlight":
                    selectFlight(request, response);
                    break;
                case "/bookTicket":
                    bookTicket(request, response);
                    break;
                default:
                    showSearchForm(request, response);
                    break;
            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }

    private void showSearchForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("search.jsp").forward(request, response);
    }

    private void findFlights(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String origin = request.getParameter("origin");
        String destination = request.getParameter("destination");
        String date = request.getParameter("date");

        List<Flight> flights = ticketDAO.searchFlights(origin, destination, date);
        request.setAttribute("flights", flights);
        request.setAttribute("origin", origin);
        request.setAttribute("destination", destination);
        request.setAttribute("date", date);
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }

    private void selectFlight(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int flightId = Integer.parseInt(request.getParameter("id"));
        Flight flight = ticketDAO.getFlightById(flightId);
        request.setAttribute("flight", flight);
        request.getRequestDispatcher("booking.jsp").forward(request, response);
    }

    private void bookTicket(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int flightId = Integer.parseInt(request.getParameter("flightId"));
        String passengerName = request.getParameter("passengerName");
        String passengerEmail = request.getParameter("passengerEmail");
        String seatNumber = request.getParameter("seatNumber");

        Reservation reservation = new Reservation(flightId, passengerName, passengerEmail, seatNumber);
        ticketDAO.createReservation(reservation);

        Flight flight = ticketDAO.getFlightById(flightId);
        request.setAttribute("message", "Ticket Booked Successfully!");
        request.setAttribute("flight", flight);
        request.setAttribute("passengerName", passengerName);
        request.setAttribute("seatNumber", seatNumber);
        request.getRequestDispatcher("confirmation.jsp").forward(request, response);
    }
}
