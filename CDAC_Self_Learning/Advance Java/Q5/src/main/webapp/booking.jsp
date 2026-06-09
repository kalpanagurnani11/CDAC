<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Passenger Information</title>
</head>
<body>
    <h2>Passenger Details</h2>
    <div>
        <p>Flight: <c:out value="${flight.flightNumber}"/></p>
        <p>Route: <c:out value="${flight.origin}"/> to <c:out value="${flight.destination}"/></p>
        <p>Date: <c:out value="${flight.flightDate}"/></p>
        <p>Fare: $<c:out value="${flight.price}"/></p>
    </div>
    <form action="bookTicket" method="post">
        <input type="hidden" name="flightId" value="<c:out value='${flight.id}'/>">
        <table>
            <tr>
                <td>Full Name:</td>
                <td><input type="text" name="passengerName" required></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="passengerEmail" required></td>
            </tr>
            <tr>
                <td>Seat:</td>
                <td><input type="text" name="seatNumber" required></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Confirm Booking">
                    <a href="search">Cancel</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
