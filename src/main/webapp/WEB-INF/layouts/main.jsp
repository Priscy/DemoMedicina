<%-- 
    Document   : main
    Created on : Oct 7, 2016, 9:55:58 AM
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
        <title><sitemesh:write property="title"/></title>
        <link rel="stylesheet" href="<s:url value='/css/bootstrap.css' />">
        <style>
            .navbar-default {
                background-color: lightseagreen;
            }
            .navbar-default .navbar-brand, .navbar-default .navbar-nav>li>a{
                color: white;
            }
  	</style>
    </head>
    <body>
      <nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
				<span class="sr-only">Toggle navigation</span>
	        		<span class="icon-bar"></span>
	        		<span class="icon-bar"></span>
	        		<span class="icon-bar"></span> 
	     		</button>
                            <a class="navbar-brand " href="<s:url value='/'/>">Demo Medicina</a>
			</div>
	  		<div class="collapse navbar-collapse" id="myNavbar">
		  		<ul class="nav navbar-nav navbar-right">
		   			<li><a  href="<c:url value="/pregunta/new"/>">New</a></li>
	    			<li><a  href="<c:url value="/pregunta/list"/>">List</a></li> 	
	    		</ul>
		  	</div>
  		</div>	
	</nav>
        <sitemesh:write property='body'/>
            <script src="<c:url value='/js/jquery.min.js' />"></script>
            <script src="<c:url value='/js/bootstrap.min.js' />"></script>

        <sitemesh:write property="content"/>
    </body>
</html>
