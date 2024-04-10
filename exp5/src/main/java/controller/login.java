package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDao;
import dto.Customer;
@WebServlet("/login")
public class login extends HttpServlet{
	
	
		@Override // when there is form and we want to data to be secured so dopost
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// logic to receive values from front end
			String email=req.getParameter("email");
			String password=req.getParameter("pass");
			
			// verify if email exists
			MyDao dao=new MyDao();
			
			
			{
			Customer customer=dao.fetchByEmail(email);
			if(customer==null)
			{
				//if we dont write print statement in between <h1></h1>tag it will print full html structure and another way is written hello
				resp.getWriter().print("<h1 style='color:red'>Invalid email</h1>");
				//or
				//resp.setContentType("text/html")
				req.getRequestDispatcher("Login.jsp").include(req, resp);
			}
			else {
				if(password.equals(customer.getPassword()))
				{
					resp.getWriter().print("<h1 style='color:green'>Login succesfully</h1>");
					
					// getting session and setting value
					req.getSession().setAttribute("customer", customer);
					req.getRequestDispatcher("CustomerHome.jsp").include(req, resp);
				}
				else {
					resp.getWriter().print("<h1 style='color:red'>Invalid password</h1>");
					req.getRequestDispatcher("Login.jsp").include(req, resp);
				}
			}

		}
		
		}
}
