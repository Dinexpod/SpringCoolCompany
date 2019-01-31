<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 31.01.2019
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type= "text/css" rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/resources/styles/style.css" />
    <title>developer</title>
</head>
<body>
<h1>
    this is developers
</h1>
<table>
    <th>Id</th>
    <th>Name</th>
    <%--@elvariable id="developers" type="java.util.List"--%>
    <c:forEach items="${developers}" var="developer">
        <tr>

            <td>${developer.developerId}</td>
            <td>${developer.developerName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
