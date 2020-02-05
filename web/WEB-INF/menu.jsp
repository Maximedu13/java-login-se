
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Direct Molto</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index">Dashboard<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="planning">Gestion du planning</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Gestion des voitures</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Gestion des employés</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Gestion des réparations</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="contact">Contact</a>
            </li>
            <% String connected = (String) request.getAttribute("connected"); %>
            <% if(connected != "true"){ %>
            <li class="nav-item">
                <a class="btn btn-outline-success my-2 my-sm-0" href="connexion" type="submit">Connexion</a>
            </li>
            <% } %>
            <% if(connected == "true"){ %>
            <li class="nav-item">
                <a class="btn btn-outline-success my-2 my-sm-0" href="logout" type="submit">Déconnexion</a>
            </li>
            <% } %>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Rechercher quelque chose" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Go !</button>
        </form>
    </div>
</nav>
<br>