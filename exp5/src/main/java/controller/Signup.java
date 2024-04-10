package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.MyDao;
import dto.Customer;
@WebServlet("/signup") // this is to make servlet class
@MultipartConfig // to recieve image we need to use this-enctype
public class Signup extends HttpServlet {
	
	

		@Override // when there is form and we want to data to be secured so dopost
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// logic to receive values from Ofront end
			String fullName = req.getParameter("fullname");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			String password = req.getParameter("password");
			String email = req.getParameter("email");
			String gender = req.getParameter("gender");
			String country = req.getParameter("country");
			LocalDate dob = LocalDate.parse(req.getParameter("dob"));
			int age = Period.between(dob, LocalDate.now()).getYears();
			Part pic = req.getPart("pic");
			byte[] picture = null;
			picture = new byte[pic.getInputStream().available()];
			pic.getInputStream().read(picture);
			
			// to access multiple method of dao 
			MyDao dao = new MyDao();
			
			// logic to verify email and mobile number is not repeated
			if(dao.fetchByEmail(email)==null && dao.fetchByMobile(mobile)==null)
			{
			// loading values inside object
			Customer customer = new Customer();
			customer.setAge(age);
			customer.setFullName(fullName);
			customer.setMobile(mobile);
			customer.setPassword(password);
			customer.setEmail(email);
			customer.setGender(gender);
			customer.setCountry(country);
			customer.setDob(dob);
			customer.setPicture(picture);

			
			// persisiting /saving the value inside dbms
//			MyDao dao = new MyDao();
			dao.save(customer);

			resp.getWriter().print("<h1 style='color:green'>Account created Successfully</h>");
			req.getRequestDispatcher("Login.html").include(req, resp);
		}
		else 
		{
			resp.getWriter().print("<h1 style='color:red'>Email / Mobile number already exist</h>");
			req.getRequestDispatcher("SignUp.hmtl").include(req, resp);
		}
			System.out.println(fullName);
			System.out.println(mobile);
			System.out.println(password);
			System.out.println(email);
			System.out.println(gender);
			System.out.println(country);
			System.out.println(dob);
			System.out.println(picture);
		}
	}

