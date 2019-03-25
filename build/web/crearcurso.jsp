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
<link href="assets/css/calendario.css" rel="stylesheet"></head>
<body>
 <%
 if(session.getAttribute("email")==null || session.getAttribute("email")==" ") //check condition unauthorize user not direct access welcome.jsp page
 {
   response.sendRedirect("index.jsp"); 
 }
 %>
 
 
    <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
        <div class="app-header header-shadow">
            <div class="app-header__logo">
                
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
                </div>    <div class="app-main__outer">
                    <div class="app-main__inner">
                              
                        <div class="app-page-title">
                            <div class="page-title-wrapper">
                                <div class="page-title-heading">
                                    <div class="page-title-icon">
                                        <i class="pe-7s-display1 icon-gradient bg-premium-dark">
                                        </i>
                                    </div>
                                    <div>Crear curso
                                        <div class="page-title-subheading">Wide selection of forms controls, using the Bootstrap 4 code base, but built with React.
                                        </div>
                                    </div>
                                </div> 
                            </div>
                        </div>  
                        <div class="tab-content">
                            <div class="tab-pane tabs-animation fade active show" id="tab-content-0" role="tabpanel">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="main-card mb-3 card">
                                            <div class="card-body"> 
                                                <form class="" action="CrearCurso" method="POST">
                                                    <div class="position-relative form-group">
                                                        <label class="">Nombre del curso</label>
                                                        <input name="nombre" id="exampleEmail" placeholder="Nombre del curso" type="text" class="form-control" required>
                                                    </div>
                                                    <!--
                                                    <div class="position-relative form-group">
                                                        <label for="examplePassword" class="">Fecha de </label>
                                                        <input id="d"  type="date" readonly onclick="calender(this)">
                                                    </div>
                                                    
                                                     
                                                    <div class="position-relative form-group"><label for="exampleText" class="">Text Area</label><textarea name="text" id="exampleText" class="form-control"></textarea></div>
                                                    -->
                                                    <button class="mt-1 btn btn-primary">Crear curso</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div> 
                                </div>
                            </div> 
                            <div class="tab-pane tabs-animation fade" id="tab-content-2" role="tabpanel">
                                <form class="">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="main-card mb-3 card">
                                                <div class="card-body"><h5 class="card-title">Checkboxes</h5>
                                                    <div class="position-relative form-group">
                                                        <div>
                                                            <div class="custom-checkbox custom-control"><input type="checkbox" id="exampleCustomCheckbox" class="custom-control-input"><label class="custom-control-label" for="exampleCustomCheckbox">Check this
                                                                custom checkbox</label></div>
                                                            <div class="custom-checkbox custom-control"><input type="checkbox" id="exampleCustomCheckbox2" class="custom-control-input"><label class="custom-control-label" for="exampleCustomCheckbox2">Or this
                                                                one</label></div>
                                                            <div class="custom-checkbox custom-control"><input type="checkbox" id="exampleCustomCheckbox3" disabled="" class="custom-control-input"><label class="custom-control-label" for="exampleCustomCheckbox3">But
                                                                not this disabled one</label></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="main-card mb-3 card">
                                                <div class="card-body"><h5 class="card-title">Inline</h5>
                                                    <div class="position-relative form-group">
                                                        <div>
                                                            <div class="custom-checkbox custom-control custom-control-inline"><input type="checkbox" id="exampleCustomInline" class="custom-control-input"><label class="custom-control-label" for="exampleCustomInline">An inline custom
                                                                input</label></div>
                                                            <div class="custom-checkbox custom-control custom-control-inline"><input type="checkbox" id="exampleCustomInline2" class="custom-control-input"><label class="custom-control-label" for="exampleCustomInline2">and another one</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="main-card mb-3 card">
                                                <div class="card-body"><h5 class="card-title">Radios</h5>
                                                    <div class="position-relative form-group">
                                                        <div>
                                                            <div class="custom-radio custom-control"><input type="radio" id="exampleCustomRadio" name="customRadio" class="custom-control-input"><label class="custom-control-label" for="exampleCustomRadio">Select
                                                                this custom radio</label></div>
                                                            <div class="custom-radio custom-control"><input type="radio" id="exampleCustomRadio2" name="customRadio" class="custom-control-input"><label class="custom-control-label" for="exampleCustomRadio2">Or
                                                                this one</label></div>
                                                            <div class="custom-radio custom-control"><input type="radio" id="exampleCustomRadio3" disabled="" class="custom-control-input"><label class="custom-control-label" for="exampleCustomRadio3">But not this
                                                                disabled one</label></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="main-card mb-3 card">
                                                <div class="card-body"><h5 class="card-title">Form Select</h5>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="position-relative form-group"><label for="exampleCustomSelect" class="">Custom Select</label><select type="select" id="exampleCustomSelect" name="customSelect" class="custom-select">
                                                                <option value="">Select</option>
                                                                <option>Value 1</option>
                                                                <option>Value 2</option>
                                                                <option>Value 3</option>
                                                                <option>Value 4</option>
                                                                <option>Value 5</option>
                                                            </select></div>
                                                            <div class="position-relative form-group"><label for="exampleCustomMutlipleSelect" class="">Custom Multiple Select</label><select multiple="" type="select" id="exampleCustomMutlipleSelect" name="customSelect" class="custom-select">
                                                                <option value="">Select</option>
                                                                <option>Value 1</option>
                                                                <option>Value 2</option>
                                                                <option>Value 3</option>
                                                                <option>Value 4</option>
                                                                <option>Value 5</option>
                                                            </select></div>
                                                        </div>
                                                        <div class="col-md-6">
                                                            <div class="position-relative form-group"><label for="exampleCustomSelectDisabled" class="">Custom Select Disabled</label><select type="select" id="exampleCustomSelectDisabled" name="customSelect" disabled="" class="custom-select">
                                                                <option value="">Select</option>
                                                                <option>Value 1</option>
                                                                <option>Value 2</option>
                                                                <option>Value 3</option>
                                                                <option>Value 4</option>
                                                                <option>Value 5</option>
                                                            </select></div>
                                                            <div class="position-relative form-group"><label for="exampleCustomMutlipleSelectDisabled" class="">Custom Multiple Select Disabled</label><select multiple="" type="select" id="exampleCustomMutlipleSelectDisabled" name="customSelect" disabled="" class="custom-select">
                                                                <option value="">Select</option>
                                                                <option>Value 1</option>
                                                                <option>Value 2</option>
                                                                <option>Value 3</option>
                                                                <option>Value 4</option>
                                                                <option>Value 5</option>
                                                            </select></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                <script type="text/javascript" src="assets/scripts/calendario.js"></script>
        </div>
    </div>
    <script type="text/javascript" src="assets/scripts/main.js"></script>
</body>
</html>
