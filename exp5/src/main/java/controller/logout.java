package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
WebServlet("/logout")
public class logout extends HttpServlet{
	
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().invalidate();
		resp.getWriter().print("<h1 style='color:red'>Logout Succesfully</h1>");

		req.getRequestDispatcher("Login.jsp").include(req, resp);
	}
	}

