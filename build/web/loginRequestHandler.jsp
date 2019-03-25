<%@page import="controlador.BeanUsuario"%>
<jsp:useBean id="loginBean" class="controlador.BeanUsuario" scope="session"/>
<jsp:setProperty name="loginBean" property="*"/>
 
<%
String result=Usuario.loginCheck(loginBean);
 
if(result.equals("true")){
	session.setAttribute("email",loginBean.getEmail());
	response.sendRedirect("home.jsp");
}
 
if(result.equals("false")){
	response.sendRedirect("index.jsp?status=false");
}
 
if(result.equals("error")){
    response.sendRedirect("index.jsp?status=error");
}
 
%>