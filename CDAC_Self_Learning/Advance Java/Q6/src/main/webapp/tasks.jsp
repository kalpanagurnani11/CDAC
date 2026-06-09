<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task Manager (MVC)</title>
</head>
<body>
    <h1>Task Manager</h1>
    <form action="insert" method="post">
        <input type="text" name="description" placeholder="New Task" required />
        <input type="submit" value="Add Task" />
    </form>
    <table border="1">
        <thead>
            <tr>
                <th>Description</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="task" items="${tasks}">
                <tr>
                    <td>
                        <c:choose>
                            <c:when test="${task.completed}">
                                <del><c:out value="${task.description}" /></del>
                            </c:when>
                            <c:otherwise>
                                <c:out value="${task.description}" />
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:out value="${task.completed ? 'Completed' : 'Pending'}" />
                    </td>
                    <td>
                        <c:if test="${!task.completed}">
                            <a href="complete?id=${task.id}">Mark Done</a>
                            |
                        </c:if>
                        <a href="delete?id=${task.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
