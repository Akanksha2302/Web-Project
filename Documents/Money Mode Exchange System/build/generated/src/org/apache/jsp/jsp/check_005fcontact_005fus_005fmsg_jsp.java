package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.*;

public final class check_005fcontact_005fus_005fmsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"error.jsp", true, 8192, true);
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"Stylesheet\" type=\"text/css\" href=\"/Money_Mode_Exchange_System/css/style.css\" >\n");
      out.write("        <link rel=\"Stylesheet\" type=\"text/css\" href=\"/Money_Mode_Exchange_System/css/menu.css\" >\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        td,tr{\n");
      out.write("            color: #ffff99;\n");
      out.write("        text-align: center;\n");
      out.write("        border: 2px solid ;\n");
      out.write("        border-color:red;\n");
      out.write("        height: 50px;\n");
      out.write("        word-wrap: break-word;\n");
      out.write("        margin: 5px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        th{\n");
      out.write("            color: #99ffcc;\n");
      out.write("            text-align: center; \n");
      out.write("            height: 45px;\n");
      out.write("            border: 2px solid ;\n");
      out.write("            text-decoration: underline;\n");
      out.write("            border-color:red;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("        table-layout: fixed;\n");
      out.write("        align-content: center;\n");
      out.write("\tbackground:#111111;\n");
      out.write("\tcolor:#fff;\n");
      out.write("        border: 1px solid red;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tpadding:10px 10px;\n");
      out.write("        width:100%;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form{\n");
      out.write("        width:200px;\n");
      out.write("\theight:100px;\n");
      out.write("\tbackground:#000;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\ttop:6%;\n");
      out.write("\tleft:74%;\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttransform:translate(-50%,-50%);\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\tpadding:15px 15px;\n");
      out.write("        font-weight:bold;\n");
      out.write("        border-radius:5%;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("\twidth:90%;\n");
      out.write("\tmargin-bottom:10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form input[type=\"text\"]{\n");
      out.write("\tborder:none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground:transparent;\n");
      out.write("\toutline:none;\n");
      out.write("        color:#fff;\n");
      out.write("\tfont-size:16px;\n");
      out.write("        }\n");
      out.write("        form  input[type=\"submit\"]{\n");
      out.write("\tborder:none;\n");
      out.write("\toutline:none;\n");
      out.write("\theight:20px;\n");
      out.write("\tbackground:#fb2525;\n");
      out.write("\tcolor:#fff;\n");
      out.write("\tfont-size:18px;\n");
      out.write("\tborder-radius:20px;\n");
      out.write("        }\n");
      out.write("        form input[type=\"submit\"]:hover{\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tbackground:#ffc107;\n");
      out.write("\tcolor:#000;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Messages_Contact US HTML page </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<ul>\n");
      out.write("                              <li><a href=\"ADMIN.jsp\">Back to ADMIN PANEL</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("        <form name=\"f2\" method=\"post\" action=\"delete_contact_msg.jsp\">\n");
      out.write("                Delete Message\n");
      out.write("                        <input type=\"text\" name=\"t1\" placeholder=\"Enter Date-time\" required>\n");
      out.write("                        <input type=\"submit\" value=\"Delete\">\n");
      out.write("            </form>\n");
      out.write("        <h1 class=\"dev\">Messages</h1>\n");
      out.write("        <br><br>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Mobile Number</th>\n");
      out.write("                <th>Message</th>\n");
      out.write("                <th>Date-Time</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr style=\"border: 0px solid ;\">\n");
      out.write("                <td style=\"border: 0px solid ;\" >&nbsp;</td> \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("        ");

        String sess_un,dt;
        int count=0;
        PreparedStatement pst1;
        sess_un=(String)session.getAttribute("s1");
        
        Date d=new Date();
        dt= (d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();       
          
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select name,email,mobile,msg,msg_dt from contact_html_msg");
            
             pst1=con.prepareStatement("insert into activity_logs(st_id,activity_date_time,activity) values(?,?,?)");
                            pst1.setString(1,sess_un);
                            pst1.setString(2,dt);
                            pst1.setString(3,"Checked Contact_us HTML Messages");
                            int x1=pst1.executeUpdate();
            
            while(rs.next())
            {
                ++count;
                out.println("<tr>");
                out.println("<td><h2>"+rs.getString(1)+"</h2></td>");
                out.println("<td>"+rs.getString(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
                out.println("<td>"+rs.getString(5)+"</td>");
                out.println("</tr>");
            }
            if(count==0)
            {   out.println("<tr>");
                out.println("<td colspan=\"5\"><h1>Empty Message Box!!!</h1>");
                out.println("</tr>");
            }
                
            con.close();
        }
                        
        catch(Exception e)
        {
            out.println(e);
        }
        
        
      out.write("\n");
      out.write("         </table>\n");
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
