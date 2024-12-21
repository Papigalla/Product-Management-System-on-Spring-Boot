<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.Product_Management_System.entity.Product"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<Product> products=(List<Product>)request.getAttribute("product"); %>
<table>
<thead>
<tr>
<td>productId</td>
<td>productName</td>
<td>productDescription</td>
<td>productQuantity</td>
<td>productPrice</td>
<td>Delete</td>
<td>Edit</td>
</tr>
</thead>
<tbody>
<% for(Product product:products){ %>
<tr>
<td><%=product.getProductId()%></td>
<td><%=product.getProductName() %></td>
<td><%=product.getDescription() %></td>
<td><%=product.getQuantity() %></td>
<td><%=product.getPrice() %></td>
<td><a href="delete-product?product_id=<%=product.getProductId()%>">Delete</a></td>
<td><a href="update-product?product_id=<%=product.getProductId() %>">Edit</a>
</tr>
<%} %>
</tbody>

</table>
</body>
</html>