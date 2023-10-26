<%--
  Created by IntelliJ IDEA.
  User: Bodi4
  Date: 10/16/2023
  Time: 3:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="calc" type="com.example.web3.Calculation" scope="request"/>
    <h1>Max Y = ${calc.findMax()} Index = ${calc.findIndexOfMax()} Argument = ${calc.findArgumentOfMax()}</h1>
    <h1>Min Y = ${calc.findMin()} Index = ${calc.findIndexOfMin()} Argument = ${calc.findArgumentOfMin()}</h1>
    <h1>Sum = ${calc.sumOfValue()}</h1>
    <h1>Average = ${calc.averageValue()}</h1>
    <div class="main">
        <form class="search-bar" method="post" action="tabulation">
            <label for="start">Start:</label>
            <input id="start" type="text" name="start">
            <label for="end">End:</label>
            <input id="end" type="text" name="end">
            <label for="step">Step:</label>
            <input id="step" type="text" name="step">
            <input class="form-select-button" type="submit" value="Tabulate">
        </form>
    </div>
</body>
</html>
