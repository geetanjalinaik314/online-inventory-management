<%-- 
    Document   : supplier
    Created on : 2 Feb, 2020, 9:47:34 PM
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
                if(document.f4.sname.value=="")
                {
                    alert("Please enter supplier ");
                    return false;
                }
                
                if(document.f4.snumber.value=="")
                {
                    alert("Please enter snumber ");
                    return false;
                }
                
        alert("Record inserted succcessfully\nnew supplier added");
                
                return true;
            }
           </script> 
        <style>
            
            
            body{
                    
                     background-repeat: no-repeat;
                     background-size: cover;
                }
                
                
           input[type=text] {
                         width: 30%;
                         margin-bottom: 20px;
                         padding: 12px;
                         border: 1px solid black;
                         border-radius: 3px;
                 }
                 label{
		           font-size:20px;
		           font-color:black;
	        }
			


            input[type=submit] {
                          width: 20%;
                          margin-bottom: 20px;
                          padding: 12px;
                          border: 1px solid #ccc;
                          border-radius: 15px;
                          background-color: limegreen;
                  }
                  
            form {
                         width: 80%;
                         padding: 20px;
                         border-radius: 6px;
                         
                         box-shadow: 0 0 8px  #669999; 
            }    
            
            
            .banner {
                     position: relative;
                     height: 400px;
                     background-image: url("images/supplier.webp");  
                     background-size:cover;
                     display: flex;
                     justify-content: center;
                     align-items: center;
                     text-align: center;
              }		 
            
            
        </style>
    </head>
    <body>        
        <div class="box1">
            <center><form name="f4" action="insertsupplier.jsp" method="post"  onsubmit="return validate()">
             <div class="banner">
          <h1><font size="50px" color="black">New Supplier Details</font></h1>
             </div><br><br>
		
           <label class="font">Supplier Name</label>
           <input type="text" pattern="[A-Za-z]+" name="sname" class="form-control" ><br> <br>
               
              <label class="font">Supplier Number</label>
              <input type="text" name="snumber" class="form-control"  ><br> <br> 
               
            <label class="font">Product Supplied</label>
            <input type="text" name="supplied" class="form-control" ><br>  <br>
             
           
            <label  class="font">Address</label>
            <input type="text"  name="saddress" class="form-control" ><br><br>
           
            <label  class="font">Contact Number</label>            
            <input type="text"  name="contact" class="form-control" ><br><br>
              
           
            
            
                         <input type="submit"  value="SUBMIT">
            
                  
                  
        </form></center>
        </div>
    </body>
</html>

    
