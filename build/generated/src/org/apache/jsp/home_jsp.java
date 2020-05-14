package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("background-color:rosybrown;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-size: cover;\n");
      out.write("}\n");
      out.write("      \n");
      out.write(".boxed\n");
      out.write("{\n");
      out.write("    \n");
      out.write("    width:100%;\n");
      out.write("    padding:1px;\n");
      out.write("    border:5px ;\n");
      out.write("    margin:20px;\n");
      out.write("    line-height:600%;\n");
      out.write("    background-color:mintcream;\n");
      out.write("    border-radius:25px;\n");
      out.write("    size:30px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".boxed2\n");
      out.write("{\n");
      out.write("    width:700px;\n");
      out.write("    height:100px;\n");
      out.write("    padding:16px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    border:5px solid black;\n");
      out.write("    margin:0;\n");
      out.write("    background-color:rosybrown;\n");
      out.write("    border-radius:18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".box1{\n");
      out.write("    width:95%;\n");
      out.write("    border:3px solid black;\n");
      out.write("    height:75px;\n");
      out.write("    \n");
      out.write("    background-color:mintcream;\n");
      out.write("    border-radius:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".box2{\n");
      out.write("    width:95%;\n");
      out.write("    padding:1px;\n");
      out.write("    border:5px solid black;\n");
      out.write("    margin:0;\n");
      out.write("    height:100%;\n");
      out.write("    background-color:mintcream;\n");
      out.write("    border-radius:5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".img2\n");
      out.write("{\n");
      out.write("    align:right;\n");
      out.write("    width:2%;\n");
      out.write("    height:5%;\n");
      out.write("    //display:block;\n");
      out.write("    margin-left:auto;\n");
      out.write("    margin-right:auto;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            p{\n");
      out.write("  \n");
      out.write("                    text-indent:5em;\n");
      out.write("                    color:black;\n");
      out.write("                        font-size:20px;\n");
      out.write("\t\t\tletter-spacing:2px;\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\ttext-align:right;\n");
      out.write("\t\t\tmargin:25px;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <font style=\"Impact\"><b><h1>INVENTORY MANAGEMENT</h1></b>\n");
      out.write("                <h3> Manage your stocks and orders here</h3></font>\n");
      out.write("\n");
      out.write("    <div class=\"box1\">\n");
      out.write("    <p><a href=\"index.jsp\" style=\"text-decoration:none;color:black;\" >Home</a> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"#about_us\" style=\"text-decoration:none;color:black;\">Dashboard</a>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"adminlogin.jsp\" style=\"text-decoration:none;color:black;\">Inventory Admin</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"contactus\" style=\"text-decoration:none;color:black;\">Change Password</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"contactus\" style=\"text-decoration:none;color:black;\">Logout</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("    </p>\n");
      out.write("    </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"box2\"><img align=\"right\" id=\"img2\" src=\"images/2.jpeg\">\n");
      out.write("    <aside>\n");
      out.write("    <section>\n");
      out.write("        <div class=\"boxed\">\n");
      out.write("            \n");
      out.write("            <label class= \"boxed2\"><a href=\"product.jsp\">PRODUCT MANAGEMENT</a></label><br>\n");
      out.write("             <label class=\"boxed2\"><a href=\"order.jsp\">ADD USER</a></label><br>\n");
      out.write("            <label class= \"boxed2\"><a href=\"supplier.jsp\">ADD SUPPLIER</a></label><br>\n");
      out.write("            <label class=\"boxed2\"><a href=\"customer.jsp\">ADD CUSTOMER</a></label><br>\n");
      out.write("            <label  class=\"boxed2\"><a href=\"product_report.jsp\">PRODUCT REPORT</a></label><br>\n");
      out.write("            <label class=\"boxed2\"><a href=\"order.jsp\">CREATE ORDER</a></label><br>\n");
      out.write("             <label class=\"boxed2\"><a href=\"order.jsp\">CHANGE PASSWORD</a></label><br>\n");
      out.write("              <label class=\"boxed2\"><a href=\"order.jsp\">LOGOUT</a></label><br>\n");
      out.write("        </div>\n");
      out.write("    </section></aside>\n");
      out.write("        \n");
      out.write("             \n");
      out.write("</div>           \n");
      out.write("              \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
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
