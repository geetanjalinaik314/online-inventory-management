package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class supplier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           body{\n");
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
      out.write("            .box1\n");
      out.write("            {\n");
      out.write("                width:95%;\n");
      out.write("    border:5px solid black;\n");
      out.write("    background-color:mintcream;\n");
      out.write("    border-radius:25px;\n");
      out.write("    height:900px;\n");
      out.write("    margin:3px;\n");
      out.write("    padding:10px;\n");
      out.write("  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .font\n");
      out.write("            {\n");
      out.write("                font-family: Comic Sans MS;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>SUPPLIER DETAILS</h1>\n");
      out.write("        <h3>ENTER SUPPLIER DETAILS CAREFULLY</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"box1\">\n");
      out.write("            <form name=\"f4\" action=\"insertsupplier.jsp\" method=\"post\">\n");
      out.write("              <img src=\"images/img2.png\"  align=\"right\" width=\"50%\">\n");
      out.write("           <label class=\"font\">Supplier Name</label><br>\n");
      out.write("           <input type=\"text\" pattern=\"[A-Za-z]+\" name=\"sname\" class=\"form-control\" required><br> <br>\n");
      out.write("               \n");
      out.write("              <label class=\"font\">Supplier Number</label><br>\n");
      out.write("              <input type=\"text\" name=\"snumber\" class=\"form-control\"  required><br> <br> \n");
      out.write("               \n");
      out.write("            <label class=\"font\">Product Supplied</label><br>\n");
      out.write("            <input type=\"text\" name=\"supplied\" class=\"form-control\"  required><br>  <br>\n");
      out.write("             \n");
      out.write("           \n");
      out.write("            <label  class=\"font\">address</label><br>\n");
      out.write("            <input type=\"text\"  name=\"saddress\" class=\"form-control\" required><br><br>\n");
      out.write("           \n");
      out.write("            <label  class=\"font\">Contact Number</label><br>             \n");
      out.write("            <input type=\"text\"  name=\"contact\" class=\"form-control\" required><br><br>\n");
      out.write("              \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                         <input type=\"submit\"  class=\"form-control\" value=\"SUBMIT\">\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
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
