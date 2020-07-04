package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                if(document.f4.cname.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter customer name \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(document.f4.caddress.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter address \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("        alert(\"Record inserted succcessfully\\nnew supplier added\");\n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("           </script> \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            html, body {\n");
      out.write("                min-height: 100%;\n");
      out.write("            }\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("            body, div, form, input, select, textarea, label, p { \n");
      out.write("                  padding: 0;\n");
      out.write("                  margin: 0;\n");
      out.write("                  outline: none;\n");
      out.write("                  font-family: Roboto, Arial, sans-serif;\n");
      out.write("                  font-size: 14px;\n");
      out.write("                  color: #666;\n");
      out.write("                  line-height: 22px;\n");
      out.write("            }\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("           input[type=text] {\n");
      out.write("                width: 70%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                padding: 12px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .colums {\n");
      out.write("                  display:flex;\n");
      out.write("                  justify-content:space-between;\n");
      out.write("                  flex-direction:row;\n");
      out.write("                  flex-wrap:wrap;\n");
      out.write("            }\n");
      out.write("\t\t\t\n");
      out.write("            .colums div {\n");
      out.write("                   width:50%;\n");
      out.write("            }\n");
      out.write("\t  \n");
      out.write("\t  \t  label{\n");
      out.write("\t\t           font-size:15px;\n");
      out.write("\t\t           font-color:black;\n");
      out.write("\t        }\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("          input[type=submit] {\n");
      out.write("                   width: 70%;\n");
      out.write("                   margin-bottom: 20px;\n");
      out.write("                   padding: 12px;\n");
      out.write("                   border: 1px solid #ccc;\n");
      out.write("                   border-radius: 15px;\n");
      out.write("                   background-color: limegreen;\n");
      out.write("            }\n");
      out.write("\t\t\t\n");
      out.write("          input[type=tel] {\n");
      out.write("                      width: 70%;\n");
      out.write("                      margin-bottom: 20px;\n");
      out.write("                      padding: 12px;\n");
      out.write("                      border: 1px solid #ccc;\n");
      out.write("                      border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("           form {\n");
      out.write("                     width: 80%;\n");
      out.write("                     padding: 20px;\n");
      out.write("                     border-radius: 6px;\n");
      out.write("                     background: #acb7ae;\n");
      out.write("                     box-shadow: 0 0 8px  #669999; \n");
      out.write("            }\n");
      out.write("\n");
      out.write(" \n");
      out.write("         .testbox {\n");
      out.write("                     display: flex;\n");
      out.write("                     justify-content: center;\n");
      out.write("                     align-items: center;\n");
      out.write("                     height: inherit;\n");
      out.write("                     padding: 20px;\n");
      out.write("            }\t  \n");
      out.write("         \n");
      out.write("        .banner {\n");
      out.write("                     position: relative;\n");
      out.write("                     height: 300px;\n");
      out.write("                     background-image: url(\"images/inv1.jpg\");  \n");
      out.write("                     background-size:cover;\n");
      out.write("                     display: flex;\n");
      out.write("                     justify-content: center;\n");
      out.write("                     align-items: center;\n");
      out.write("                     text-align: center;\n");
      out.write("              }\t\t \n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("    <div class=\"testbox\">\n");
      out.write("     <form name=\"f4\" action=\"insertcustomer.jsp\" method=\"post\" onsubmit=\"return validate()\">\n");
      out.write("        <div class=\"banner\">\n");
      out.write("          <h1><font size=\"50px\" color=\"black\">New Customer Registration</font></h1>\n");
      out.write("        </div>\n");
      out.write("\t\t<br><br>\n");
      out.write("        <div class=\"colums\">\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"fname\"> First Name<span>*</span></label>\n");
      out.write("            <input id=\"fname\" type=\"text\" name=\"fname\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"lname\"> Last Name<span>*</span></label>\n");
      out.write("            <input id=\"lname\" type=\"text\" name=\"lname\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"address1\">Address 1<span>*</span></label>\n");
      out.write("            <input id=\"address1\" type=\"text\"   name=\"address1\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"address2\">Address 2<span>*</span></label>\n");
      out.write("            <input id=\"address2\" type=\"text\"   name=\"address2\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"state\">State<span>*</span></label>\n");
      out.write("            <input id=\"state\" type=\"text\"   name=\"state\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"zip\">Zip/Postal Code<span>*</span></label>\n");
      out.write("            <input id=\"zip\" type=\"text\" name=\"zip\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"city\">City<span>*</span></label>\n");
      out.write("            <input id=\"city\" type=\"text\"   name=\"city\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"eaddress\">Email Address<span>*</span></label>\n");
      out.write("            <input id=\"eaddress\" type=\"text\"   name=\"eaddress\" required/>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("            <label for=\"phone\">Phone<span>*</span></label>\n");
      out.write("            <input id=\"phone\" type=\"tel\"   name=\"phone\" required/>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h2>Terms and Conditions</h2>\n");
      out.write("        <input type=\"checkbox\" name=\"checkbox1\">\n");
      out.write("        <label>You agree that all agreements, notices, disclosures and other communications that we provide.</label>\n");
      out.write("        <div class=\"btn-block\">\n");
      out.write("          <button type=\"submit\" href=\"/\">Submit</button>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
