package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script>\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                if(document.f4.pname.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter productname \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(document.f4.pnumber.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter number of products \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("        alert(\"Record inserted succcessfully\\nnew product inserted\");\n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("           </script> \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             body{\n");
      out.write("background-image:linear-gradient(25deg, white,blue);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-size: cover;\n");
      out.write("}\n");
      out.write("           input[type=text] {\n");
      out.write("  width: 30%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 20%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  background-color: limegreen;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("         <h1>PRODUCT DETAILS</h1>\n");
      out.write("        <h3>ENTER PRODUCT DETAILS CAREFULLY</h3>\n");
      out.write("        \n");
      out.write("        <div class=\"box1\">\n");
      out.write("            <form name=\"f4\" action=\"insertproduct.jsp\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("              <img src=\"images/icon/product.jpg\"  align=\"right\" width=700>\n");
      out.write("           <label class=\"font\">Product Name</label><br>\n");
      out.write("           <input type=\"text\" pattern=\"[A-Za-z]+\" name=\"pname\" class=\"form-control\" ><br> <br>\n");
      out.write("               \n");
      out.write("              <label class=\"font\">Product Type</label><br>\n");
      out.write("              <input type=\"text\" name=\"ptype\" class=\"form-control\"  ><br> <br> \n");
      out.write("               \n");
      out.write("            <label class=\"font\">Product Area</label><br>\n");
      out.write("            <input type=\"text\" name=\"parea\" class=\"form-control\" ><br>  <br>\n");
      out.write("            \n");
      out.write("             \n");
      out.write("           \n");
      out.write("            <label  class=\"font\">Product Cost Per Unit</label><br>             \n");
      out.write("            <input type=\"text\"  name=\"pcost\" class=\"form-control\" ><br><br>\n");
      out.write("              \n");
      out.write("           \n");
      out.write("            <label class=\"font\">Product Manufacturer</label><br>\n");
      out.write("            <input type=\"text\" name=\"pmanufacture\" class=\"form-control\"  ><br> <br>\n");
      out.write("            \n");
      out.write("            <label  class=\"font\">Number of Products Available in Stock</label><br>\n");
      out.write("            <input type=\"text\" name=\"pnumber\" class=\"form-control\"  ><br><br> \n");
      out.write("            \n");
      out.write("                         <input type=\"submit\"  value=\"SUBMIT\">\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
