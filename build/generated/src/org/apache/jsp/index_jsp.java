package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Registro Usuario</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");

String email=(String)session.getAttribute("email");

//redirect user to home page if already logged in
if(email!=null){
    response.sendRedirect("Bienvenido.jsp");
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

      out.write("\n");
      out.write("<div class=\"login-page\">\n");

    if(null!=request.getAttribute("errorMessage")) { 
      out.write(" \n");
      out.write("    <div style=\"margin-bottom: 10px; padding: 10px; border-left: 4px solid #e11111; background: #FFFFFF;\">");
 out.println(request.getAttribute("errorMessage")); 
      out.write(" </div>\n");
  }

      out.write(" \n");
      out.write("  <div class=\"form\"> \n");
      out.write("    <form class=\"register-form\" action=\"ServletRegistro\" method=\"post\" required>\n");
      out.write("        <input type=\"text\" size=\"20\" placeholder=\"Nombre\" name=\"nombre\" required>\n");
      out.write("        <input type=\"text\" size=\"20\" placeholder=\"Apellidos\" name=\"apellidos\" required>\n");
      out.write("        <input type=\"text\" size=\"20\" placeholder=\"Correo electrónico\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" name=\"email\" required>\n");
      out.write("        <input type=\"password\" size=\"20\" placeholder=\"Contraseña\" name=\"password\" required>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("      <input type=\"submit\" value=\"Registrar\">\n");
      out.write("      <p class=\"message\">¿Ya registrado? <a href=\"#\">Iniciar sesión</a></p>\n");
      out.write("    </form>\n");
      out.write("    <form action=\"LoginServlet\" method=\"post\" class=\"login-form\">\n");
      out.write("        \n");
      out.write("      <input type=\"text\"  name=\"email\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" placeholder=\"Correo electrónico\" required/>\n");
      out.write("      <input type=\"password\" name=\"password\" placeholder=\"Contraseña\" required/> \n");
      out.write("      <input type=\"submit\" value=\"Iniciar sesión\">\n");
      out.write("      <p class=\"message\">¿No registrado? <a href=\"#\">Crea una cuenta</a></p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("  $('.message a').click(function(){\n");
      out.write("   $('form').animate({height: \"toggle\", opacity: \"toggle\"}, \"slow\");\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
