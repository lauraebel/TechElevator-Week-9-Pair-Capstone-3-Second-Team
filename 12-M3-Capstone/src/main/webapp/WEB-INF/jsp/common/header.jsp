<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>National Park Geek</title>
	<c:url value="/css/test.css" var="cssHref" />
	<link rel="stylesheet" href="${cssHref}">
</head>

<body>
	<header>
		<c:url value="/" var="homePageHref" />
		<c:url var="logoImg" value="/img/logo.png" />

		<a href="${homePageHref}">
		<img src="${logoImg}" alt="National Park Geek logo" />
		<h1>NATIONAL PARK GEEK</h1>
		</a>
	</header>
	<nav>
		<ul>

			<li><a href="<c:url value="/survey"/>">Survey</a></li>
			<li><a href="<c:url value="/favoriteParks"/>">Favorite Parks</a></li>

		</ul>
	</nav>
</body>
