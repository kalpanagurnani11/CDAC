package com.example.dao;

import com.example.model.Flight;
import com.example.model.Reservation;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDAO {
    private String jdbcURL = "jdbc:h2:mem:ticketdb;DB_CLOSE_DELAY=-1";
    private String jdbcUsername = "sa";
    private String jdbcPassword = "";

    public TicketDAO() {
        try {
            Class.forName("org.h2.Driver");
            try (Connection connection = getConnection();
                 Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE IF NOT EXISTS flights (id INT AUTO_INCREMENT PRIMARY KEY, flight_number VARCHAR(50), origin VARCHAR(100), destination VARCHAR(100), price DOUBLE, flight_date VARCHAR(50))");
                statement.execute("CREATE TABLE IF NOT EXISTS reservations (id INT AUTO_INCREMENT PRIMARY KEY, flight_id INT, passenger_name VARCHAR(100), passenger_email VARCHAR(100), seat_number VARCHAR(10))");

                ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM flights");
                if (rs.next() && rs.getInt(1) == 0) {
                    statement.execute("INSERT INTO flights (flight_number, origin, destination, price, flight_date) VALUES ('AA-100', 'New York', 'London', 500.0, '2026-07-01')");
                    statement.execute("INSERT INTO flights (flight_number, origin, destination, price, flight_date) VALUES ('UA-200', 'New York', 'Paris', 600.0, '2026-07-01')");
                    statement.execute("INSERT INTO flights (flight_number, origin, destination, price, flight_date) VALUES ('LH-300', 'Chicago', 'Frankfurt', 750.0, '2026-07-02')");
                    statement.execute("INSERT INTO flights (flight_number, origin, destination, price, flight_date) VALUES ('EK-400', 'Chicago', 'Dubai', 900.0, '2026-07-02')");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    public List<Flight> searchFlights(String origin, String destination, String date) {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights WHERE LOWER(origin) = LOWER(?) AND LOWER(destination) = LOWER(?) AND flight_date = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, origin);
            statement.setString(2, destination);
            statement.setString(3, date);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String flightNumber = rs.getString("flight_number");
                double price = rs.getDouble("price");
                flights.add(new Flight(id, flightNumber, origin, destination, price, date));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    public Flight getFlightById(int id) {
        Flight flight = null;
        String sql = "SELECT * FROM flights WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String flightNumber = rs.getString("flight_number");
                String origin = rs.getString("origin");
                String destination = rs.getString("destination");
                double price = rs.getDouble("price");
                String flightDate = rs.getString("flight_date");
                flight = new Flight(id, flightNumber, origin, destination, price, flightDate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flight;
    }

    public void createReservation(Reservation res) throws SQLException {
        String sql = "INSERT INTO reservations (flight_id, passenger_name, passenger_email, seat_number) VALUES (?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, res.getFlightId());
            statement.setString(2, res.getPassengerName());
            statement.setString(3, res.getPassengerEmail());
            statement.setString(4, res.getSeatNumber());
            statement.executeUpdate();
        }
    }
}
