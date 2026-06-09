<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Results</title>
</head>
<body>
    <h1>Flight Results</h1>
    <p>From: <c:out value="${origin}"/> to <c:out value="${destination}"/> (<c:out value="${date}"/>)</p>
    <a href="search">Modify Search</a>
    <br/><br/>
    <c:choose>
        <c:when test="${empty flights}">
            <p>No flights found.</p>
        </c:when>
        <c:otherwise>
            <table border="1">
                <thead>
                    <tr>
                        <th>Flight No</th>
                        <th>Departure</th>
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
                                <a href="selectFlight?id=${flight.id}">Book Now</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</body>
</html>
