<%-- 
    Document   : password
    Created on : 4 Mar, 2020, 9:31:55 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
        
            
            <script>
            function validate()
            {
                if(document.f1.user.value=="")
                {
                    alert("Please enter Username ");
                    return false;
                }
                
                if(document.f1.npassword.value!=document.f1.cpassword.value)
                {
                    alert("Password not matching ");
                    return false;
                }
                
                return true;
            }
           </script> 
           
           <style>
        .center
           {
               padding:50px;
              text-align:center;
              
           }
           
           .box{
               width:60%;
               position:absolute;
               left:20%;
               top:15%;
              
              
           }
           input
           {
               width:40%;
               margin:8px 0;
               padding:10px 4px;
               border:3px solid black;
           }
           
           input[type=submit]
           {
               width:20%;
               margin:8px 0;
               padding:10px 4px;
               border:3px solid black;
               background-color: green;
               border-radius:30px;
           }
           
           body
           {
               background-color: lightslategrey;
               background-repeat:no-repeat;
               background-size:100% 100%;
               background-attachment:fixed;
               
           }
           
           label
           {
               
                font-family: Comic Sans MS;
                font-size: 20px;
            }
           
           </style>
    </head>
    <body>
        <div class="box">
    <div class="center">
        <h1>CHANGE PASSWORD</h1>
        <form name="f1" method="get" action="password2.jsp"  onsubmit="return validate()">
           <img src="images/user4.png" width="160"><br><br>
           <label for="user">USER NAME</label>&nbsp;&nbsp;<input type="text" name="user"/><br><br>
            <label for="user">NEW PASSWORD</label>&nbsp;&nbsp;<input type="password" name="npassword"/><br><br>
            <label for="pswd"> CONFIRM PASSWORD</label>&nbsp;&nbsp;<input type="password" name="cpassword"/><br><br>
            <input type="submit"   value="change"/>
        </form></div></div>
    </body>
</html>

    
