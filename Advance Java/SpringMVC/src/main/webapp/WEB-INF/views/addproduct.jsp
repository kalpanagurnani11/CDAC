<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ADD NEW PRODUCT</h1>
<form action="add" method="post" >
ProductId <input type="text" name="pid" id="pid"></br></br>
Product Name <input type="text" name="pnm" id="pnm"></br></br>
Quantity <input type="text" name="qty" id="qty"></br></br>
Price    <input type="text" name="pr"id="pr"></br></br>
MfgDate  <input type="date" name="date" id="date"></br></br>
Cid<input type="text" name="cid" id="cid"></br></br>
<button type="submit" name="btn" id="btn">Insert</button></br>
</form>

</body>
</html>