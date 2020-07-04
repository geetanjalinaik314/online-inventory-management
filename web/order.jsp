<%-- 
    Document   : order
    Created on : 16 Feb, 2020, 12:08:45 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <style>
            
            
            body{
background:url("images/inv2.jpg");
background-repeat: no-repeat;
background-size: cover;
}
           input[type=text] {
  width: 50%;
  height: 20%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}



input[type=submit] {
  width: 30%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 15px;
  background-color: limegreen;
}


label {
    font-size: 20px;
    clear:left;
    text-align:right;
    padding-right:10px;
}


form {
                     background-color:whitesmoke;
                     padding: 20px;
                     border-radius: 6px;
                     width:40%;
                     box-shadow: 0 0 8px  #669999; 
            }

   .span
   {
       font-size:12px;
      
   }
     
   .new{
       border:3px dotted black;
       width:50%;
       line-height:1;
       background-color:lightgrey;
   }
  
   
   
        </style>
    </head>
    <body>
    <center>
        <form name="f6" action="placeorder.jsp" method="post">
        <h1>ENTER ORDER DETAILS</h1>
        
            <label for="product"> Select Product Name</label>
             <%

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory","root","");
                Statement st=con.createStatement(); 
                
                 
               
                ResultSet rs3=st.executeQuery("select pname from product");
                %>
           
               
                 <select name="pname"  style="width:400px; height:30px;">
                   <%
                     while(rs3.next())
                {
                    %><option><%out.print(rs3.getString("pname"));%></option><%
                }
                    %>
                </select>
               <br>
               <br><label for="quantity">Quantity</label><input type="text" name="qty" required>
                 
     
              
              
            <h2>Delivery Address</h2>
            <label for="fname"><img src="images/icon/user-480.png"  width="25"><span> Full Name</span></label>
            <input type="text"  name="cname" placeholder="John M. Doe" required><br>
            <label for="email"><img src="images/icon/download.png" width="25"> Email</label>
            <input type="text"  name="email" placeholder="john@example.com"><br>
            <label for="adr"><img src="images/icon/images.png" width="25"> Address</label>
            <input type="text"  name="area" placeholder="542 W. 15th Street" required><br>
            <label for="city"><img src="images/icon/download (1).png" width="25"> City</label>
            <input type="text" id="city" name="city" placeholder="New York"><br>
           
            <label for="state"><img src="images/icon/download (1).png" width="25">State</label>
                <input type="text"  name="state" placeholder="NY" required><br>
           
                <label for="zip">Zip</label>
                <input type="text"  name="pincode" placeholder="10001" required><br>
           
            
                <br>
         
       
        
        <input type="submit" value="Continue to checkout" >
     
  
 
        
        </form>
    </center>
    </body>
</html>