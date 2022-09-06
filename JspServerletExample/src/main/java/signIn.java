import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DB;
import model.User;
@WebServlet(name = "SignIn",value = "/SignIn")
public class signIn extends HttpServlet {
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
	
		String password=req.getParameter("password");
		
		ServletContext sc=req.getServletContext();
		if(sc.getAttribute("db")!=null){
			
			DB db=(DB) sc.getAttribute("db");
			boolean exist=db.exist(email);
		}if (exist== true) {
			User user= db.getUser(email);
		  if (email.equals(user.getEmail())&& password.equals(user.getPassword())){
			  req.setAttribute("uname", user.getUsername());
			  req.getRequestDispatcher("/Home.jsp").forward(req, resp);
			  
			
		} 
		  
		}
		
		else {
			resp.sendRedirect("/index.jsp");
		}
		
		
	}

}
