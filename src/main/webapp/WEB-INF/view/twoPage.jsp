<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!DOCTYPE html>

<html lang="en" xmlns:th="http://thymeleaf.org">
<body>
<input style="text-align: center" type="button" value="Вернуться" onclick="window.location.href='start'"/>
<div style="float: left; width: 49%;text-align: center;">

<form:form  id="form1" method="post"  modelAttribute="salary">
    <label for="salary">Введите заработную плату</label>
    <br>
    <input name="salary" type="text" id="salary" pattern="^[0-9]+$" required/>
    <br>
    Выберите Ваш регион из списка
    <br>
    <form:select path="city">
        <form:option value="0" label="Адыгея"/>
        <form:option value="1" label="Алтай"/>
        <form:option value="2" label="Алтайский край"/>
        <form:option value="3" label="Амурская обл."/>
        <form:option value="4" label="Архангельская обл."/>
        <form:option value="5" label="Астраханская обл."/>
        <form:option value="6" label="Башкортостан"/>
        <form:option value="7" label="Белгородская обл."/>
        <form:option value="8" label="Брянская обл."/>
        <form:option value="9" label="Бурятия"/>
        <form:option value="10" label="Владимирская обл."/>
        <form:option value="11" label="Волгоградская обл."/>
        <form:option value="12" label="Вологодская обл."/>
        <form:option value="13" label="Воронежская обл."/>
        <form:option value="14" label="Дагестан"/>
        <form:option value="15" label="Еврейская АО"/>
        <form:option value="16" label="Забайкальский край"/>
        <form:option value="17" label="Ивановская обл."/>
        <form:option value="18" label="Ингушетия"/>
        <form:option value="19" label="Иркутская обл."/>
        <form:option value="20" label="Кабардино-Балкария"/>
        <form:option value="21" label="Калининградская обл."/>
        <form:option value="22" label="Калмыкия"/>
        <form:option value="23" label="Калужская обл."/>
        <form:option value="24" label="Камчатский край"/>
        <form:option value="25" label="Карачаево-Черкесия"/>
        <form:option value="26" label="Карелия"/>
        <form:option value="27" label="Кемеровская обл."/>
        <form:option value="28" label="Кировская обл."/>
        <form:option value="29" label="Коми"/>
        <form:option value="30" label="Костромская обл."/>
        <form:option value="31" label="Краснодарский край"/>
        <form:option value="32" label="Красноярский край"/>
        <form:option value="33" label="Крым"/>
        <form:option value="34" label="Курганская обл."/>
        <form:option value="35" label="Курская обл."/>
        <form:option value="36" label="Ленинградская обл."/>
        <form:option value="37" label="Липецкая обл."/>
        <form:option value="38" label="Магаданская обл."/>
        <form:option value="39" label="Марий Эл"/>
        <form:option value="40" label="Мордовия"/>
        <form:option value="41" label="Москва"/>
        <form:option value="42" label="Московская обл."/>
        <form:option value="43" label="Мурманская обл."/>
        <form:option value="44" label="Ненецкий АО"/>
        <form:option value="45" label="Нижегородская обл."/>
        <form:option value="46" label="Новгородская обл."/>
        <form:option value="47" label="Новосибирская обл."/>
        <form:option value="48" label="Омская обл."/>
        <form:option value="49" label="Оренбургская обл."/>
        <form:option value="50" label="Орловская обл."/>
        <form:option value="51" label="Пензенская обл."/>
        <form:option value="52" label="Пермский край"/>
        <form:option value="53" label="Приморский край"/>
        <form:option value="54" label="Псковская обл."/>
        <form:option value="55" label="Ростовская обл."/>
        <form:option value="56" label="Рязанская обл."/>
        <form:option value="57" label="Самарская обл."/>
        <form:option value="58" label="Санкт-Петербург"/>
        <form:option value="59" label="Саратовская обл."/>
        <form:option value="60" label="Саха"/>
        <form:option value="61" label="Сахалинская обл."/>
        <form:option value="62" label="Свердловская обл."/>
        <form:option value="63" label="Севастополь"/>
        <form:option value="64" label="Северная Осетия"/>
        <form:option value="65" label="Смоленская обл."/>
        <form:option value="66" label="Ставропольский край"/>
        <form:option value="67" label="Тамбовская обл."/>
        <form:option value="68" label="Татарстан"/>
        <form:option value="69" label="Тверская обл."/>
        <form:option value="70" label="Томская обл."/>
        <form:option value="71" label="Тульская обл."/>
        <form:option value="72" label="Тыва"/>
        <form:option value="73" label="Тюменская обл."/>
        <form:option value="74" label="Удмуртия"/>
        <form:option value="75" label="Ульяновская обл."/>
        <form:option value="76" label="Хабаровский край"/>
        <form:option value="77" label="Хакасия"/>
        <form:option value="78" label="Ханты-Мансийский АО"/>
        <form:option value="79" label="Челябинская обл."/>
        <form:option value="80" label="Чечня"/>
        <form:option value="81" label="Чувашия"/>
        <form:option value="82" label="Чукотский АО"/>
        <form:option value="83" label="Ямало-Ненецкий АО"/>
        <form:option value="84" label="Ярославская обл."/>




    </form:select>

    <br>

    <input type="submit" form="form1" value="ok"/>
    <br>
    <br>
    ${isLoss}

    ${salaryOfYear}

    ${isMore}
    <br>
    <br>

    <b>${Rus}</b>
    <br>
    ${coffeRus}
    <br>
    ${macRus}
    <br>
    ${fuel95Rus}
    <br>
    ${iphone12Rus}

