package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cursos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jspf/menu.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_url_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_redirect_url_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"en\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\n");
      out.write("    \n");
      out.write("    <title>Sistema Docentes</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"This is an example dashboard created using build-in elements and components.\">\n");
      out.write("    <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("    <!--\n");
      out.write("    =========================================================\n");
      out.write("    * ArchitectUI HTML Theme Dashboard - v1.0.0\n");
      out.write("    =========================================================\n");
      out.write("    * Product Page: https://dashboardpack.com\n");
      out.write("    * Copyright 2019 DashboardPack (https://dashboardpack.com)\n");
      out.write("    * Licensed under MIT (https://github.com/DashboardPack/architectui-html-theme-free/blob/master/LICENSE)\n");
      out.write("    =========================================================\n");
      out.write("    * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n");
      out.write("    -->\n");
      out.write("<link href=\"main.css\" rel=\"stylesheet\"></head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.1.3/flatly/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    <style>\n");
      out.write("    body { background-color: #f7f7f7; }\n");
      out.write("    .container { margin: 150px auto; }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write(" ");

 if(session.getAttribute("email")==null || session.getAttribute("email")==" ") //check condition unauthorize user not direct access welcome.jsp page
 {
   response.sendRedirect("index.jsp"); 
 } 
 
      out.write('\n');
      out.write(' ');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("    <div class=\"app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header\">\n");
      out.write("        <div class=\"app-header header-shadow\">\n");
      out.write("            <div class=\"app-header__logo\">\n");
      out.write("                \n");
      out.write("                <div class=\"header__pane ml-auto\">\n");
      out.write("                    <div>\n");
      out.write("                        <button type=\"button\" class=\"hamburger close-sidebar-btn hamburger--elastic\" data-class=\"closed-sidebar\">\n");
      out.write("                            <span class=\"hamburger-box\">\n");
      out.write("                                <span class=\"hamburger-inner\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"app-header__mobile-menu\">\n");
      out.write("                <div>\n");
      out.write("                    <button type=\"button\" class=\"hamburger hamburger--elastic mobile-toggle-nav\">\n");
      out.write("                        <span class=\"hamburger-box\">\n");
      out.write("                            <span class=\"hamburger-inner\"></span>\n");
      out.write("                        </span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"app-header__menu\">\n");
      out.write("                <span>\n");
      out.write("                    <button type=\"button\" class=\"btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav\">\n");
      out.write("                        <span class=\"btn-icon-wrapper\">\n");
      out.write("                            <i class=\"fa fa-ellipsis-v fa-w-6\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </button>\n");
      out.write("                </span>\n");
      out.write("            </div>    <div class=\"app-header__content\">\n");
      out.write("                <div class=\"app-header-left\">\n");
      out.write("                    <!--\n");
      out.write("                    <ul class=\"header-menu nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"nav-link\">\n");
      out.write("                                <i class=\"nav-link-icon fa fa-database\"> </i>\n");
      out.write("                                Statistics\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"btn-group nav-item\">\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"nav-link\">\n");
      out.write("                                <i class=\"nav-link-icon fa fa-edit\"></i>\n");
      out.write("                                Projects\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown nav-item\">\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"nav-link\">\n");
      out.write("                                <i class=\"nav-link-icon fa fa-cog\"></i>\n");
      out.write("                                Settings\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>        \n");
      out.write("                    -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"app-header-right\">\n");
      out.write("                    <div class=\"header-btn-lg pr-0\">\n");
      out.write("                        <div class=\"widget-content p-0\">\n");
      out.write("                            <div class=\"widget-content-wrapper\">\n");
      out.write("                                <div class=\"widget-content-left\">\n");
      out.write("                                    <div class=\"btn-group\">\n");
      out.write("                                        <a data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" class=\"p-0 btn\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                             <!-- ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" -->\n");
      out.write("                                            <i class=\"fa fa-angle-down ml-2 opacity-8\"></i>\n");
      out.write("                                        </a>\n");
      out.write("                                        <div tabindex=\"-1\" role=\"menu\" aria-hidden=\"true\" class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                            <button type=\"button\" tabindex=\"0\" class=\"dropdown-item\">User Account</button>\n");
      out.write("                                            <button type=\"button\" tabindex=\"0\" class=\"dropdown-item\">Settings</button>\n");
      out.write("                                            <h6 tabindex=\"-1\" class=\"dropdown-header\">Header</h6>\n");
      out.write("                                            <button type=\"button\" tabindex=\"0\" class=\"dropdown-item\">Actions</button>\n");
      out.write("                                            <div tabindex=\"-1\" class=\"dropdown-divider\"></div>\n");
      out.write("                                            <a href=\"logout.jsp\" class=\"dropdown-item\">Cerrar sesión</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                               <!--\n");
      out.write("                                <div class=\"widget-content-left  ml-3 header-user-info\">\n");
      out.write("                                   \n");
      out.write("                                  \n");
      out.write("                                    <div class=\"widget-subheading\">\n");
      out.write("                                        VP People Manager\n");
      out.write("                                    </div>\n");
      out.write("                                     \n");
      out.write("                                </div>\n");
      out.write("                                    <!--\n");
      out.write("                                <div class=\"widget-content-right header-user-info ml-3\">\n");
      out.write("                                    <button type=\"button\" class=\"btn-shadow p-1 btn btn-primary btn-sm show-toastr-example\">\n");
      out.write("                                        <i class=\"fa text-white fa-calendar pr-1 pl-1\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                                    -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("      \n");
      out.write("        <div class=\"app-main\">\n");
      out.write("                <div class=\"app-sidebar sidebar-shadow\">\n");
      out.write("                    <div class=\"app-header__logo\">\n");
      out.write("                        <div class=\"logo-src\"></div>\n");
      out.write("                        <div class=\"header__pane ml-auto\">\n");
      out.write("                            <div>\n");
      out.write("                                <button type=\"button\" class=\"hamburger close-sidebar-btn hamburger--elastic\" data-class=\"closed-sidebar\">\n");
      out.write("                                    <span class=\"hamburger-box\">\n");
      out.write("                                        <span class=\"hamburger-inner\"></span>\n");
      out.write("                                    </span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"app-header__mobile-menu\">\n");
      out.write("                        <div>\n");
      out.write("                            <button type=\"button\" class=\"hamburger hamburger--elastic mobile-toggle-nav\">\n");
      out.write("                                <span class=\"hamburger-box\">\n");
      out.write("                                    <span class=\"hamburger-inner\"></span>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"app-header__menu\">\n");
      out.write("                        <span>\n");
      out.write("                            <button type=\"button\" class=\"btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav\">\n");
      out.write("                                <span class=\"btn-icon-wrapper\">\n");
      out.write("                                    <i class=\"fa fa-ellipsis-v fa-w-6\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </button>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                ");
      out.write("\n");
      out.write(" \n");
      out.write("<div class=\"scrollbar-sidebar\">\n");
      out.write("    <div class=\"app-sidebar__inner\">\n");
      out.write("        <ul class=\"vertical-nav-menu\">\n");
      out.write("            <li class=\"app-sidebar__heading\">Inicio</li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"Bienvenido.jsp\">\n");
      out.write("                    <i class=\"metismenu-icon pe-7s-home\"></i>\n");
      out.write("                    Inicio\n");
      out.write("                </a>\n");
      out.write("            </li> \n");
      out.write("            <li  >\n");
      out.write("                <a href=\"Control?tarea=docentes\">\n");
      out.write("                    <i class=\"metismenu-icon pe-7s-users\"></i>\n");
      out.write("                    Docentes\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"metismenu-icon pe-7s-display2\"></i>\n");
      out.write("                    Cursos\n");
      out.write("                    <i class=\"metismenu-state-icon pe-7s-angle-down caret-left\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Control?tarea=cursos\">\n");
      out.write("                            <i class=\"metismenu-icon\"></i>\n");
      out.write("                            Ver cursos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Control?tarea=crearcurso\">\n");
      out.write("                            <i class=\"metismenu-icon\">\n");
      out.write("                            </i>Crear cursos\n");
      out.write("                        </a>\n");
      out.write("                    </li> \n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li  >\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"metismenu-icon pe-7s-graph2\"></i>\n");
      out.write("                    Reportes\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li  >\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"metismenu-icon pe-7s-cup\"></i>\n");
      out.write("                    Certificados\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"app-main__outer\">\n");
      out.write("                    <div class=\"app-main__inner\">\n");
      out.write("                              \n");
      out.write("                 \n");
      out.write("    \n");
      out.write("                        <input type=\"search\" id=\"search\" class=\"form-control\" placeholder=\"Filtrar\">\n");
      out.write("                        <div id=\"root\"></div>\n");
      out.write("                        <div class=\"pages\"></div> \n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("                <script src=\"assets/scripts/table-sortable.js\"></script>\n");
      out.write("                <script>\n");
      out.write("                var data = [\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                ]\n");
      out.write("\n");
      out.write("                var columns = {\n");
      out.write("                    'cursoid': 'CursoID',\n");
      out.write("                    'userid': 'UserID',\n");
      out.write("                    'nombre': 'Nombre curso',\n");
      out.write("                    'fechahora': 'Curso creado', \n");
      out.write("                    'agregarhoras': 'Acciones',\n");
      out.write("                    'url': ''\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var TestData = {\n");
      out.write("                    data: data,\n");
      out.write("                    columns: columns\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var table = $('#root').tableSortable({\n");
      out.write("                    data: TestData.data,\n");
      out.write("                    columns: TestData.columns,\n");
      out.write("                    dateParsing: true,\n");
      out.write("                    processHtml: function(row, key) {\n");
      out.write("                        if (key === 'avatar_url') {\n");
      out.write("                            return '<a href=\"' + row[key] + '\" target=\"_blank\">View Avatar</a>'\n");
      out.write("                        }\n");
      out.write("                        if (key === 'url') {\n");
      out.write("                            return '<a href=\"#\" target=\"_blank\">Eliminar</a>'\n");
      out.write("                        }\n");
      out.write("                        if (key === 'agregarhoras:') {\n");
      out.write("                            return '<a href=\"#\" target=\"_blank\">Agregar</a>'\n");
      out.write("                        }\n");
      out.write("                        if (key === 'site_admin' && row[key]) {\n");
      out.write("                            return '<span class=\"btn btn-warning btn-sm\">Admin</span>'\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        return row[key]\n");
      out.write("                    },\n");
      out.write("                    columnsHtml: function(value, key) {\n");
      out.write("                        return value;\n");
      out.write("                    },\n");
      out.write("                    pagination: 10,\n");
      out.write("                    showPaginationLabel: true,\n");
      out.write("                    prevText: 'Anterior',\n");
      out.write("                    nextText: 'Siguiente',\n");
      out.write("                    searchField: $('#search'),\n");
      out.write("                    responsive: [\n");
      out.write("                        {\n");
      out.write("                            maxWidth: 992,\n");
      out.write("                            minWidth: 769,\n");
      out.write("                            columns: TestData.col,\n");
      out.write("                            pagination: true,\n");
      out.write("                            paginationLength: 3\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            maxWidth: 768,\n");
      out.write("                            minWidth: 0,\n");
      out.write("                            columns: TestData.colXS,\n");
      out.write("                            pagination: true,\n");
      out.write("                            paginationLength: 2\n");
      out.write("                        }\n");
      out.write("                    ]\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                    </script>\n");
      out.write("                <script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<script type=\"text/javascript\" src=\"assets/scripts/main.js\"></script></body>\n");
      out.write("</html> ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.admin != true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("     ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write(' ');
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_redirect_0.setUrl("index.jsp");
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_url_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("curso");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listaCursos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    {\n");
          out.write("                        cursoid: '");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("',\n");
          out.write("                        userid: '");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("',\n");
          out.write("                        nombre: '");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("',\n");
          out.write("                        fechahora: '");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("', \n");
          out.write("                        agregarhoras: 'www.google.com',\n");
          out.write("                        url: 'www.google.com'\n");
          out.write("                    },    \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curso.cursoid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curso.userid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curso.nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${curso.fechahora}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
