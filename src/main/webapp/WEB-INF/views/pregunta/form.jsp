<%-- 
    Document   : form
    Created on : Nov 17, 2016, 10:57:40 AM
    Author     : Priscila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s"   uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:choose>
    <c:when test="${param.type=='NEW'}">
        <c:url var="action" value="/pregunta/create"/>
    </c:when>
    <c:otherwise>
        <c:url var="action" value="/pregunta/update"/>        
   </c:otherwise>
</c:choose>

<form:form modelAttribute="pregunta" method="post" action="${action}">
    <fieldset>
        <c:choose>
            <c:when test="${param.type=='NEW'}">
            </c:when>
            <c:otherwise>
                <form:hidden path="id" />
                <form:hidden path="version" />
            </c:otherwise>
        </c:choose>
    
         <s:bind path="pregunta.text">
            <div class="form-group">
                
                <label for="text" class="control-label col-xs-2">Texto</label>    
                <div class="col-xs-5">
                    <form:input path="text" class="form-control" placeholder="${textLabel}"/>
                </div>                                
            </div>
        </s:bind>
        <br>
        <br>
        <s:bind path="pregunta.respuestas">
            <div class="form-group">
                <label for="respuestas" class="control-label col-xs-2">Respuestas</label>
                <div class="col-xs-5">
                    <div class="form-inline">
                        <div class="form-group">
                            
                            <form:radiobutton path="" name="RadioGroup"  value="resp1"/> 
                            <form:input path="text" class="form-control" placeholder="${resp1}"/>
                        </div>
                        <br />
                        <div class="form-group">
                            <form:radiobutton path="" name="RadioGroup" value="resp2"/> 
                            <form:input path="text" class="form-control" placeholder="${resp2}"/>
                        </div>
                        <br />
                        <div class="form-group">
                            <form:radiobutton path="" name="RadioGroup" value="resp3"/> 
                            <form:input path="text" class="form-control" placeholder="${resp3}"/>
                        </div>
                        <br />
                        <div class="form-group">
                            <form:radiobutton path="" name="RadioGroup" value="resp4"/> 
                            <form:input path="text" class="form-control" placeholder="${resp4}"/>
                        </div>
                    </div>
                   
                    
                </div>
                
                
            </div>
                       
        </s:bind>
    </fieldset>
    
     <c:choose>
        <c:when test="${param.type=='NEW'}">
            <br>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-10">
                    <form:button id="saveBtn" name="saveBtn" class="btn btn-primary btn-large" value="save">
                        <span class="glyphicon glyphicon-floppy-disk" aria-hidden="true">Save</span>
                    </form:button>
                    <a class="btn btn-default" href="<c:url value="/"/>"><span class="glyphicon glyphicon-remove">Cancel</span></a>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div class="form-group">
                <div class="col-xs-offset-2 col-xs-10">
                    <form:button id="updateBtn" name="updateBtn" class="btn btn-primary btn-large" value="update">
                        <span class="glyphicon glyphicon-floppy-disk" aria-hidden="true">Update</span>
                    </form:button>
                    <a class="btn btn-danger" href="<c:url value="/machine/delete/${machine.id}"/>" onclick="return confirm('confirm');" >Delete<span class="glyphicon glyphicon-trash"></span></a>
                    <a class="btn btn-default" href="<c:url value="/"/>"><span class="glyphicon glyphicon-remove">Cancel</span></a>
                </div>
            </div>
        </c:otherwise>
    </c:choose>
    
</form:form>
