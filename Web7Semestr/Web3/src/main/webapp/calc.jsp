<%--
  Created by IntelliJ IDEA.
  User: Bodi4
  Date: 10/16/2023
  Time: 3:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="En">
<head>
  <title>SkinSpectrum</title>
  <link rel="stylesheet" type="text/css" href="CSS/calc.css" />
</head>
<body>
<header class="header">
  <button class="header-div">Login</button>
</header>

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


<footer class="footer">
  <div class="footer-links">
    <span class="footer-links">© 2023 Skin Spectrum </span>
    <a class="footer-links" href="calc.jsp">Contact</a>
    <a class="footer-links" href="calc.jsp">About us</a>
    <a class="footer-links" href="calc.jsp">Calculation</a>
  </div>
</footer>
</body>
</html>