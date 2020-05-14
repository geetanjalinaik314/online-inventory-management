package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>Index</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{\n");
      out.write("background-image:linear-gradient(white,lightgrey);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("p{\n");
      out.write("  \n");
      out.write("                    text-indent:15em;\n");
      out.write("                    color:black;\n");
      out.write("                        font-size:20px;\n");
      out.write("\t\t\tletter-spacing:4px;\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\ttext-align: right;\n");
      out.write("\t\t\tmargin:25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("a:link, a:visted,a:focus\n");
      out.write("{\n");
      out.write("   \n");
      out.write("    color:#FF0000;\n");
      out.write("    padding:14px 25px;\n");
      out.write("    text-decoration:none;\n");
      out.write("    display:inline-block;\n");
      out.write("    font-family: helvetica;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover, a:active{\n");
      out.write("    background-color:red;\n");
      out.write("     font-family: helvetica;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("\t\t\tfont-family: Felix Titling;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\n");
      out.write("\t\t\tfont-style:normal;\n");
      out.write("\t\t\tfont-size:50px;\n");
      out.write("\t\t\tletter-spacing:4px;\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\ttext-align: left;\n");
      out.write("\t\t\tmargin:25px;\n");
      out.write("\t\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <h1>ONLINE INVENTORY MANAGEMENT</h1>  \n");
      out.write("<div>\n");
      out.write("    <p><a href=\"index.jsp\" style=\"color:black\">HOME</a> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"#about_us\" style=\"color:black\">ABOUT US</a>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <a href=\"adminlogin.jsp\" style=\"color:black\">ADMIN LOGIN</a>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;</div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<marquee scrollamount=\"15\"><img src=\"images/img2.png\"  width=700   height=500>&nbsp&nbsp&nbsp<img src=\"images/bg.jpeg\"  width=700   height=500>&nbsp&nbsp&nbsp<img src=\"images/inv_1.jpg\" width=700   height=500>&nbsp&nbsp&nbsp<img src=\"images/inv2.jpg\"  width=700  height=500>&nbsp&nbsp&nbsp</marquee>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><h3 id=\"about_us\"><font color=\"black\" face=\"roboto\">\n");
      out.write("    <br><br><br> \n");
      out.write("    Inventory management is a discipline primarily about specifying the \n");
      out.write("        shape and placement of stocked goods. It is required at different locations\n");
      out.write("        within a facility or within many locations of a supply network to\n");
      out.write("        precede the regular and planned course of production and stock of materials.\n");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("The concept of inventory, stock or work-in-process has been extended from \n");
      out.write("manufacturing systems to service businesses and projects,\n");
      out.write("by generalizing the definition to be \"all work within the process of production- all work that \n");
      out.write("is or has occurred prior to the completion of production.\" \n");
      out.write("In the context of a manufacturing production system, inventory refers to all \n");
      out.write("work that has occurred ? raw materials, partially finished products, finished\n");
      out.write("products prior to sale and departure from the manufacturing system. \n");
      out.write("In the context of services, inventory refers to all work done prior to sale,\n");
      out.write("including partially process information.  Inventory Management System is a software application which fulfills the requirement of a typical Stock Analysis in various go downs. It provides the interface to users in a graphical way to manage the daily transactions as well as historical data. Also provides the management reports like order placed, deliveries and products available. \n");
      out.write("      The system provides information to efficiently manage the flow of materials, effectively utilize people and equipment, coordinate internal activities and communicate with customers. Inventory Management does not make decisions or manage operations, they provide the information to managers who make more accurate and timely decisions to manage their operations.\n");
      out.write("This application maintains the centralized database so that any changes done at a location reflects immediately. This is an online tool so more than one user can login into system and use the tool simultaneously. Authentication is provided to the logged in user.\n");
      out.write("The aim of this application is to reduce the manual effort needed to manage transactions and historical data used in various go downs. Also, this application provides an interface to users to view the details like the daily Stock Statements of all go downs.  \n");
      out.write("The basic building blocks for the Inventory Management system and Inventory Control activities are:\n");
      out.write("Supplier and customer management\n");
      out.write("Sales and Order Planning\n");
      out.write("Production Planning\n");
      out.write("Material Requirements Planning\n");
      out.write("Inventory Reduction\n");
      out.write("</font></h3>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\t  </html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
