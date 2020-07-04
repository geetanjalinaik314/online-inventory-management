package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("background-color:lightblue;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-size: cover;\n");
      out.write("}\n");
      out.write("           input[type=text] {\n");
      out.write("  width: 50%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 30%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  background-color: limegreen;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  display: block;\n");
      out.write("  font-size:130%;\n");
      out.write("  //color: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   .span\n");
      out.write("   {\n");
      out.write("       font-size:12px;\n");
      out.write("      \n");
      out.write("   }\n");
      out.write("     \n");
      out.write("   .new{\n");
      out.write("       border:3px dotted black;\n");
      out.write("       width:50%;\n");
      out.write("       line-height:1;\n");
      out.write("       background-color:lightgrey;\n");
      out.write("   }\n");
      out.write("   .col50\n");
      out.write("   {\n");
      out.write("       float:left;\n");
      out.write("       width:50%;\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("   \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <h1>ENTER ORDER DETAILS</h1>\n");
      out.write("        <form name=\"f6\" action=\"placeorder.jsp\" method=\"post\">\n");
      out.write("            <label for=\"product\"> Select Product Name</label>\n");
      out.write("             ");


                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement(); 
                
                 
               
                ResultSet rs3=st.executeQuery("select pname from product");
                
      out.write("\n");
      out.write("           \n");
      out.write("               \n");
      out.write("                 <select name=\"pname\"  style=\"width:100px; height:30px;\">\n");
      out.write("                   ");

                     while(rs3.next())
                {
                    
      out.write("<option>");
out.print(rs3.getString("pname"));
      out.write("</option>");

                }
                    
      out.write("\n");
      out.write("                </select>\n");
      out.write("               <br>\n");
      out.write("               <br><label for=\"quantity\">Quantity</label><input type=\"text\" name=\"qty\" required>\n");
      out.write("                 \n");
      out.write("     \n");
      out.write("              \n");
      out.write("                \n");
      out.write("            <h3>Delivery Address</h3>\n");
      out.write("            <label for=\"fname\"><img src=\"images/icon/user-480.png\"  width=\"25\"> Full Name</label>\n");
      out.write("            <input type=\"text\"  name=\"cname\" placeholder=\"John M. Doe\" required>\n");
      out.write("            <label for=\"email\"><img src=\"images/icon/download.png\" width=\"25\"> Email</label>\n");
      out.write("            <input type=\"text\"  name=\"email\" placeholder=\"john@example.com\">\n");
      out.write("            <div class=\"col50\"><label for=\"adr\"><img src=\"images/icon/images.png\" width=\"25\"> Address</label>\n");
      out.write("            <input type=\"text\"  name=\"area\" placeholder=\"542 W. 15th Street\" required>\n");
      out.write("            <label for=\"city\"><img src=\"images/icon/download (1).png\" width=\"25\"> City</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"New York\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col50\">\n");
      out.write("                <label for=\"state\">State</label>\n");
      out.write("                <input type=\"text\"  name=\"state\" placeholder=\"NY\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col50\">\n");
      out.write("                <label for=\"zip\">Zip</label>\n");
      out.write("                <input type=\"text\"  name=\"pincode\" placeholder=\"10001\" required>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("                <br><br>\n");
      out.write("         \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Continue to checkout\" >\n");
      out.write("     </div>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
