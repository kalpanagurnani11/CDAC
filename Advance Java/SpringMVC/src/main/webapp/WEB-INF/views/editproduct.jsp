

<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<h2>Update Product</h2>

<form:form
    action="${pageContext.request.contextPath}/product/update"
    method="post"
    modelAttribute="product"
    >

    <table>

        <tr>
            <td>Product Id</td>
            <td>
                <form:input path="pid" readonly="true"/>
            </td>
        </tr>

        <tr>
            <td>Product Name</td>
            <td>
                <form:input path="pname"/>
                <form:errors path="pname"/>
            </td>
        </tr>

        <tr>
            <td>Quantity</td>
            <td>
                <form:input path="qty"/>
                <form:errors path="qty"/>
            </td>
        </tr>

        <tr>
            <td>Price</td>
            <td>
                <form:input path="price"/>
                <form:errors path="price"/>
            </td>
        </tr>

        

        

        <tr>
            <td colspan="2">
                <input type="submit" value="Update Product">
            </td>
        </tr>

    </table>

</form:form>

</body>
</html>