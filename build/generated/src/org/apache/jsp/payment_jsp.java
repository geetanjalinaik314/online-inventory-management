package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         \n");
      out.write("           \n");
      out.write("           input[type=text] {\n");
      out.write("  \n");
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
      out.write("           </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>PAYMENT DETAILS</h1>\n");
      out.write("        \n");
      out.write("        <img src=\"images/card.png\" width=300>\n");
      out.write("        <form>\n");
      out.write("<table align=\"center\" cellspacing=\"5\" cellpadding=\"5\">\n");
      out.write("<tr><th>PAYMENT METHOD</th></tr>\n");
      out.write("<tr> \n");
      out.write("  <tr><td><input type=\"radio\" name=\"payment\" value=\"COD\"/>Visa</td></tr>\n");
      out.write("  <tr><td><input type=\"radio\" name=\"payment\" value=\"Card\"/>Master Card</td></tr>\n");
      out.write("  \n");
      out.write("</table> \n");
      out.write("  \n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        <form name=\"f2\" method=\"post\"  action=\"payment2.jsp\">\n");
      out.write("            <label>Card Number</label><input type=\"text\" name=\"number\" size=\"50\"><br>\n");
      out.write("            <label>Name on Card</label><input type=\"text\" name=\"name\" size=\"50\"><br>\n");
      out.write("            <label>Expiry Date<input type=\"text\" name=\"date\" placeholder=\"MM/YY\" size=\"3\">\n");
      out.write("                CVV<input type=\"text\" name=\"cvv\" size=\"3\"></label>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("           </body>\n");
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
