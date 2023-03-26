<%--
  Created by IntelliJ IDEA.
  User: Valerian
  Date: 1/14/2023
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form method="post">
    <div class="mb-3">
        <label for="name" class="form-label">Name</label>
        <input type="text" class="form-control" id="name" name="name" placeholder="Name..." value="${requestScope.name}"/>
    </div>
    <div class="mb-3">
        <label for="surname" class="form-label">Surname</label>
        <input type="text" class="form-control" id="surname" name="surname" placeholder="Surname..." value="${requestScope.surname}"/>
    </div>
    <div class="mb-3">
        <label for="birthdate" class="form-label">Birthdate</label>
        <input type="date" class="form-control" id="birthdate" name="birthdate" placeholder="Birthdate..." value="${requestScope.birthdate}"/>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>


<%--<form method="post">--%>
    <%--<input type="hidden" name="id" value="${requestScope.id}">--%>
    <%--<div>--%>
        <%--<label>Name: </label>--%>
        <%--<input type="text" name="name" placeholder="Name..." value="${requestScope.name}"/>--%>
    <%--</div>--%>

    <%--<div>--%>
        <%--<label>Surname: </label>--%>
        <%--<input type="text" name="surname" placeholder="Surname..." value="${requestScope.surname}"/>--%>
    <%--</div>--%>

    <%--<div>--%>
        <%--<label>Birthdate: </label>--%>
        <%--<input type="date" name="birthdate" placeholder="Birthdate..." value="${requestScope.birthdate}"/>--%>
    <%--</div>--%>

    <%--<p style="margin : 2px; padding-top:2px;"></p>--%>

    <%--<button type="submit">Save</button>--%>
    <%--<button type="reset">Clear</button>--%>
<%--</form>--%>


