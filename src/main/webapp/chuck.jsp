
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">
		
		<title>Chuck Norris Application</title>
		<!-- Loading third party fonts -->
		<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,900" rel="stylesheet" type="text/css">
		<link href="fonts/font-awesome.min.css" rel="stylesheet" type="text/css">
		<!-- Loading main css file -->
		<link rel="stylesheet" href="style.css">
		
		<!--[if lt IE 9]>
		<script src="js/ie-support/html5.js"></script>
		<script src="js/ie-support/respond.js"></script>
		<![endif]-->

	</head>

	<body class="header-collapse">
		<div id="site-content">

			
			<main class="main-content">

				<div class="hero">
					<div class="slider">
						<ul class="slides">
							<li class="lazy-bg" data-background="dummy/slide-1.jpg">
								<div class="container">
									<h2 class="slide-title">Chuck was here!!</h2>
									<h3 class="slide-subtitle">Type your search in the box bellow</h3>
									<form method="get" action="search" class="form">
										<input type="text" id="fname" name="search" placeholder="search">
										<input type="submit" value="submit">
									</form>
									
									
    								<% request.setCharacterEncoding("UTF-8"); %>
    								<script>
    								document.getElementById("fname").focus();
									</script>
									<p class="slide-desc"><%= request.getAttribute("joke") %></p>
									
									<div style="width: 100%; height: 0; position: relative; padding-bottom: 50%;">
										<iframe src="https://giphy.com/embed/qanrUMM3x50mA" width="480" height="311" 
										frameBorder="0" 
										class="giphy-embed" 
										allowFullScreen>
									</iframe><p><a href="https://giphy.com/gifs/chuck-norris-qanrUMM3x50mA">via GIPHY</a></p>
									
									</div>
	
								</div>
							</li>
						</ul>
					</div>
				</div>
			</main> <!-- .main-content -->

			<footer class="site-footer">
				<div class="container">
					<div class="social-links">
						<a href="#"><i class="fa fa-facebook-square"></i></a>
						<a href="#"><i class="fa fa-twitter"></i></a>
						<a href="#"><i class="fa fa-google-plus"></i></a>
						<a href="#"><i class="fa fa-pinterest"></i></a>
					</div> <!-- .social-links -->
					
					<p class="copy">Debora Sroka @ Copyright 2023. All rights reserved.</p>
			  </div>
			</footer> <!-- .site-footer -->

		</div> <!-- #site-content -->

		<script src="js/jquery-1.11.1.min.js"></script>		
		<script src="js/plugins.js"></script>
		<script src="js/app.js"></script>
		
	</body>

</html>