<%-- 
    Document   : list
    Created on : Nov 25, 2016, 2:26:08 PM
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
        <title>Lista Preguntas</title>
    </head>
    <body>
         <div class="container">
            <div class="row">
                
                <table  id="pregunta" class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>text</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${preguntaList}" var="pregunta">
                            <tr>
                                <th>${pregunta.id}</th>                                
                                <th>${pregunta.text}</th>                                
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div><!--/.row-->
        </div><!--/.container -->
    </body>
    <content>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#pregunta').DataTable();
            });
        </script>
    </content>
</html>
