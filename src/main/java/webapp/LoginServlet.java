package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.com")
public class LoginServlet extends HttpServlet {
	
	private LoginValidation loginvalid = new LoginValidation();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		//String name = request.getParameter("name"); // from url - http://localhost:8080/?name=arun o/p: arun
		
//		request.setAttribute("username", request.getParameter("username"));
//		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isUserValid = loginvalid.isUserValid(username, password); 
		
		if(isUserValid){
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			
			request.getRequestDispatcher("/WEB-INF/views/homePage.jsp").forward(request, response);
		}
		else{
			request.setAttribute("errorMessage", "Invalid Credentials! Try again");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}


}
