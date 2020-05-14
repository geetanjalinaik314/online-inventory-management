package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        PRODUCTS AVAILABLE ARE<BR>\n");
      out.write("      <table border=\"1\"  align=center  cellpadding=\"5\" cellspacing=\"7\">\n");
      out.write("       \n");
      out.write("       <tr>\n");
      out.write("       <th>PRODUCT NAME   </th>\n");
      out.write("       <th>QUANTITY</th>\n");
      out.write("      <th colspan=\"3\">Fruits</th>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("         <th>   </th>\n");
      out.write("          <th>   </th>\n");
      out.write("          <th>mango</th>\n");
      out.write("           <th>orange</th>\n");
      out.write("           <th>apple</th>\n");
      out.write("       </tr>\n");
      out.write("      <tr>\n");
      out.write("         <th  rowspan=\"3\">meals</th>\n");
      out.write("         <th>Breakfast</th>\n");
      out.write("         <td>1</td>\n");
      out.write("         <td>1</td>\n");
      out.write("         <td>1</td>\n");
      out.write("      </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("       <th>lunch</th>\n");
      out.write("       <td>2</td>\n");
      out.write("       <td>0</td>\n");
      out.write("       <td>2</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("     <tr>\n");
      out.write("        <th>dinner</th>\n");
      out.write("         <td>3</td>\n");
      out.write("         <td>3</td>\n");
      out.write("        <td>3</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<form>\n");
      out.write("name<input type=\"date\"/></form>\n");
      out.write("</body>\n");
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
