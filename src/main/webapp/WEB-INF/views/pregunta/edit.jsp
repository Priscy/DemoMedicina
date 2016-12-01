<%-- 
    Document   : edit
    Created on : Nov 17, 2016, 10:54:59 AM
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
        <title>Edit</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <legend>Edit</legend>
                <jsp:include page="form.jsp" >
                    <jsp:param name="type" value="EDIT" />
                </jsp:include>
            </div><!--/.row-->
        </div><!--/.container-->
    </body>
</html>
