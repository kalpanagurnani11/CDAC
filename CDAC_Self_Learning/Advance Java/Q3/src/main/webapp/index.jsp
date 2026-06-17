<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Air Ticket Reservation</title>
</head>
<body>
    <h1>Available Flights</h1>
    <a href="booking?action=cart">View Cart (${sessionScope.cart != null ? sessionScope.cart.size() : 0})</a>
    <br/><br/>
    <table border="1">
        <thead>
            <tr>
                <th>Flight No</th>
                <th>Origin</th>
                <th>Destination</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="flight" items="${flights}">
                <tr>
                    <td><c:out value="${flight.flightNumber}"/></td>
                    <td><c:out value="${flight.origin}"/></td>
                    <td><c:out value="${flight.destination}"/></td>
                    <td>$<c:out value="${flight.price}"/></td>
                    <td>
                        <a href="booking?action=add&id=${flight.id}">Select Flight</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
