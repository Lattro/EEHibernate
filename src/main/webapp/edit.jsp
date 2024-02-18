<%--
  Created by IntelliJ IDEA.
  User: latro
  Date: 11.02.2024
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>РЕДАКТИРОВАТЬ ДАННЫЕ</title>
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap.css">
</head>
<body>
<form method="post" style="margin: 350px 0px 0px 0px">
    <table class="table"  >
        <tr style="text-align: center">
            <th>Наименование</th>
            <th>Порода</th>
            <th>Возраст</th>
            <th>Цена</th>
        </tr>
        <tr style="text-align: center">
            <td ><input type="text" name="name" value="${pet.name}" style="text-align: center"></td>
            <td><input type="text" name="breed" value="${pet.breed}" style="text-align: center"></td>
            <td><input type="number" name="age"  value="${pet.age}" style="text-align: center"></td>
            <td><input type="number" name="price" value="${pet.price}" style="text-align: center"></td>
            <td><input type="hidden" name="id" value="${pet.id}" style="text-align: center"></td>
        </tr>
        <tr>
            <td colspan="4" style="text-align: center"><input   type="submit" value="Сохранить" class="btn btn-dark"></td>
        </tr>
    </table>
</form>
</body>
</html>
