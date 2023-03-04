
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

</head>

<body>

<script type="text/javascript">

document.onkeydown=function(){
	
    	if(window.event.keyCode=="13");
    	
    	
        submitForm();
    }

</script>

  <div style = "margin:auto; width:60%; border:3px; padding:10px;">   
    <form method="get" action="search">
       <label for="fname">Type a word you would like to search:</label><br>
       <input type="text" id="fname" name="search"><br>
       <input type="submit" value="search">
    </form> 
    <%= request.getAttribute("joke") %>
    <% request.setCharacterEncoding("UTF-8"); %>
    <script>
    	document.getElementById("fname").focus();
	</script>
 </div>

</body>
</html>
