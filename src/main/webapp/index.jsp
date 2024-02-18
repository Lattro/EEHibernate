<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>МАГАЗИН ЖИВОТНЫХ</title>
    <link rel="stylesheet" href="bootstrap-5.3.2-dist/css/bootstrap.css">
</head>
<body>
<h1 class="text-info" style="text-align: center">ПРОДАЖА ЖИВОТНЫХ</h1>
<br/>
<a href='<c:url value="/insert"/>' class="btn btn-success" >ДОБАВИТЬ ЖИВОТНОЕ В БАЗУ</a>
<table class="table" style="margin: 100px 0px 0px 0px ">
    <tr style="text-align: center">
        <th>Название</th>
        <th>Порода</th>
        <th>Возраст</th>
        <th>Цена</th>
    </tr>
    <c:forEach var="item" items="${petList}">
        <tr style="text-align: center">
            <td>${item.name}</td>
            <td>${item.breed}</td>
            <td>${item.age}</td>
            <td>${item.price}</td>
            <td ><a class="btn btn-dark" href="<c:url value="/edit?id=${item.id}"/>">ИЗМЕНИТЬ</a></td>
            <td><form  method="post" action="<c:url value="/delete"/>">
                <input type="hidden" name="id" value="${item.id}">
                <input class="btn btn-danger" type="submit" value="УДАЛИТЬ">
            </form></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>