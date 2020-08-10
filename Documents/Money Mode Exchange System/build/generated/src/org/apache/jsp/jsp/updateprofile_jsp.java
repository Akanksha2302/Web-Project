package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form name=\"f1\" method=\"post\" action=\"updatedata.jsp\">\n");
      out.write("<h3>Update Email id:<input type=\"text\" name=\"t1\" ><br></h3>\n");
      out.write("<h3>Update Password:<input type=\"password\" name=\"t2\" ><br></h3>\n");
      out.write("<input type=\"submit\" value=\"Login\">\n");
      out.write("<input type=\"reset\" value=\"Clear\">\n");
      out.write("</form>\n");
      out.write("        <div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"index.html\">Back to Profile</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"lo\">\n");
      out.write("\t\t<h1>Profile Updation</h1>\n");
      out.write("                <form name=\"f1\" method=\"post\" action=\"updatedata.jsp\" onsubmit=\"\">\n");
      out.write("\t\t\t\t<label>New E-mail ID:</label>\n");
      out.write("\t\t\t\t<input type=\"email\" name=\"t1\" placeholder=\"E-mail\"><br>\n");
      out.write("\t\t\t\t<label>New Mobile Number:</label>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"t3\" placeholder=\" +91 Excluded\" maxlength=\"10\">\n");
      out.write("                                <label>New Password:</label>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"t2\" placeholder=\"Password\">\n");
      out.write("                                <label>Confirm New Password:</label>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"t2\" placeholder=\"Confirm Password\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
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
