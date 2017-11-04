
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyFirstServlet", urlPatterns = {"/MyFirstServlet"})
Public class MyFirstServlet extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet MyFirstServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Hello World!</h1>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProcessRequest(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest, request, HttpServletResponse, response)
			throws ServletException, IOException {
		ProcessRequest(request, response);
	}
	
	@Override
	public String getServletInfo() {
		return "Short description";
	}
}
	
	
	