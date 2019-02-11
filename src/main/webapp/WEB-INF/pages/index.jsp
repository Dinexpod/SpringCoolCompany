<%--@elvariable id="developer" type="mate.academy.spring.model.Developer"--%>
<%--
  Created by IntelliJ IDEA.
  User: Dinexpod
  Date: 27.01.2019
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link type="text/css" rel="stylesheet" media="screen"
          href="${pageContext.request.contextPath}/resources/styles/style1.css"/>
    <title>$Title$</title>
  </head>
  <div id="login">
  <body>

  <h1>
    You are located on main page my WebSite!
  </h1>

  <h1>
   Welcome!!!
  </h1>

  <a href="${pageContext.request.contextPath}/auth/log">
    <form method="GET"
          action="${pageContext.request.contextPath}/auth/log">
      <input type="submit" value=" Login ">
    </form>
  </a>

  <a href="${pageContext.request.contextPath}/auth/reg">
    <form method="GET"
          action="${pageContext.request.contextPath}/auth/reg">
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
