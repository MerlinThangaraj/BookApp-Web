package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import model.Users;

@WebServlet("/RegisterServelet")
public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
			PrintWriter out=response.getWriter();
			out.println("RegisterUserServlet");
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			out.println("Name="+name);
			out.println("email="+email);
			out.println("password="+password);
			
			
			UserDAO userDAO=new UserDAO();
			Users user=new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			out.println("user="+ user);
			try{
				userDAO.register(user);
			}
			catch(Exception e){
				e.printStackTrace();
			}

			response.sendRedirect("login.html");
	}

}
