<%-- 
    Document   : adminlogin
    Created on : 15 Jan, 2020, 5:25:31 PM
    Author     : hp
--%>

<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin login</title>
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
               background-image:linear-gradient(95deg,#f3dbcf,white,#f3dbcf);
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
        <h1>LOG IN INTO YOUR ACCOUNT</h1>
        <form name="f1" method="post" action="adminlogin2.jsp" onsubmit="return validatelogin()">
            <img src="images/user4.png" width="160"><br><br>
            <label for="user">USERNAME</label>&nbsp;&nbsp;<input type="text" name="user"/><br><br>
            <label for="pswd"> PASSWORD</label>&nbsp;&nbsp;<input type="password" name="password"/><br><br>
            <input type="submit"   value="LOGIN"/>
        </form></div></div>
        
        
        <%
            if(request.getParameter("m")!=null)
            {                
               if(request.getParameter("m").equals("3"))
            {  %>                         
                <label for="error"><% out.print("INCORRECT USERNAME AND PASSWORD");%></label>
                   <%}

            }
                
                      
            %>
    </body>
</html>
