<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Library Management System (MVC)</title>
</head>
<body>
    <h1>Library Management System (JSP + Servlet)</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>ISBN</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.title}"/></td>
                    <td><c:out value="${book.author}"/></td>
                    <td><c:out value="${book.isbn}"/></td>
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
                <td>ISBN:</td>
                <td><input type="text" name="isbn" required></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Book"></td>
            </tr>
        </table>
    </form>
</body>
</html>
