<%@page import="org.apache.commons.codec.binary.Base64"%>
<%@page import="dto.Fooditem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Edit.css">
</head>
<body>
  <div class="head">
   <img src="rest.avif" alt="">
<% Fooditem item=(Fooditem)request.getAttribute("item"); %>
 <form class="edit" action="update" method="post" enctype="multipart/form-data">
      <label for="id"></label>
      <input type="text" name="id"  value="<%=item.getId()%>" placeholder="Enter id number" hidden="">
      <label for="Name">Name:</label>
      <input type="text" name="name" value="<%=item.getName()%>" placeholder="Enter item name">

      <label for="pass">Price:</label>
      <input type="text"  name="price" value="<%=item.getPrice()%>" placeholder="Enter price">

      
         <label for="Food Type">Food Type:
         <%if(item.getType().equals("veg")){ %>
         </label>
       
      <input type="radio" name="type" value="veg" checked="checked">Veg <br>
      <input type="radio" name="type" value="non-veg">Non-Veg <br>
      <% } else{%>
      <input type="radio" name="type" value="veg">Veg <br>
      <input type="radio" name="type" value="non-veg" checked="checked">Non-Veg <br>
      
      <% }%>
   

      <label for="Quantity">Quantity:</label>
      <input type="text" name="quantity" value="<%=item.getStock()%>" placeholder="Enter Quantity"><br>

      <label for="Picture">Picture:
             <%
				String base64 = Base64.encodeBase64String(item.getPic());
				%> 
				<img height="50px" width="50px" alt="unknown"
				src="data:image/jpeg;base64,<%=base64%>">
      <input type="file" name="pic"> 
    </label>


      <div class="btn">
      <button>Update</button>
      <button type="reset">Cancel</button>
   </div>
   </form>
</div>

</body>
</html>