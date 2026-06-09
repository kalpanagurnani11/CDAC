package com.example.servlet;

import com.example.model.Flight;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/booking")
public class SessionServlet extends HttpServlet {
    private List<Flight> availableFlights;

    public void init() {
        availableFlights = new ArrayList<>();
        availableFlights.add(new Flight("1", "AA-101", "New York", "London", 450.00));
        availableFlights.add(new Flight("2", "UA-202", "Chicago", "Tokyo", 850.00));
        availableFlights.add(new Flight("3", "LH-303", "Frankfurt", "Dubai", 600.00));
        availableFlights.add(new Flight("4", "EK-404", "Dubai", "Singapore", 500.00));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        HttpSession session = request.getSession();
        List<Flight> cart = (List<Flight>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }

        if (action.equals("list")) {
            request.setAttribute("flights", availableFlights);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if (action.equals("add")) {
            String id = request.getParameter("id");
            Flight flight = findFlight(id);
            if (flight != null) {
                cart.add(flight);
            }
            response.sendRedirect("booking?action=cart");
        } else if (action.equals("remove")) {
            String id = request.getParameter("id");
            cart.removeIf(f -> f.getId().equals(id));
            response.sendRedirect("booking?action=cart");
        } else if (action.equals("cart")) {
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        } else if (action.equals("checkout")) {
            session.removeAttribute("cart");
            request.setAttribute("message", "Booking successful! Your tickets are reserved.");
            request.getRequestDispatcher("cart.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private Flight findFlight(String id) {
        for (Flight f : availableFlights) {
            if (f.getId().equals(id)) {
                return f;
            }
        }
        return null;
    }
}
