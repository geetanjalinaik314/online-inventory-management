<%-- 
    Document   : printproduct
    Created on : 29 Jan, 2020, 9:53:35 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               
    </head>
    <body>
        <h3><center>PRODUCT DETAILS</center></h3>   
        <table border= "3px solid black" align="center" frame="box" width="50%" rowspan="40%" colspan="30%" cellpadding="20" cellspacing="20" >  
            <tr>
                <td >PRODUCT NAME</td>
                <td>TYPE</td>
                <td>AREA</td>
                <td>COST</td>
                <td>MANUFACTURE</td>
                <td>NUMBER</td>
            </tr>
        
        <%   
              
            
      

                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
             
                
                ResultSet rs=st.executeQuery("select * from product");
              while(rs.next())
                  {
                       %>
              
               
               <tr>
        <td><% out.print(rs.getString(1));%></td>
        <td><%out.print(rs.getString(2));%></td>
        <td><% out.print(rs.getString(3));%></td>
        <td><% out.print(rs.getString(4));%></td>
        <td><% out.print(rs.getString(5));%></td>
        <td><% out.print(rs.getString(6));%></td>
    </tr>
 <% }
              %>
        </table>     
    </body>
</html>