</form:form>
</div>



<div style="float: right; width: 49%;text-align: center;">
<form:form  id="form2" method="post"  modelAttribute="salary1" >
    <label for="salaryRus">Введите заработную плату</label>
    <br>
    <input name="salaryRus" type="text" id="salaryRus" pattern="^[0-9]+$" required/>
    <br>
    Выберите штат из списка
    <br>
    <form:select path="cityUSA">
        <form:option value="0" label="Айдахо"/>
        <form:option value="1" label="Айова"/>
        <form:option value="2" label="Алабама "/>
        <form:option value="3" label=" Аляска "/>
        <form:option value="4" label="Аризона"/>
        <form:option value="5" label="Арканзас"/>
        <form:option value="6" label="Вайоминг "/>
        <form:option value="7" label=" Вашингтон "/>
        <form:option value="8" label="Вашингтон, округ Колумбия"/>
        <form:option value="9" label="Вермонт"/>
        <form:option value="10" label="Виргинские острова "/>
        <form:option value="11" label=" Вирджиния "/>
        <form:option value="12" label="Висконсин"/>
        <form:option value="13" label="Гавайи"/>
        <form:option value="14" label="Гуам "/>
        <form:option value="15" label=" Делавэр "/>
        <form:option value="16" label="Джорджия"/>
        <form:option value="17" label="Западная Вирджиния"/>
        <form:option value="18" label="Иллинойс "/>
        <form:option value="19" label=" Индиана "/>
        <form:option value="20" label="Калифорния"/>
        <form:option value="21" label="Канзас"/>
        <form:option value="22" label="Кентукки "/>
        <form:option value="23" label=" Колорадо "/>
        <form:option value="24" label="Коннектикут"/>
        <form:option value="25" label="Луизиана"/>
        <form:option value="26" label="Массачусетс "/>
        <form:option value="27" label=" Миннесота "/>
        <form:option value="28" label="Миссисипи"/>
        <form:option value="29" label="Миссури"/>
        <form:option value="30" label="Мичиган "/>
        <form:option value="31" label=" Монтана "/>
        <form:option value="32" label="Мэн"/>
        <form:option value="33" label="Мэриленд "/>
        <form:option value="34" label=" Небраска "/>
        <form:option value="35" label="Невада"/>
        <form:option value="36" label="Нью-Гэмпшир"/>
        <form:option value="37" label="Нью-Джерси "/>
        <form:option value="38" label=" Нью-Йорк "/>
        <form:option value="39" label="Нью-Мексико"/>
        <form:option value="40" label="Огайо"/>
        <form:option value="41" label="Оклахома "/>
        <form:option value="42" label=" Округ Колумбия "/>
        <form:option value="43" label="Орегон"/>
        <form:option value="44" label="Пенсильвания"/>
        <form:option value="45" label="Пуэрто-Рико "/>
        <form:option value="46" label=" Род-Айленд "/>
        <form:option value="47" label="Северная Дакота"/>
        <form:option value="48" label="Северная Каролина"/>
        <form:option value="49" label="Теннесси "/>
        <form:option value="50" label=" Техас "/>
        <form:option value="51" label="Флорида"/>
        <form:option value="52" label="Южная Дакота"/>
        <form:option value="53" label="Южная Каролина "/>
        <form:option value="54" label=" Юта "/>
    </form:select>

    <br>

    <input type="submit" form="form2" value="ok"/>
    <br>
    <br>
    ${salaryUSA}
    <br>
    ${isUSAMoreRus}${isRusMoreUSA}${equal}
    <br>
    <br>
    <b>${USA}</b>
    <br>
    ${coffeUSA}
    <br>
    ${macUSA}
    <br>
    ${fuel95USA}
    <br>
    ${iphone12USA}



</form:form>
</div>





</body>

</html>