<%-- 
    Document   : confirm_order
    Created on : 29 Feb, 2020, 10:59:43 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>  
            
            .center
           {
               padding:40px;
              text-align:center;
              
           }
           
           .box{
               width:80%;
               position:absolute;
               left:10%;
               top:10%;
              
              
           }
           
           
           input[type=submit]
           {
               width:30%;
               margin:8px 0;
               padding:15px 4px;
               border:3px solid black;
               background-color:DodgerBlue;
               border-radius:2px;
           }
            
            </style>
    </head>
    <body>
        
        <form name="f1"  action="paymentinv.jsp" method="post">
        <div class="center">
            <div class="box">
        <%   
              
            
        

                Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement();
             
                
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st1=con1.createStatement();
             
                
                ResultSet rs=st.executeQuery("select * from order_1 where id=(select max(id) from order_1)");
                
                
                float gt=0;
                rs.next();
                {
                    ResultSet rs1=st1.executeQuery("select pcost from inv where pname='"+rs.getString(2)+"'");
                     rs1.next();
        
 float qty=rs.getFloat(3);
 float cost=rs1.getFloat(1);
 
     
      
      float total=((cost*qty));
     
     
              
                       %>
              
               
                      <center> <table  width="50%" border="3" rowspan="30" colspan="30" cellpadding="2" cellspacing="5">  
                    <tr><td> <table width="50%"  border="4" rowspan="30" colspan="30" cellpadding="2" cellspacing="5">          
                    <center><h3> CONFIRM YOUR ORDER</h3></center>
                     </table>
                        </td></tr>
                    
                    
                          
                    <tr><td>
                <table width="50%" rowspan="30" colspan="30" cellpadding="2" cellspacing="20">              
   
                    <tr><label>FULL NAME&nbsp;&nbsp;&nbsp;<% out.print(rs.getString(4));%></label></tr>
    
                     
                </table></td></tr>
    
                           
                           
                           <tr><td>  <table  rowspan="20" colspan="20" cellpadding="10" cellspacing="20" >  
                           <tr> DELIVERY ADDRESS<br>
                       
                           <tr><td><label>ADDRESS<% out.print(rs.getString(5));%></label></td></tr>
                           <tr><td> <label>CITY<% out.print(rs.getString(6));%></label></td></tr>
        <tr><td> <label>STATE<% out.print(rs.getString(7));%></label></td></tr>
        <tr><td><label>PINCODE<% out.print(rs.getString(8));%></label></td></tr></table>
        
        <tr><td>  <table width="60%" rowspan="20" colspan="30" cellpadding="15" cellspacing="20" >  
                         <tr>
                             <td><label>PRODUCT NAME&nbsp;&nbsp;<% out.print(rs.getString(2));%></label></td>
                             <td> <label>QUANTITY&nbsp;&nbsp;&nbsp;<%out.print(rs.getString(3));%></label><br></tr></td>
            
                               
                               </table></td></tr>
    
        <tr><td>  <table width="50%" rowspan="20" colspan="20" cellpadding="2" cellspacing="5" >  
                    <tr><td><label>TOTAL&nbsp;&nbsp;&nbsp;<% out.print(total);%></label></td></tr></table>
            </td></tr>
                             
        
 <% }
              %>
              
                       
                          </table> <br><br> 
              <input type="submit"  value="PROCEED TO PAYMENT"></div></div>
                      </form>
    </body>
</html>

                     
                     
                    
                