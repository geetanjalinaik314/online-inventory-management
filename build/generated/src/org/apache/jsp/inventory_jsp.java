package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class inventory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("        <h3><center>PRODUCT DETAILS</center></h3>   \n");
      out.write("        <table border= \"3px solid black\" align=\"center\" frame=\"box\" width=\"50%\" rowspan=\"40%\" colspan=\"30%\" cellpadding=\"20\" cellspacing=\"20\" >  \n");
      out.write("            <tr>\n");
      out.write("                <td >PRODUCT NAME</td>\n");
      out.write("                <td>TYPE</td>\n");
      out.write("                <td>AREA</td>\n");
      out.write("                <td>COST</td>\n");
      out.write("                <td>ORDER</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("        ");
   
              
            
      

                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
             
                
                ResultSet rs=st.executeQuery("select * from inv");
              while(rs.next())
                  {
                       
      out.write("\n");
      out.write("              \n");
      out.write("               \n");
      out.write("               <tr>\n");
      out.write("        <td>");
 out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("        <td>");
out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("        <td>");
 out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("        <td>");
 out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("        <td><a href=\"orderinv.jsp\"><input type=\"button\" value=\"order\"></td>            \n");
      out.write("    </tr>\n");
      out.write(" ");
 }
              
      out.write("\n");
      out.write("        </table>     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
