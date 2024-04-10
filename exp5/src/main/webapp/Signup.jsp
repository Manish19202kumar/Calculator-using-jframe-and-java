<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="signup" method="post" enctype="multipart/form-data">
    <fieldset style="width: 40%;">
        <legend>SignUp</legend>
       <table>
        <tr>
            <td>
                 Name:
            </td>
            <td>
                <input type="text"  name="fullname" required>
            </td>
        </tr>
        <tr>
            <td>
                 Mobile:
            </td>
            <td>
                <input type="tel" pattern="[0-9]{10}"  name="mobile"  required>
            </td>
        </tr>
        <tr>
            <td>
                 Email:
            </td>
            <td>
                <input type="email" name="email" required>
            </td>
        </tr>
        <tr>
            <td>
                 Date of Birth:
            </td>
            <td>
                <input type="date" name="dob" required>
            </td>
        </tr>
        <tr>
            <td>
                 Password:
            </td>
            <td>
                <input type="password" name="password" required>
            </td>
        </tr>
        <tr>
            <td>
                Confirm Password:
            </td>
            <td>
                <input type="password" required>
            </td>
        </tr>
        <tr>
            <td>
           Gender:
            </td>
            <td>
                <input type="radio" value="male" name="gender"> Male
                <input type="radio" value="female" name="gender"> Female
            </td>
        </tr>
        <tr>
          <td>
        
            <label for="country">Select country:</label>
          </td>
          <td>
            <select name="country" id="">
                <option value="India">India</option>
                <option value="Japan">Japan</option>
                <option value="South africa">South Africa</option>
            </select>
              <!-- <input type="text"> -->
          </td>
        </tr>

        <tr>
            <td>
                Picture
            </td>
            <td>
                <input type="file" name="pic">
            </td>
        </tr>
        <tr>
    <td>
        <button type="submit">SignUp</button>
    </td>
    <td>
      <a href="Signup.html">  <button type="reset">Cancel</button></a>
    </td>
 </tr>

         
       </table>
    </fieldset>
</form>
</div>
 <tr>
    <td>
 <h2>Already have Account <a href="Login.html">Login</a></h2>
</td>
</tr>
</body>
</html>