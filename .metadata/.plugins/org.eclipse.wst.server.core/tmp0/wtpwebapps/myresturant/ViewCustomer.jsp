<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@page import="java.util.List"%>
<%@page import="dto.Customer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer details</title>
<link rel="stylesheet" href="ViewCustomer.css">

</head>
<body>
<marquee behavior="" direction="">
		<h1>View Customer Details</h1>
	</marquee>
	<div class="head">

		<img src="rest.avif" alt="">
		<%
		List<Customer> customers = (List<Customer>) request.getAttribute("list");
		%>
		<div class="box">
			<table border="1" class="view">
				<tr>
					
					<th>Customer Name</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Gender<th>
					<th>DOB</th>
					<th>Picture</th>
					<th>Delete</th>
				</tr>
				<%
				for (Customer item : customers) {
				%>
				<tr>
					<th><%=item.getFullName() %></th>
					<th><%=item.getEmail()%></th>
					<th><%=item.getMobile()%></th>
					<th><%=item.getGender()%></th>
					<th><%=item.getDob()%></th>
					<th>
						<%
						String base64 = Base64.encodeBase64String(item.getPicture());
						%> <img height="80px" width="80px" alt="unknown"
						src="data:image/jpeg;base64,<%=base64%>">


					</th>
					
					<th><a href="deletecustomer?id=<%=item.getId()%>"><button>Delete</button></a></th>
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