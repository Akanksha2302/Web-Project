
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session 3</title>
    </head>
    <body>
            <%
        String un,pd;
        PreparedStatement pst;
        un=(String)session.getAttribute("s1");
        pd=(String)session.getAttribute("s2");

        try{
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/MMSE","root","password");
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery("Select user,pass,type from login");
            
            while(rs.next())
            {
                if(un.equals(rs.getString(1)) && pd.equals(rs.getString(2)) && "Admin".equals(rs.getString(3)))
                        {
                                                   
                            response.sendRedirect("ADMIN.jsp");
                         
                            }
                if(un.equals(rs.getString(1)) && pd.equals(rs.getString(2)) && "user".equals(rs.getString(3)))
                        {
                                                   
                            response.sendRedirect("USER.jsp");
                         
                            }
                
            }
            
            
            con.close();
        }
        catch(Exception e)
        {
            out.println(e);
        }
        
        %>
    </body>
</html>
