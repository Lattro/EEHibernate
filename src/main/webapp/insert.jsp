<%--
  Created by IntelliJ IDEA.
  User: latro
  Date: 10.02.2024
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap.css">
    <title>ДОБАВИТЬ НОВОЕ ЖИВОТНОЕ В БАЗУ</title>
</head>
<body>
<form method="post" style="margin: 350px 0px 0px 0px">
    <table class="table">
        <tr style="text-align: center">
            <th>Наименование</th>
            <th>Порода</th>
            <th>Возраст</th>
            <th>Цена</th>
        </tr>
        <tr style="text-align: center">
            <td><input type="text" name="name" style="text-align: center"></td>
            <td><input type="text" name="breed" style="text-align: center"></td>
            <td><input type="number" name="age" style="text-align: center"></td>
            <td><input type="number" name="price" style="text-align: center"></td>
        </tr>
        <tr>
            <td colspan="4" style="text-align: center"><input class="btn btn-dark" type="submit" value="Добавить"></td>
        </tr>
    </table>
</form>
</body>
</html>
