<%-- 
    Document   : index
    Created on : Jan 27, 2022, 9:37:15 AM
    Author     : Ahsika
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello </h1>${username}

        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            
            if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
            
            }

        %>
        <form action="logout" method="get">
            <input type="submit" value="logout"><!-- logout -->
        </form>
    </body>
</html>
