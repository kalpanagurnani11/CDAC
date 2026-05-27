<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.List, com.demo.model.Category"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List<Category> clist=(List<Category>)request.getAttribute("clist");%>

<form action="addproduct">
<select name="catid">
<%
for(Category c:clist)
{
%>
<option value="<%=c.getCid() %>"><%=c.getCname()%></option>
<%
}
%>

</select>
<button type="submit"name="btn" id="add" value="add">add product</button>
<button type="submit"name="btn" id="show" value="show">show product</button>
</form>
</body>
</html>