<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!DOCTYPE html>
<html lang="en" >
<div style="text-align: start;">
<body>
<div style="text-align: center;">
    <h2>Привет. В то время, когда все ищут как бы поднять себе настроение, этот небольшой сервис делает все наоборот.</h2>
</div>
        <div style="float: left; width: 49%; text-align: center;">
    <h3>Сначала просто посмотри на сравнение населения России и США</h3>
    <input type="button" value="Посмотреть" onclick="window.location.href='population'"/>
        </div>


        <div style="float: left; width: 49%;text-align: center;">
            <h3>А здесь можешь сравнить свою заработную плату</h3>
    <input type="button" value="Начать" onclick="window.location.href='salary'"/>
            </div>

</body>
</div>
</html>