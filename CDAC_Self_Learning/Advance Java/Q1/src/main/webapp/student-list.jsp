<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Management System</title>
</head>
<body>
    <h1>Student Management</h1>
    <a href="new">Add New Student</a>
    <br/><br/>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Course</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${listStudent}">
                <tr>
                    <td><c:out value="${student.id}"/></td>
                    <td><c:out value="${student.name}"/></td>
                    <td><c:out value="${student.email}"/></td>
                    <td><c:out value="${student.course}"/></td>
                    <td>
                        <a href="edit?id=${student.id}">Edit</a>
                        |
                        <a href="delete?id=${student.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
