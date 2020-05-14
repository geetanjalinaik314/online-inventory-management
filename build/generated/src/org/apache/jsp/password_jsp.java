package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class password_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <script>\n");
      out.write("            function validatelogin()\n");
      out.write("            {\n");
      out.write("                if(document.f1.user.value==\"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter Username \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                if(document.f1.npassword.value==document.f1.cpassword.value)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password not matching \");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("           </script> \n");
      out.write("           \n");
      out.write("           <style>\n");
      out.write("        .center\n");
      out.write("           {\n");
      out.write("               padding:50px;\n");
      out.write("              text-align:center;\n");
      out.write("              \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .box{\n");
      out.write("               width:60%;\n");
      out.write("               position:absolute;\n");
      out.write("               left:20%;\n");
      out.write("               top:15%;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("           }\n");
      out.write("           input\n");
      out.write("           {\n");
      out.write("               width:40%;\n");
      out.write("               margin:8px 0;\n");
      out.write("               padding:10px 4px;\n");
      out.write("               border:3px solid black;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           input[type=submit]\n");
      out.write("           {\n");
      out.write("               width:20%;\n");
      out.write("               margin:8px 0;\n");
      out.write("               padding:10px 4px;\n");
      out.write("               border:3px solid black;\n");
      out.write("               background-color: green;\n");
      out.write("               border-radius:30px;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           body\n");
      out.write("           {\n");
      out.write("               background-color: lightslategrey;\n");
      out.write("               background-repeat:no-repeat;\n");
      out.write("               background-size:100% 100%;\n");
      out.write("               background-attachment:fixed;\n");
      out.write("               \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           label\n");
      out.write("           {\n");
      out.write("               \n");
      out.write("                font-family: Comic Sans MS;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("           </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"box\">\n");
      out.write("    <div class=\"center\">\n");
      out.write("        <h1>CHANGE PASSWORD</h1>\n");
      out.write("        <form name=\"f1\" method=\"get\" action=\"password2.jsp\"  onsubmit=\"return validate()\">\n");
      out.write("           <img src=\"images/user4.png\" width=\"160\"><br><br>\n");
      out.write("           <label for=\"user\">USER NAME</label>&nbsp;&nbsp;<input type=\"text\" name=\"user\"/><br><br>\n");
      out.write("            <label for=\"user\">NEW PASSWORD</label>&nbsp;&nbsp;<input type=\"text\" name=\"npassword\"/><br><br>\n");
      out.write("            <label for=\"pswd\"> CONFIRM PASSWORD</label>&nbsp;&nbsp;<input type=\"password\" name=\"cpassword\"/><br><br>\n");
      out.write("            <input type=\"submit\"   value=\"change\"/>\n");
      out.write("        </form></div></div>\n");
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
