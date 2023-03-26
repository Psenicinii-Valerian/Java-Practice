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
</head>
<body>
<%@ include file="common/header.html"%>
<h1>Employees list</h1>

<%
    LocalDate date = LocalDate.now();
    out.println(date);
%>
<%= "Hello world! " + LocalDate.now()%>

<%
    List<String> test = (List<String>) request.getAttribute("list");

    // citesc atributele transmise din Servlet
    for (String element:test){
        out.println(element);
    }
%>

<ul>
    <c:forEach items="${list}" var="element">
        <li><c:out value="${element}"/></li>
    </c:forEach>
</ul>

<%=LocalDate.now()%>

</body>
</html>
