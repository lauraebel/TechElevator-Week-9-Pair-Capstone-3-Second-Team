<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>National Park Geek</title>
<c:url value="/css/npgeek.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">
</head>

<body>
	<header>
		<c:url value="/" var="homePageHref" />
		<c:url value="#" var="logoSrc" />

		<a href="${homePageHref}"> <img src="${logoSrc}"
			alt="National Park Geek logo" />
		</a>
		<h1>National Park Geek</h1>
	</header>
	<nav>
		<h2>Explore National Park Geek</h2>
		<ul>

			<li><a href="<c:url value="/"/>">Homepage</a></li>
			<li><a href="<c:url value="/survey"/>">Survey</a></li>
			<li><a href="<c:url value="/favoriteParks"/>">Favorite Parks</a></li>


		</ul>
	</nav>
</body>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />