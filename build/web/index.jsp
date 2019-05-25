<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario</title>
<link rel="stylesheet" href="assets/css/style.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
</head>
<body>
<%
String email=(String)session.getAttribute("email");

//redirect user to home page if already logged in
if(email!=null){
    response.sendRedirect("Panel");
}

String status=request.getParameter("status");

if(status!=null){
    if(status.equals("false")){
        out.print("Incorrect login details!");	           		
    }
    else{
        out.print("Some error occurred!");
    }
}
%>
<div class="login-page">
<%
    if(null!=request.getAttribute("errorMessage")) { %> 
    <div style="margin-bottom: 10px; padding: 10px; border-left: 4px solid #e11111; background: #FFFFFF;"><% out.println(request.getAttribute("errorMessage")); %> </div>
<%  }
%> 
  <div class="form"> 
    <form class="register-form" action="ServletRegistro" method="post" required>
        <input type="text" size="20" placeholder="Nombre" name="nombre" required>
        <input type="text" size="20" placeholder="Apellidos" name="apellidos" required>
        <input type="text" size="20" placeholder="Correo electrónico" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" name="email" required>
        <input type="password" size="20" placeholder="Contraseña" name="password" required>
     
      
      <input type="submit" value="Registrar">
      <p class="message">¿Ya registrado? <a href="#">Iniciar sesión</a></p>
    </form>
    <form action="LoginServlet" method="post" class="login-form">
        
      <input type="text"  name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Correo electrónico" required/>
      <input type="password" name="password" placeholder="Contraseña" required/> 
      <input type="submit" value="Iniciar sesión">
      <p class="message">¿No registrado? <a href="#">Crea una cuenta</a></p>
    </form>
  </div>
 
</div>
    
    
<script>
  $('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});
</script>
</body>
</html>