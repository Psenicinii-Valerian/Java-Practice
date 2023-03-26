<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDate" %>
<%--
  Created by IntelliJ IDEA.
  User: Valerian
  Date: 12/18/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>View employees</title>
        <%@include file="common/bootstrap_css.html"%>
    </head>
    <body>
    <%@ include file="common/header.html"%>

<div class="container">
    <h1>Employees list</h1>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Birthdate</th>
            <th>Actions</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${list}" var="employee">
            <tr>
                <td><c:out value="${employee.name}"/></td>
                <td><c:out value="${employee.surname}"/></td>
                <td><c:out value="${employee.birthdate}"/></td>
                <td>
                        <%-- POST-> datele se transmit in corp--%>
                        <%-- GET-> datele se transmit in adresa--%>
                    <a class="btn btn-primary" href="edit?id=${employee.id}">
                        Edit
                    </a>

                    <a class="btn btn-danger" href="delete?id=${employee.id}">
                        Delete
                    </a>
                        <%--<a onclick="confirmDelete(${employee.id})">--%>
                            <%--<button>Delete</button>--%>
                        <%--</a>--%>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
 </div>

    <%@include file="common/bootstrap_js.html"%>
    </body>

    <script>
        function confirmDelete(id) {
            if (confirm("Are you sure you want to delete employee with id=?" + id)) {
                window.location.href = "delete?id=" + id;
            }
        }
    </script>

</html>
