<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "head.jsp"  %>
<%@ include file = "menu.jsp"  %>
<table class="table table-striped table-dark">
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Réparation à effectuer</th>
        <th scope="col">Voiture concernée</th>
        <th scope="col">Employés affectés</th>
        <th scope="col">Nom client</th>
    </tr>
    </thead>
    <tbody>
    <% for(int i = 0; i < 20; i++) { %>
    <tr>
        <th scope="row"><%= i + 1 %></th>
        <td>Destruction voiture</td>
        <td>Porsche X029-91M</td>
        <td>Un garagiste</td>
        <td>Le mec à Milla</td>
    </tr>
    <% } %>
    </tbody>
</table>