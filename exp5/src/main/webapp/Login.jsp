<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form class="log" action="login" method="post">
      <label for="email">Email/Mobile:</label>
      <input type="text" name="email" placeholder="Enter your Email">
      <label for="pass">Password:</label>
      <input type="password"  name="pass" placeholder="Enter your Password">
      <h2>Don't  have Account click here to <a href="Signup.html">create account</a></h2>
      <div class="btn">
      <button>Login</button>
      <button type="reset">Cancel</button>
   </div>
   </form>
</body>
</html>