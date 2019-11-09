import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class forwardservlet extends HttpServlet
{
	ServletContext ctx;
public void init(ServletConfig cfg)
{
	ctx=cfg.getServletContext();
}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	PrintWriter out=res.getWriter();
	String name=req.getParameter("t1");
	if(name.equals("BlueStar"))
	{
		RequestDispatcher dispatch=ctx.getRequestDispatcher("/run2");
		 out.println("<html><body><b>Hello Servlet<b><br><br>");
		dispatch.forward(req,res);
	}
	if(name.equals("SevenStar"))
	{
		RequestDispatcher dispatch=ctx.getRequestDispatcher("/run3");
		 out.println("<b>Hello Servlet.............<b><br></body></html>");
		dispatch.forward(req,res);
	}
	}
}