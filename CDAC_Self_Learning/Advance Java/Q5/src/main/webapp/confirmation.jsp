<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmation</title>
</head>
<body>
    <h2>Booking Confirmed!</h2>
    <p><c:out value="${message}"/></p>
    <table border="1">
        <tr>
            <td>Passenger Name:</td>
            <td><c:out value="${passengerName}"/></td>
        </tr>
        <tr>
            <td>Flight Number:</td>
            <td><c:out value="${flight.flightNumber}"/></td>
        </tr>
        <tr>
            <td>Route:</td>
            <td><c:out value="${flight.origin}"/> to <c:out value="${flight.destination}"/></td>
        </tr>
        <tr>
            <td>Departure Date:</td>
            <td><c:out value="${flight.flightDate}"/></td>
        </tr>
        <tr>
            <td>Seat:</td>
            <td><c:out value="${seatNumber}"/></td>
        </tr>
        <tr>
            <td>Fare:</td>
            <td>$<c:out value="${flight.price}"/></td>
        </tr>
    </table>
    <br/>
    <a href="search">Book Another Flight</a>
</body>
</html>
