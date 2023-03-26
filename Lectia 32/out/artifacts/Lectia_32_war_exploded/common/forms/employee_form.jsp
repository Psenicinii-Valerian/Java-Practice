<%--
  Created by IntelliJ IDEA.
  User: Valerian
  Date: 1/14/2023
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form method="post">
    <div>
        <label>Name: </label>
        <input type="text" name="name" placeholder="Name..." value="${requestScope.name}"/>
    </div>

    <div>
        <label>Surname: </label>
        <input type="text" name="surname" placeholder="Surname..." value="${requestScope.surname}"/>
    </div>

    <div>
        <label>Birthdate: </label>
        <input type="date" name="birthdate" placeholder="Birthdate..." value="${requestScope.birthdate}"/>
    </div>

    <p style="margin : 2px; padding-top:2px;"></p>

    <button type="submit">Save</button>
    <button type="reset">Clear</button>

</form>


