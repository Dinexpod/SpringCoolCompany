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
    <title>Developer</title>
</head>
<body>
Developer page:

<button type="button" name="back" onclick="history.back()">back</button>

<a href="${pageContext.request.contextPath}/developer/newDev/">
    <button type="submit" name="button" value="button1">Create developer</button>
</a>

</body>
</html>
