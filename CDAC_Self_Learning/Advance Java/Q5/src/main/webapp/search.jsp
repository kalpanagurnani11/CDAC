<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Air Ticket Reservation - Search</title>
</head>
<body>
    <h1>Search Flights</h1>
    <form action="findFlights" method="get">
        <table>
            <tr>
                <td>Origin:</td>
                <td><input type="text" name="origin" required></td>
            </tr>
            <tr>
                <td>Destination:</td>
                <td><input type="text" name="destination" required></td>
            </tr>
            <tr>
                <td>Departure Date:</td>
                <td><input type="date" name="date" required value="2026-07-01"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Search Flights"></td>
            </tr>
        </table>
    </form>
    <p>Try searching: <strong>New York</strong> to <strong>London</strong> on <strong>2026-07-01</strong>.</p>
</body>
</html>
