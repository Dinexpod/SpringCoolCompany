<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 28.01.2019
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/resources/styles/style1.css"/>
    <title>Developer</title>
</head>
<button type="button" name="back" onclick="history.back()">back</button>
<div id=login>

    <body>
    <h1>Developer page</h1>
    <table>

        <a href="${pageContext.request.contextPath}/developer/listDev/">
            <input type="submit" value="List developer">
        </a>

        <a href="${pageContext.request.contextPath}/developer/newDev/">
            <input type="submit" value="Create developer">
        </a>

        <a href="${pageContext.request.contextPath}/developer/jqueryDev/">
            <input type="submit" value="JqueryDev">
        </a>

    </table>
    </body>
</div>
</html>
