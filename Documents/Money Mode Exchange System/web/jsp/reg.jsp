<%@page import="java.util.Date" contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="conne.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            function msg_sent(){
                alert("Registration Successful"); }
        </script>
        
        <script type="text/javascript">
            window.onload=msg_sent();
        </script>
        <meta http-equiv="Refresh" content="1; url=/Money_Mode_Exchange_System/signin.html">
        <title>Registration!!!</title>
    </head>
    <%
        PreparedStatement pst,pst1;
        String gender,password,name,email,address,UPI,mobile,st_id,subscription,dtt;
        name=request.getParameter("t1");
        email=request.getParameter("t2");
        address=request.getParameter("t3");
        mobile=request.getParameter("t4");
        gender=request.getParameter("t5");
        subscription=request.getParameter("t6");
        password=request.getParameter("t7");
        st_id=request.getParameter("t10");
        UPI=request.getParameter("t9");
        
        Date d=new Date();
        dtt= (d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate()+" "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();       
        
        try{
                               
            pst=con.prepareStatement("insert into users(name,password,gender,email,mobile,UPI,address,st_id,subscription,Date_reg) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,password);
            pst.setString(3,gender);
            pst.setString(4,email);
            pst.setString(5,mobile);
            pst.setString(6,UPI);
            pst.setString(7,address);
            pst.setString(8,st_id);
            pst.setString(9,subscription);
            pst.setString(10,dtt);
            int x=pst.executeUpdate();
            if(x==1)
            {
                pst1=con.prepareStatement("insert into activity_logs(st_id,activity_date_time,activity) values(?,?,?)");
                pst1.setString(1,st_id);
                pst1.setString(2,dtt);
                pst1.setString(3,"Registration");
                int x1=pst1.executeUpdate();
                
            }
        }
        catch(Exception e)
        {
            out.println("Please check the error "+e.getMessage());
        }
        %>
</html>
