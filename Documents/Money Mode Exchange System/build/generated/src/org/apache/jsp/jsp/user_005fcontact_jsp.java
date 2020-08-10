package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.*;

public final class user_005fcontact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/conne.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

     Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/MMSE","root","password");
                
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function msg_sent(){\n");
      out.write("                alert(\"Message Sent\"); }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.onload=msg_sent();\n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Refresh\" content=\"0; url=/Money_Mode_Exchange_System/contact.html\">\n");
      out.write("        <title>Contact user</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        PreparedStatement pst;
        String name,email,mobile,dtt,message;
        name=request.getParameter("t1");
        email=request.getParameter("t2");
        message=request.getParameter("t4");
        mobile=request.getParameter("t3");
        Date d=new Date();
        
        dtt= (d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();       
        
        try{
                               
            pst=con.prepareStatement("insert into contact_html_msg(name,email,mobile,msg,msg_dt) values(?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,email);
            pst.setString(3,mobile);
            pst.setString(4,message);
            pst.setString(5,dtt);
            int x=pst.executeUpdate();
            
        }
        catch(Exception e)
        {
            out.println("Please check the error "+e.getMessage());
        }
        
      out.write("\n");
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
