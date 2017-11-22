<%--
  Created by IntelliJ IDEA.
  User: piotr
  Date: 22.11.2017
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cars</title>
</head>
<body>

Welcome ${login}<br>
Please see the table with cars below:<br><br><br>

<table style="width:100%" align="center">

    <tr>
        <th>Car Brand</th>
        <th>Car Speed</th>
        <th>Car music</th>
    </tr>
    <tr align="center">
        <td>${happyAudi.carBrand}</td>
        <td>${happyAudi.carSpeed}</td>
        <td>${happyAudiSong}</td>
    </tr>
    <tr align="center">
        <td>${sadAudi.carBrand}</td>
        <td>${sadAudi.carSpeed}</td>
        <td>${sadAudiSong}</td>
    </tr>
    <tr align="center">
        <td>${happyVolks.carBrand}</td>
        <td>${happyVolks.carSpeed}</td>
        <td>${happyVolksSong}</td>
    </tr>
    <tr align="center">
        <td>${sadVolks.carBrand}</td>
        <td>${sadVolks.carSpeed}</td>
        <td>${sadVolksSong}</td>
    </tr>
</table>

</body>
</html>
