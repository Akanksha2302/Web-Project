

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String un,pd,type;
            un=request.getParameter("t1");
            pd=request.getParameter("t2");
          
            session.setAttribute("s1", un);
            session.setAttribute("s2", pd);
  
            response.sendRedirect("session3.jsp");
     %>
    </body>
</html>
