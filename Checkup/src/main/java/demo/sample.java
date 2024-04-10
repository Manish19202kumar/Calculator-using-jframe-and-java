package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionCode")
public class sample {
//public static void main(String[] args) {
//	System.out.println("hello");
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession(true);
        if(session.isNew()){
            out.println("Welcome Here!");
                       
        }
        else
        {
        out.println("Welcome back!");
        }
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<body>");
            out.println("""
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
            out.print("Session Id:"+(session.getId()));
            out.println("Creation Time:"+new Date(session.getCreationTime())+"\n");
            out.println("Last Accessed Time:"+new Date(session.getLastAccessedTime())+"\n");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
         }
     }



