<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online Bookshop (Hibernate)</title>
</head>
<body>
    <h1>Online Bookshop (Hibernate Persistence)</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.title}"/></td>
                    <td><c:out value="${book.author}"/></td>
                    <td>$<c:out value="${book.price}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h2>Add a New Book</h2>
    <form action="${pageContext.request.contextPath}/" method="POST">
        <table>
            <tr>
                <td>Title:</td>
                <td><input type="text" name="title" required></td>
            </tr>
            <tr>
                <td>Author:</td>
                <td><input type="text" name="author" required></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="number" name="price" step="0.01" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Book"></td>
            </tr>
        </table>
    </form>
</body>
</html>
