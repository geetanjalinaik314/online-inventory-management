
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
        <script>
            
           
    </head>
    <body>
        
        <%
            try
            {
                  Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
                
                String u=request.getParameter("user");
                String p=request.getParameter("password");
                
                 int i=st.executeUpdate("insert into adminlogin(username,password) values('"+u+"','"+p+"')");
                     
                if(i>0)
                {
                   
                    response.sendRedirect("home2.jsp");
                }
                
                else
                {
                    out.print("error");
                    //response.sendRedirect("adminlogin.jsp");
                }
                
            }
                
        
        catch(Exception e)
        {
            out.print(e);
        }
            %>
                
                
            
    </body>
</html>
