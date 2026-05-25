<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.demo.model.Product"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.demo.model.Product" scope ="session">
<jsp:setProperty property="pid" name ="p" value='<%=Integer.parseInt(request.getParameter("pid")) %>'></jsp:setProperty>
<jsp:setProperty property="pname" name ="p" value='<%=request.getParameter("pname") %>'></jsp:setProperty>
<jsp:setProperty property="qty" name ="p" value='<%=Integer.parseInt(request.getParameter("qty")) %>'></jsp:setProperty>
<jsp:setProperty property="price" name="p" value='<%=Double.parseDouble(request. getParameter("price"))%>'></jsp:setProperty>
<jsp:setProperty property="*" name="p"></jsp:setProperty>

</jsp:useBean>


   PID : <jsp:getProperty property="pid" name="p"></jsp:getProperty>
   Prod Name : <jsp:getProperty property="pname" name="p"></jsp:getProperty>
   Prod qty : <jsp:getProperty property="qty" name="p"></jsp:getProperty>
   Prod price : <jsp:getProperty property="price" name="p"></jsp:getProperty>

</body>
</html>