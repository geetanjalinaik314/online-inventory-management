package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class placeorder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

             
            
           
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st2=con2.createStatement();
           
                
                
                
                String name=request.getParameter("pname");
                String qty=request.getParameter("qty");
                 String customer=request.getParameter("cname");
                 String area1=request.getParameter("area");
                String city1=request.getParameter("city");
                String state1=request.getParameter("state");
                String pincode1=request.getParameter("pincode");
                
               int i=st2.executeUpdate("insert into order_1(pname,quantity,cname,area,city,state,pincode) values('"+name+"','"+qty+"','"+customer+"','"+area1+"','"+city1+"','"+state1+"','"+pincode1+"')");
             
                int j=st2.executeUpdate("insert into order_2(pname,quantity,cname,area,city,state,pincode) values('"+name+"','"+qty+"','"+customer+"','"+area1+"','"+city1+"','"+state1+"','"+pincode1+"')");
             
     
                 
                 if(i>0)
                {
                    //out.print("stock unavailable");
                    response.sendRedirect("order_3.jsp");
                }
                else
                {
                    out.print("error");
                   // response.sendRedirect("supplier.jsp?m=3");
                }
                
                
               
         
                        
            
                        
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("               \n");
      out.write("             \n");
      out.write("                \n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
