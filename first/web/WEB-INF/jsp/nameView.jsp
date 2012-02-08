<%-- 
    Document   : nameView
    Created on : 8 лют 2012, 20:38:52
    Author     : Raymond
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page contentType="text/html" pageEncoding="windows-1251"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>Enter your name</title>
    </head>
    <body>
        <h1>Enter your name</h1>
        <spring:nestedPath path="name">
            <form action="" method="post">
                Name:
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}">
                </spring:bind>
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
