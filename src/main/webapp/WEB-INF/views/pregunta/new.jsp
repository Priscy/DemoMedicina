<%-- 
    Document   : new
    Created on : Nov 18, 2016, 1:28:28 PM
    Author     : Priscila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s"   uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pregunta Nueva</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <legend>Pregunta nueva</legend>
                <jsp:include page="form.jsp">
                    <jsp:param name="type" value="NEW"/>
                </jsp:include>
            </div>
        </div>  
        
    </body>
</html>
