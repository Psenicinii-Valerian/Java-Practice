<%--
  Created by IntelliJ IDEA.
  User: Valerian
  Date: 1/13/2023
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Please confirm!</title>
    </head>

    <body>
        <h1>Are you sure you want to delete the employee?</h1>
        <h2><c:out value="${requestScope.fullName}"/></h2>

        <form method="post">
            <button type="submit">Confirm</button>
        </form>

        <a href="list"><button>Go back</button></a>
    </body>
</html>
