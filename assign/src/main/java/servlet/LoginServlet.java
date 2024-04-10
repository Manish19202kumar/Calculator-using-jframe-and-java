package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

	

	/**
	 * Servlet implementation class LoginServlet
	 */

		private static final long serialVersionUID = 1L;
		private static UserDao userDao =new UserDaoImp();
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public LoginServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			System.out.println("done");
//			String username= request.getParameter("username");
//			String password= request.getParameter("password");
//			
//			if(UserDao.isValidUser(username,password)) {
//			HttpSession session =request.getSession();
//			session.setAttribute("username", username);
//			response.sendRedirect("welcome.jsp");
//			} else {
//				response.sendRedirect("login.jsp?error=1");
//				System.out.println("something wrong in logining");
//				
//			}
			 String username = request.getParameter("username");
		        String password = request.getParameter("password");

		        if (userDao.isValidUser(username, password)) {
		            HttpSession session = request.getSession();
		            session.setAttribute("username", username);
		            response.sendRedirect("welcome.jsp");
		            //System.out.println("Hi - "+username);
		        } else {
		            response.sendRedirect("login.jsp?error=1");
		        	System.out.println("Error A gya");
		        }
			
			
			
			
		}

	}

}
