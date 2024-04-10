<%@page import="dto.CustomerFoodItem"%>
<%@page import="java.util.List"%>
<%@page import="dto.Fooditem"%>
<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Menu</title>
<link rel="stylesheet" href="CustomerViewMenu.css">
</head>
<body>
<h1>View Menu</h1>
<div class="head">

	<img src="rest.avif" alt="">
       <%
		List<Fooditem> items = (List<Fooditem>) request.getAttribute("list");
       
       List<CustomerFoodItem> cartitems = (List<CustomerFoodItem>) request.getAttribute("cartitems");
		%>
		
		<div class="box">
		<table border="1" class="view">
				<tr>
				
					<th>Name</th>
					<th>Picture</th>
					<th>Type</th>
					<th>Price</th>
					<th>Available</th>
					<th>Reduce</th>
					<th>Quantity</th>
					<th>Add</th>
					
				</tr>
				<%
				for (Fooditem item : items) {
				%>
				<tr>
					
					<th><%=item.getName()%></th>
					<th>
						<%
						String base64 = Base64.encodeBase64String(item.getPic());
						%> <img height="130px" width="130px" alt="unknown"
						src="data:image/jpeg;base64,<%=base64%>">


					</th>
					<th><%=item.getType()%></th>
					<th><%=item.getPrice()%>&#8377</th>
					<th><%=item.getStock()%></th>
					<th><a href="removefromcart?id=<%=item.getId()%>"><button>-</button></a></th>
					
					<th>
					     <%if(cartitems==null){ %>0<%}else{
					    	 boolean flag=true;
			        for(CustomerFoodItem foodItem:cartitems)
			     {
				if(foodItem.getName().equals(item.getName())){%>
					<%=foodItem.getQuantity()%>
					<%flag=false; 
					}
					}
					if(flag){%>
			      <%=0%>
			      <% 
			     } } %>
			</th>
			<th><a href="addtocart?id=<%=item.getId()%>"><button>+</button></a></th>
			 
			
	      	</tr>
	     	<%} %>
		
			</table>
		</div>
		<a href=""><button>Cart</button></a>
		<br> <a href="CustomerHome.html"><button>Back</button></a>
	</div>
 </body>
</html>