<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.Product_Management_System.entity.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Product product=(Product)request.getAttribute("Product"); %>
<h1>Update Product</h1>
<form action="update" method="post">
<input type="text" name="productId" readonly="readonly" value="<%=product.getProductId()%>"><br>
<input type="text" name="productName" value="<%=product.getProductName() %>"><br>
<input type="text" name="description" value="<%=product.getDescription() %>"><br>
<input type="text" name="Quantity" value="<%=product.getQuantity() %>"><br>
<input type="text" name="price" value="<%=product.getPrice() %>"><br>
<input type="submit" name="update">
</form>

</body>
</html>