package wasdev.sample.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wasdev.sample.model.HelloBean;
import javax.inject.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1808808594661653378L;
	@Inject
	private HelloBean helloBean;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("<hrad><link rel=\"stylesheet\" href=\"\"/>");
		out.println("<h1>" + helloBean.getMessage() +"</h1>");
		out.println("</body></html>");
		
	}
}