import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class hotelbluestar extends HttpServlet
{
	ServletContext ctx;
public void init(ServletConfig cfg)
{
	ctx=cfg.getServletContext();
}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter out=res.getWriter();
		out.println("Available");
	}
}