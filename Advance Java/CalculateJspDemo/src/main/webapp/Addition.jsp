<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="Myheader.html"%>
   <form action="adddata.jsp">
        Number1 : <input type="text" name="num1" id="n1"/><br/>
        Number2 : <input type='text' name='num2' id='n2'/><br/> 
        <button type="submit" name="btn" id="add" value="add">Add</button>
        <button type="submit" name="btn" id="fact" value="fact">Fact</button>
   </form>
   <%@include file="Myfooter.html"%>
</body>
</html>