
<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@page import="java.util.List"%>
<%@page import="dto.Fooditem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Menu</title>
<link rel="stylesheet" href="ViewMenu.css">
</head>
<body>
	<marquee behavior="" direction="">
		<h1>Update Menu</h1>
	</marquee>
	<div class="head">

		<img src="rest.avif" alt="">
		<%
		List<Fooditem> items = (List<Fooditem>) request.getAttribute("list");
		%>
		<div class="box">
			<table border="1" class="view">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Picture</th>
					<th>Type</th>
					<th>Price</th>
					<th>Stock</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<%
				for (Fooditem item : items) {
				%>
				<tr>
					<th><%=item.getId()%></th>
					<th><%=item.getName()%></th>
					<th>
						<%
						String base64 = Base64.encodeBase64String(item.getPic());
						%> <img height="130px" width="130px" alt="unknown"
						src="data:image/jpeg;base64,<%=base64%>">


					</th>
					<th><%=item.getType()%></th>
					<th><%=item.getPrice()%></th>
					<th><%=item.getStock()%></th>
					<th><a href="edit?id=<%=item.getId()%>"><button>Edit</button></a></th>
					<th><a href="delete?id=<%=item.getId()%>"><button>Delete</button></a></th>
					<%-- delete?id=<%=item.getId()==url rewriting it will carry the primary key --%>
				</tr>
				<%
				}
				%>
			</table>
		</div>
		<br> <a href="AdminHome.html"><button>Back</button></a>
	</div>

</body>
</html>