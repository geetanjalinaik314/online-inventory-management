<%-- 
    Document   : user
    Created on : 6 Mar, 2020, 4:57:21 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            function validatelogin()
            {
                if(document.f1.user.value=="")
                {
                    alert("Please enter Username ");
                    return false;
                }
                
                if(document.f1.password.value=="")
                {
                    alert("Please enter password ");
                    return false;
                }
                alert("Record inserted succcessfully\nwelcome user");
                
                return true;
            }
           </script> 
           <style>
               
           .center
           {
               padding:40px;
              text-align:center;
              
           }
           
           .box{
               width:60%;
               position:absolute;
               left:20%;
               top:10%;
              
              
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
                background-image:url("images/bg3.jpeg");
               background-repeat:no-repeat;
               background-size:100% 100%;
               background-attachment:fixed;
               
           }
           
           label
           {
               
                font-family: Comic Sans MS;
                font-size: 20px;
            }
            
            form {
                     width: 80%;
                     padding: 20px;
                     border-radius: 6px;
                
                                }
           
           </style>
    </head>
    <body>
        <div class="box">
    <div class="center">
        <form name="f1" method="get" action="user2.jsp" onsubmit="return validatelogin()">
        <h1>REGISTER FOR NEW USER</h1>
        
            <img src="images/user4.png" width="160"><br><br>
            <label for="name">FULL NAME</label>&nbsp;&nbsp;<input type="text" name="name"><br><br>
            <label for="user">USERNAME</label>&nbsp;&nbsp;<input type="text" name="user"/><br><br>
            <label for="pswd"> PASSWORD</label>&nbsp;&nbsp;<input type="password" name="password"/><br><br>
            <label for="pswd">CONFIRM PASSWORD</label>&nbsp;&nbsp;<input type="password" name="cpassword"/><br><br>
            <input type="submit"   value="LOGIN"/>
        </form></div></div>
   
    </body>
</html>
