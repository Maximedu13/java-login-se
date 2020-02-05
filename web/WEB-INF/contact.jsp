<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "head.jsp"  %>
<%@ include file = "menu.jsp"  %>
<body>

<body>
<form method="post" action="contact">
    <fieldset class="text-center">
        <legend>Communiquer avec un autre garage</legend>
        <p>Vous pouvez envoyer un mail à un autre garage via ce formulaire.</p>

        <label for="id_select"> Garages </label>
        <select id="id_select" autofocus="true" name="garage">
            <option value="0" disabled selected> ------------------ </option>
            <option value="1"> 123209 - Montpellier, Croix d'Argent </option>
            <option value="2"> 122333 - Sète, Collines </option>
        </select>
        <br />
        <label for="nom">Objet</label>
        <input type="text" id="object" name="object" value="" size="20" maxlength="20" />
        <br />

        <label for="message"> Votre message </label>
        <br />
        <textarea name="message"></textarea>
        <br />
        <input type="submit" value="Envoyer" class="sansLabel" />
        <br />
    </fieldset>
</form>
</body>
</html>
