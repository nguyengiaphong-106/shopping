<%-- 
    Document   : home
    Created on : 19 thg 10, 2026, 09:28:59
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach items="${lstCategory}" var="category">
            <c:out value="${category.name}"/><br><!--  -->
        </c:forEach>
    </body>
</html>
