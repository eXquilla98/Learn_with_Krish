import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name ="homeServerlet",value="/homeServerlet")
public class homeServerlet extends HttpServlet{

public void init() {
	System.out.println("Init");
	
}	


@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		System.out.println("serve");
		
		
		
	}

public void destroy() {
	System.out.println("destroy");
	
	

}
	
}
