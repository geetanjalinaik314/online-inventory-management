package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class confirm_005forder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>  \n");
      out.write("            body{\n");
      out.write("                 background-image:linear-gradient(lightpink, lightgeen);\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .center\n");
      out.write("           {\n");
      out.write("               padding:40px;\n");
      out.write("              text-align:center;\n");
      out.write("             \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .box{\n");
      out.write("               width:80%;\n");
      out.write("               position:absolute;\n");
      out.write("               left:10%;\n");
      out.write("               top:10%;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("           }\n");
      out.write("            label\n");
      out.write("           {\n");
      out.write("               \n");
      out.write("                font-family: verdana;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("           input[type=submit]\n");
      out.write("           {\n");
      out.write("               width:30%;\n");
      out.write("               margin:8px 0;\n");
      out.write("               padding:15px 4px;\n");
      out.write("               border:3px solid black;\n");
      out.write("               background-color:lightgrey;\n");
      out.write("               border-radius:4px;\n");
      out.write("           }\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form name=\"f1\"  action=\"payment.jsp\" method=\"post\">\n");
      out.write("        <div class=\"center\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("        ");
   
              
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
             
                
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st1=con1.createStatement();
             
                
                ResultSet rs=st.executeQuery("select * from order_1 where id=(select max(id) from order_1)");
              
                rs.next();
                {
                    ResultSet rs1=st1.executeQuery("select pcost from product where pname='"+rs.getString(2)+"'");
                     rs1.next();
        
 float qty=rs.getFloat(3);
 float cost=rs1.getFloat(1);
 
     
      
      float total=((cost*qty));
     
     
              
                       
      out.write("\n");
      out.write("              \n");
      out.write("               \n");
      out.write("                      <center> <table  width=\"50%\" border=\"3\" rowspan=\"30\" colspan=\"30\" cellpadding=\"2\" cellspacing=\"5\">  \n");
      out.write("                    <tr><td> <table width=\"50%\"  border=\"4\" rowspan=\"30\" colspan=\"30\" cellpadding=\"2\" cellspacing=\"5\">          \n");
      out.write("                    <center><h3> CONFIRM YOUR ORDER</h3></center>\n");
      out.write("                     </table>\n");
      out.write("                        </td></tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                          \n");
      out.write("                    <tr><td>\n");
      out.write("                <table width=\"50%\" rowspan=\"30\" colspan=\"30\" cellpadding=\"2\" cellspacing=\"20\">              \n");
      out.write("   \n");
      out.write("                    <tr><label>NAME-&nbsp;&nbsp;&nbsp;");
 out.print(rs.getString(4));
      out.write("</label></tr>\n");
      out.write("    \n");
      out.write("                \n");
      out.write("                     \n");
      out.write("                </table></td></tr>\n");
      out.write("    \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           <tr><td>  <table  rowspan=\"10\" colspan=\"10\" cellpadding=\"10\" cellspacing=\"10\" >  \n");
      out.write("                                       <tr><label> DELIVERY ADDRESS:</label><br>\n");
      out.write("                       \n");
      out.write("                           <tr><td><label>ADDRESS-&nbsp&nbsp");
out.print(rs.getString(5));
      out.write("</label></td></tr>\n");
      out.write("                           <tr><td> <label>CITY-&nbsp&nbsp");
out.print(rs.getString(6));
      out.write("</label></td></tr>\n");
      out.write("        <tr><td> <label>STATE&nbsp&nbsp");
 out.print(rs.getString(7));
      out.write("</label></td></tr>\n");
      out.write("        <tr><td><label>PINCODE&nbsp&nbsp");
 out.print(rs.getString(8));
      out.write("</label></td></tr></table>\n");
      out.write("        \n");
      out.write("        <tr><td>  <table width=\"60%\" rowspan=\"20\" colspan=\"30\" cellpadding=\"15\" cellspacing=\"20\" >  \n");
      out.write("                         <tr>\n");
      out.write("                             <td><label>PRODUCT NAME&nbsp;&nbsp;");
 out.print(rs.getString(2));
      out.write("</label></td>\n");
      out.write("                             <td> <label>QUANTITY&nbsp;&nbsp;&nbsp;");
out.print(rs.getString(3));
      out.write("</label><br></tr></td>\n");
      out.write("            \n");
      out.write("                               \n");
      out.write("                               </table></td></tr>\n");
      out.write("    \n");
      out.write("        <tr><td>  <table width=\"50%\" rowspan=\"20\" colspan=\"20\" cellpadding=\"2\" cellspacing=\"5\" >  \n");
      out.write("                    <tr><td><label>TOTAL&nbsp;&nbsp;&nbsp;");
 out.print(total);
      out.write("</label></td></tr></table>\n");
      out.write("            </td></tr>\n");
      out.write("                             \n");
      out.write("        \n");
      out.write(" ");
 }
              
      out.write("\n");
      out.write("              \n");
      out.write("                       \n");
      out.write("                          </table> <br><br> \n");
      out.write("              <input type=\"submit\"  value=\"PROCEED TO PAYMENT\"></div></div>\n");
      out.write("                      </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                ");
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
