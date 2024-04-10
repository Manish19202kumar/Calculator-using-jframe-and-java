package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@WebServlet("/Signup_Servlet")
public class Signup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 // read form fields
//	 response.setContentType("text/html");
	PrintWriter out = response.getWriter();
 String username = request.getParameter("username");
// String usermail =request.getParameter("usermail");
// String usernum = request.getParameter("usernum");
// String userpass = request.getParameter("userpass");
// String gender= request.getParameter("gender");
 System.out.println("username: " + username);
// System.out.println("password: " +userpass);
 // do some processing here...
 // get response writer
// PrintWriter writer = response.getWriter();
 // build HTML code  
 String htmlRespone = "<html>";
 htmlRespone += "<h2>Your username is: " + username + "<br/>"; 
// htmlRespone += "Your password is: " + userpass+ "</h2>"; 
// htmlRespone += "</html>";
 // return response
// writer.println(htmlRespone);
 
 
//	    String username1 = request.getParameter("username");
//	    String password = request.getParameter("password");
//	    System.out.println("username: " + username);
//	    System.out.println("password: " + password);
//	    PrintWriter writer1 = response.getWriter();

	 

//	 String htmlRespone1 = "<html>";
//	  htmlRespone1 += "<h2>Your username is: " + username + "<br/>"; 
//	  htmlRespone1 += "Your password is: " + password + "</h2>"; 
//	  htmlRespone1 += "</html>";
//
//	  writer1.println(htmlRespone1);
	 

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out1 = response.getWriter();
      HttpSession session=request.getSession(true);
      if(session.isNew()){
          out1.println("Welcome Here!");
                     
      }
      else
      {
      out1.println("Welcome back!");
      }
          /* TODO output your page here. You may use following sample code. */
          
          out1.println("<body>");
          out1.println("""
                      <html>
                      <head><title>Session </title></head>
                      <body bgcolor = "#f0f0f0">
                      <table border = "1" align = "center">
                      <tr bgcolor = "#949494">
                        <th>Session info</th><th>value</th</tr>
                      <tr>
                        <td>id</td>
                        <td>""" + session.getId() + "</td></tr>\n" +
                
                "<tr>\n" +
                   "  <td>Creation Time</td>\n" +
                   "  <td>" + new Date(session.getCreationTime())+" </td> </tr>\n" +
                
                "<tr>\n" +
                   "  <td>Time of Last Access</td>\n" + "<td>" + new Date(session.getLastAccessedTime())+ "  </td></tr>\n" +
                
                "<tr>\n" +
                   "</table>");
          out1.print("Session Id:"+(session.getId()));
          out1.println("Creation Time:"+new Date(session.getCreationTime())+"\n");
          out1.println("Last Accessed Time:"+new Date(session.getLastAccessedTime())+"\n");
          out1.println("</table>");
          out1.println("</body>");
          out1.println("</html>");
       }
    
      }
  

	 
	

