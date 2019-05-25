<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    
    <title>Sistema Docentes</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />
    <meta name="description" content="This is an example dashboard created using build-in elements and components.">
    <meta name="msapplication-tap-highlight" content="no">
    <!--
    =========================================================
    * ArchitectUI HTML Theme Dashboard - v1.0.0
    =========================================================
    * Product Page: https://dashboardpack.com
    * Copyright 2019 DashboardPack (https://dashboardpack.com)
    * Licensed under MIT (https://github.com/DashboardPack/architectui-html-theme-free/blob/master/LICENSE)
    =========================================================
    * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
    -->
<link href="main.css" rel="stylesheet"></head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootswatch/4.1.3/flatly/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <style>
    body { background-color: #f7f7f7; }
    .container { margin: 150px auto; }
</style>
<body>
 <%
 if(session.getAttribute("email")==null || session.getAttribute("email")==" ") //check condition unauthorize user not direct access welcome.jsp page
 {
   response.sendRedirect("index.jsp"); 
 } 
 %>
 <c:if test="${sessionScope.admin != true}">
     <c:redirect url = "index.jsp"/>
 </c:if> 
    <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
        <div class="app-header header-shadow">
            <div class="app-header__logo">
                <img src="http://www.colegioexcelencia.edu.mx/2018/wp-content/uploads/2018/04/colegio_excelencia_logo_300.png" height="40px"/>
                <div class="header__pane ml-auto">
                    <div>
                        <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
            </div>
            <div class="app-header__mobile-menu">
                <div>
                    <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                        <span class="hamburger-box">
                            <span class="hamburger-inner"></span>
                        </span>
                    </button>
                </div>
            </div>
            <div class="app-header__menu">
                <span>
                    <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                        <span class="btn-icon-wrapper">
                            <i class="fa fa-ellipsis-v fa-w-6"></i>
                        </span>
                    </button>
                </span>
            </div>    <div class="app-header__content">
                <div class="app-header-left">
                    <!--
                    <ul class="header-menu nav">
                        <li class="nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-database"> </i>
                                Statistics
                            </a>
                        </li>
                        <li class="btn-group nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-edit"></i>
                                Projects
                            </a>
                        </li>
                        <li class="dropdown nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-cog"></i>
                                Settings
                            </a>
                        </li>
                    </ul>        
                    -->
                </div>
                <div class="app-header-right">
                    <div class="header-btn-lg pr-0">
                        <div class="widget-content p-0">
                            <div class="widget-content-wrapper">
                                <div class="widget-content-left">
                                    <div class="btn-group">
                                        <a data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="p-0 btn">
                                            <c:out value="${sessionScope.email}"/>
                                             <!-- ${sessionScope.admin} -->
                                            <i class="fa fa-angle-down ml-2 opacity-8"></i>
                                        </a>
                                        <div tabindex="-1" role="menu" aria-hidden="true" class="dropdown-menu dropdown-menu-right">
                                            <button type="button" tabindex="0" class="dropdown-item">User Account</button>
                                            <button type="button" tabindex="0" class="dropdown-item">Settings</button>
                                            <h6 tabindex="-1" class="dropdown-header">Header</h6>
                                            <button type="button" tabindex="0" class="dropdown-item">Actions</button>
                                            <div tabindex="-1" class="dropdown-divider"></div>
                                            <a href="logout.jsp" class="dropdown-item">Cerrar sesión</a>
                                        </div>
                                    </div>
                                </div>
                                               <!--
                                <div class="widget-content-left  ml-3 header-user-info">
                                   
                                  
                                    <div class="widget-subheading">
                                        VP People Manager
                                    </div>
                                     
                                </div>
                                    <!--
                                <div class="widget-content-right header-user-info ml-3">
                                    <button type="button" class="btn-shadow p-1 btn btn-primary btn-sm show-toastr-example">
                                        <i class="fa text-white fa-calendar pr-1 pl-1"></i>
                                    </button>
                                </div>
                                    -->
                            </div>
                        </div>
                    </div>        </div>
            </div>
        </div>        
      
        <div class="app-main">
                <div class="app-sidebar sidebar-shadow">
                    <div class="app-header__logo">
                        <div class="logo-src"></div>
                        <div class="header__pane ml-auto">
                            <div>
                                <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                                    <span class="hamburger-box">
                                        <span class="hamburger-inner"></span>
                                    </span>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="app-header__mobile-menu">
                        <div>
                            <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                                <span class="hamburger-box">
                                    <span class="hamburger-inner"></span>
                                </span>
                            </button>
                        </div>
                    </div>
                    <div class="app-header__menu">
                        <span>
                            <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                                <span class="btn-icon-wrapper">
                                    <i class="fa fa-ellipsis-v fa-w-6"></i>
                                </span>
                            </button>
                        </span>
                    </div>
                    
                <%@include file="jspf/menu.jspf"%>
                </div>    
                <div class="app-main__outer">
                    <div class="app-main__inner">
                              
                 
    
                        <input type="search" id="search" class="form-control" placeholder="Filtrar">
                      
                            <div id="root"></div>
                     
                         
                        <div class="pages"></div>  
                    </div>
                </div>
                 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
                <script src="assets/scripts/table-sortable.js"></script>
                <script>
                var data = [
                    <c:forEach var="docente" items="${listaDocentes}">
                    {
                        nombre: '<c:out value="${docente.nombre}"/>',
                        asistencia: <c:out value="${docente.asistencia}"/>,
                        userid: <c:out value="${docente.userid}"/>,
                        
                    },    
                    </c:forEach>

                ]

                var columns = {
                    'nombre': 'Docente',
                    'asistencia': 'Asistencia',
                    'userid': 'Acción'
                }

                var TestData = {
                    data: data,
                    columns: columns
                }

                var table = $('#root').tableSortable({
                    data: TestData.data,
                    columns: TestData.columns,
                    dateParsing: true,
                    processHtml: function(row, key) {
                        if (key === 'asistencia') {
                            if(row[key] == true){
                                return '<div>Asistencia</div>'
                            }
                            if(row[key] == false){
                                return '<div>Falta</div>'
                            } 
                        } 
                        if (key === 'userid') { 
                              return '<a href="Cursos?tarea=asistenciaDocente&userid=' + row[key] + '&horaid='+<%= request.getParameter("horaid") %>+'">Asistencia</a> - <a href="Cursos?tarea=faltaDocente&userid=' + row[key] + '&horaid='+<%= request.getParameter("horaid") %>+'">Falta</a>'
                             
                        }
                        return row[key]
                    },
                    columnsHtml: function(value, key) {
                        return value;
                    },
                    pagination: 10,
                    showPaginationLabel: true,
                    prevText: 'Anterior',
                    nextText: 'Siguiente',
                    searchField: $('#search'),
                    responsive: [
                        {
                            maxWidth: 992,
                            minWidth: 769,
                            columns: TestData.col,
                            pagination: true,
                            paginationLength: 3
                        },
                        {
                            maxWidth: 768,
                            minWidth: 0,
                            columns: TestData.colXS,
                            pagination: true,
                            paginationLength: 2
                        }
                    ]
                })

                    </script>
                <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        </div>
    </div>
<script type="text/javascript" src="assets/scripts/main.js"></script></body>
</html> 