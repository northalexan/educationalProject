<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!DOCTYPE html>
<html>
<body>

<div style="text-align: center;">
    <input type="button" value="Вернуться" onclick="window.location.href='start'"/>
    <br>
<h2> Вся информация по населению жителей Российской Федерации и Соединенных Штатов Америки</h2>

<br>

<table>
    <h3> Общее население </h3>
    <br>
    Население России:${rusPop}
    <br>
    <br>
    Население Америки:${usaPop}
    <br>
    <br>
    ${rusOrUSA}
    <br>
    <br>
    <br>
    <br>
    <h3> Мужчины </h3>
    <br>
    Количество мужского населения России:${rusPopMan}
    <br><br>
    Количество мужского населения Америки:${UsaPopMan}
    <br><br>
    ${rusManOrUSAMan}
    <br><br><br><br>
    <h3> Женщины </h3>
    <br>
    Количество женского населения России:${rusWoman}
    <br><br>
    Количество женского населения Америки:${USAWoman}
    <br><br>
    ${rusWomanOrUSAWoman}
    <br><br>
</div>



</table>


</body>
</html>