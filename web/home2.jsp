<%-- 
    Document   : home2
    Created on : 19 Jan, 2020, 8:54:26 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            body{
background-image: url("images/ba.jpg"); 
background-repeat: no-repeat;
background-size: cover;
}







       
              .box1 ul{
   list-style: none;
          width:95%;
        border:1px;
        height:40px;
        padding:10px;
        margin-left:10;
        background: mintcream;
       
        
                                               
    }

    
    .box1 ul li{
        width:15%;
        border:1px;
        height:40px;
        line-height:45px;
       text-align:center;
        float:right;
        align:right;
        font-size:20px;
       
       
    }

    
    .box1 ul li:hover{
        background-color:green;
    }
    
    .box1 ul ul {
        display:none;
        
    }
    
    .box1 ul ul  li {
        width:100%;
        height:55px;
        padding:0px;
        line-height: 20px;
        border:3px solid black;
       
    }
    
    .box1 ul li:hover > ul{
        
        display:block;
    }
        

    .product{
        border:3px solid black;
        max-width:100%;
        line-height:700%;
        padding:50px;
       box-sizing:inherit;
    }

label{
        border:3px solid black;
        max-width:100%;
        line-height:700%;
        padding:35px;
       box-sizing:inherit;
       color: blue;
    }
    
    .new
    {
        column-count: 3;
       column-width: 60%;
        column-height:60px; 
        column-gap: 10px;
        float: left;
    }

   /* .column2{
       column-width:60%;
       column-height:70px;
       flaot:left;
    }
   
    
    .column3{
       column-width:60%;
       column-height:70px;
       flaot:right;
    }
   
    .column{
       column-width:20%;
       column-height:70px;
       flaot:left;
    }*/
   


</style>
    </head>
    <body> 
          
        <h2><font face="Comic Sans MS" size="10">INVENTORY MANAGEMENT</font></h2>
        <h3>We manage your orders and stock here......</h3>
       
    <div class="box1">
       <ul>
            
            <li> <a href="index.jsp" style="text-decoration:none;color:black;" >LOGOUT</a></li> 
            <li> <a href="password.jsp" style="text-decoration:none;color:black;">CHANGE PASSWORD</a></li>
            <li><a href="user.jsp" style="text-decoration:none;color:black;">USER</a></li>
            <li>DASHBOARD</a></li>
            <li> <a href="index.jsp" style="text-decoration:none;color:black;">HOME</a></li>
        </ul>
             
              </div>
        <br>
   
        <div class="new">
        <div class="column">
            <label for="supplier"><img src="images/icon/supplier.png"  width=50  align="center"><a href="supplier.jsp" style="text-decoration:none;color:black;" >ADD SUPPLIER</a></label><br><br><br><br>
            <label for="customer"><img src="images/icon/customer.png"  width=50 align="center"><a href="customer.jsp" style="text-decoration:none;color:black;" >ADD CUSTOMER</a></label><br><br><br><br>
            <label for="new"><img src="images/icon/product.jpg"  width=50 align="center"><a href="productmanagement.jsp" style="text-decoration:none;color:black;" >NEW PRODUCT</a></label><br><br><br><br>
            <label for="product"><img src="images/icon/printp.png"  width=50  align="center"><a href="print.jsp" style="text-decoration:none;color:black;" >PRODUCT AVAILABLE</a></label><br><br><br>
        </div>  
            
            <div class="column3"><label for="order"><img src="images/icon/order.png"  width=50  align="center"><a href="order.jsp" style="text-decoration:none;color:black;" >PLACE ORDER</a></label><br><br><br><br>
                <label for="order2"><img src="images/icon/pswd.png"  width=50 align="center"><a href="user.jsp" style="text-decoration:none;color:black;" >ADD USER</a></label><br><br><br><br>
                <label for="pswd"><img src="images/icon/user-480.png"  width=50  align="center">&nbsp;&nbsp;<a href="password.jsp" style="text-decoration:none;color:black;" >CHANGE PASSWORD   </a>     </label><br><br><br><br>
                <label for="inventory"><img src="images/icon/inventory.png"  width=50  align="center"><a href="inventory.jsp" style="text-decoration:none;color:black;" >INVENTORY</a></label><br><br><br><br>
            <div class="column2">   <img src="images/img1.png"   width=600 height=500  margin-bottom="20px"><br><br><br><br>
            
        </div>
        </div> 
        </div>     
                   
    </body>
</html>
