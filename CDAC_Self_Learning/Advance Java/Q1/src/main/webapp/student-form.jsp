<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <c:if test="${student != null}">
        <h2>Edit Student</h2>
        <form action="update" method="post">
        <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
    </c:if>
    <c:if test="${student == null}">
        <h2>Add Student</h2>
        <form action="insert" method="post">
    </c:if>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="<c:out value='${student.name}' />" required /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" value="<c:out value='${student.email}' />" required /></td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" value="<c:out value='${student.course}' />" required /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save" />
                    <a href="list">Cancel</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
