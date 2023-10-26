<%--
  Created by IntelliJ IDEA.
  User: Bodi4
  Date: 9/26/2023
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <jsp:useBean id="calculation" scope="request" type="com.example.web3.Calculation"/>
    <h1>Hello, ${calculation.calculateMax()}!</h1>

</body>
</html>
