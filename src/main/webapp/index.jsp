<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 04.02.2019
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/resources/styles/style1.css"/>
<title>login</title>
</head>

<div id="login">

<body>



    <form method="POST"
          action="${pageContext.request.contextPath}/developer/login" modelattribute="userLoginInput">

        <span class="fontawesome-user"></span>
        <input  name="username" type="text" id="username" placeholder="Username">

        <span class="fontawesome-lock"></span>
        <input name="password" type="password" id="password" placeholder="Password">

        <input type="submit" value="Login">
    </form>

    <a href="${pageContext.request.contextPath}/developer/reg">
        <form method="GET"
              action="${pageContext.request.contextPath}/developer/reg">
            <input type="submit" value=" Registration ">
        </form>
    </a>

    <a href="${pageContext.request.contextPath}/developer">
        <form method="GET"
              action="${pageContext.request.contextPath}/developer">
            <input type="submit" value=" Developer page ">
        </form>
    </a>

</body>
</div>
</html>
