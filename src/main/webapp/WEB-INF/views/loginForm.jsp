<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 22.11.2017
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>


<form action="loggedin" method="post">

    Please log in to see the cars. <br><br>

    <input type="text" name="login" placeholder="What's your name?"/><br>
    <input type="password" name="password" placeholder="What's your password?"/><br>
    <input type="submit" />
    <br><br>
    <p><font color="red">${errormsg}</font></p>

    <br><br>
    <a href="/">Go back to homepage</a>

</form>

</body>
</html>
