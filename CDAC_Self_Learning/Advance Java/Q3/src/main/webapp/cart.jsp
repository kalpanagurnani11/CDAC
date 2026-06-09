<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Reservation Cart</title>
</head>
<body>
    <h1>Selected Tickets (Cart)</h1>
    <a href="booking?action=list">Back to Flights</a>
    <br/><br/>
    <c:if test="${message != null}">
        <p style="color: green;">
            <c:out value="${message}"/>
        </p>
    </c:if>

    <c:choose>
        <c:when test="${empty sessionScope.cart}">
            <p>Your cart is empty.</p>
        </c:when>
        <c:otherwise>
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
                    <c:set var="total" value="0.0" />
                    <c:forEach var="item" items="${sessionScope.cart}">
                        <tr>
                            <td><c:out value="${item.flightNumber}"/></td>
                            <td><c:out value="${item.origin}"/></td>
                            <td><c:out value="${item.destination}"/></td>
                            <td>$<c:out value="${item.price}"/></td>
                            <td>
                                <a href="booking?action=remove&id=${item.id}">Remove</a>
                            </td>
                        </tr>
                        <c:set var="total" value="${total + item.price}" />
                    </c:forEach>
                </tbody>
            </table>
            <h3>Total: $<c:out value="${total}"/></h3>
            <a href="booking?action=checkout">Confirm Reservation</a>
        </c:otherwise>
    </c:choose>
</body>
</html>
