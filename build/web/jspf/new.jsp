<%-- 
    Document   : Bienvenido
    Created on : 18/03/2019, 04:26:59 PM
    Author     : David
--%>

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
<body>
<%
if(session.getAttribute("email")==null || session.getAttribute("email")==" ")  {
    response.sendRedirect("index.jsp"); 
}
%> 
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
        </div>    
        <div class="app-header__content">
            <div class="app-header-left"> 
            </div>
            <div class="app-header-right">
                <div class="header-btn-lg pr-0">
                    <div class="widget-content p-0">
                        <div class="widget-content-wrapper">
                            <div class="widget-content-left">
                                <div class="btn-group">
                                    <a data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="p-0 btn"> 
                                        <c:out value="${sessionScope.email}"/>
                                         ${sessionScope.admin}
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
                        </div>
                    </div>
                </div>        
            </div>
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
            <jsp:include page="/jspf/menu.jspf"></jsp:include>
        </div>  
        <div class="app-main__outer">
            <div class="app-main__inner">  
                <c:if test="${sessionScope.admin == true}">              
                    <div class="row">
                        <div class="col-md-6 col-xl-4">
                            <div class="card mb-3 widget-content">
                                <div class="widget-content-outer">
                                    <div class="widget-content-wrapper">
                                        <div class="widget-content-left">
                                            <div class="widget-heading">Cursos totales</div> 
                                        </div>
                                        <div class="widget-content-right">
                                            <div class="widget-numbers text-success">  
                                                <c:out value="${listaCursosCount}"/> 
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-xl-4">
                            <div class="card mb-3 widget-content">
                                <div class="widget-content-outer">
                                    <div class="widget-content-wrapper">
                                        <div class="widget-content-left">
                                            <div class="widget-heading">Docentes registrados</div> 
                                        </div>
                                        <div class="widget-content-right">
                                            <div class="widget-numbers text-success">
                                                <c:out value="${listaDocentesCount}"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:if>  
            </div>
        </div> 
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
    </div>
</div>
<script type="text/javascript" src="assets/scripts/main.js"></script></body>
</html>
