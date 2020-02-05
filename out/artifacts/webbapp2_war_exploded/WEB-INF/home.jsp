<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 27/01/2020
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "head.jsp"  %>
<%@ include file = "menu.jsp"  %>
<body>
<figure class="figure">
    <img src="https://svgsilh.com/svg/2113962.svg" class="figure-img img-fluid rounded mx-auto d-block" style="width: 20%"  alt="A generic square placeholder image with rounded corners in a figure.">
    <% if(connected != "true"){ %>
    <figcaption class="figure-caption text-center">Mode invité activé !</figcaption>
    <% } %>
    <% if(connected == "true"){ %>
    <h5 class="text-center">Bienvenue ${name}. Vous êtes le gérant du garage n°01280 : Lattes - Méditerrannée</h5>
    <% } %>
</figure>
</body>
</html>
