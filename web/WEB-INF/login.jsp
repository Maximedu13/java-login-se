<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 28/01/2020
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "head.jsp"  %>
<%@ include file = "menu.jsp"  %>
<body>
<form method="post" action="connexion">
    <fieldset class="text-center">
        <legend>Connexion</legend>
        <p>Vous pouvez vous connecter via ce formulaire.</p>

        <label for="nom">Nom d'utilisateur</label>
        <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
        <br />

        <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
        <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
        <br />

        <input type="submit" value="Connexion" class="sansLabel" />
        <br />
    </fieldset>
</form>
</body>
</html>
