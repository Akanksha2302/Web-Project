
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            function msg_sent(){
                alert("You are Subscribed!!!"); }
        </script>
        
        <script type="text/javascript">
            window.onload=msg_sent();
        </script>
        <meta http-equiv="Refresh" content="1; url=/Money_Mode_Exchange_System/index.html">
        <title>Subscribe</title>
    </head>
    <body>
        <%
             PreparedStatement pst;
        String em;
        em=request.getParameter("t1");
            try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/MMSE","root","password"); 
		
        pst=con.prepareStatement("insert into news_subs values(?);");
			pst.setString(1,em);	
			int x=pst.executeUpdate();
	        }
                catch(Exception x)
		{
			if(x.getMessage().contains("Duplicate"))
                        {
                            out.println("You have subscribed before");
                        }
                        else
                        {
                            out.println(x.getMessage());
                        }
		}
        %>
    </body>
</html>
