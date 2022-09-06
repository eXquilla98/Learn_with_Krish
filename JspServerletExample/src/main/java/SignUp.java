import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DB;
import model.User;



@WebServlet(name ="SignUp",urlPatterns = "/SignUp")
public class  SignUp extends HttpServlet {
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	String email=req.getParameter("email");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	
	ServletContext sc = req.getServletContext();
	
	if(sc.getAttribute("db")!=null){
		
		DB db=(DB) sc.getAttribute("db");
	}if (db.exsist(email)) {
		User user= new User(email,username,password);
		System.out.println(db.add(user));
	}
	
	else {
		System.out.println("Exist already");
		resp.sendRedirect("Login.jsp");
	}
	
}
}


