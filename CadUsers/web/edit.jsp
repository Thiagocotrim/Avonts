<%-- 
    Document   : staff
    Created on : 20/03/2017, 14:42:07
    Author     : Familia
--%>

<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%
            ArrayList<User> listaUsuarios = (ArrayList<User>) session.getAttribute("listarUsers");
        %>

        <title>Bem-vindo ao Group</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="icon" type="image/png" href="img/tea-cup.png" media="all" />
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="scripts/css/estilo.css" media="all" />
        <link rel="stylesheet" type="text/css" href="scripts/css/estilo_singup.css" media="all" />

        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="lib/materialize/css/materialize.min.css"  media="screen,projection"/>
    </head>

    <body>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="lib/materialize/js/materialize.min.js"></script>


        <header>
            <nav class="transparent black-text" style="height: 200px; background-image: linear-gradient(330deg,#0098ce,#1cb5b4);">
                <div class="nav-wrapper container">

                    <div id="header-mobile-links" class=" row center hide-on-large-only">
                        <div class="col s4">
                            <a href="index.html"><font><font>Começar</font></font></a>
                        </div>
                        <div class="col s4">
                            <a href="/blog"><font><font>Equipe</font></font></a>
                        </div>
                        <div class="col s4">

                            <a class="modal-trigger" href="#login-modal"><font><font>Dashboard</font></font></a>

                        </div>
                        <div class="col s12 spacer"></div>
                    </div>

                    <ul class="right hide-on-med-and-down desktop-header-links">

                        <li><a href="index.html"><font><font>Começar</font></font></a></li>
                        <li><a class="modal-trigger" href="#login-modal"><font><font>Equipe</font></font></a></li>
                        <li><a class="modal-trigger" href="#login-modal"><font><font>Dashboard</font></font></a></li>

                    </ul>
                </div>
            </nav>
        </header>

        <div class="main">
            <div class="container">
                <div class="singup  col s12 center-align">

                    <div class="row">
                        <div class="col s12 center-align">
                            <h3>É simples e rapido!</h3>
                            <h6>Gerencie as informações dos colaboradores da sua equipe.</h6>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12 center-align">
                            <form>
                                <div class="col s12">

                                    <div class="staff-info" style="text-align: justify">

                                        <div class="row">
                                            <div class="col s12 center-align">
                                                <input type="text" name="fNome" placeholder="Primeiro nome" />
                                            </div>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="col s12 center-align">
                                                <input type="text" name="fNome" placeholder="Segundo nome" />
                                            </div>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="col s12 center-align">
                                                <input type="text" name="fNome" placeholder="Sobre você" />
                                            </div>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="col s12 center-align">
                                                <input class="waves-effect waves-light btn btn-large white-text hero-btn" style="background-image: linear-gradient(330deg,#0098ce,#1cb5b4);" type="submit" name="fNome" value="Salvar alterações" />
                                            </div>
                                        </div>

                                    </div>

                                </div>

                            </form>
                        </div>
                    </div>

                </div>
            </div>

        </div>
    </body>
</html>

