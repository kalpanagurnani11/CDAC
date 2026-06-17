<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="mytag" uri="/calculate" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <mytag:mycalculate num1='<%=request.getParameter("num1") %>' num2='<%=request.getParameter("num2") %>'>
           
     </mytag:mycalculate>
</body>
</html>