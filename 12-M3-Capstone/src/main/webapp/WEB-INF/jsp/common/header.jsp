<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>National Park Geek</title>
<c:url value="/css/npgeek.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">

<script src="javascript.js">
</script>


</head>

<body>
	<header>
		<c:url value="/" var="homePageHref" />
		<c:url var="logoImg" value="/img/logo.png" />

		<a href="${homePageHref}"> <img src="${logoImg}"
			alt="National Park Geek logo" />
		</a>
	</header>
	<nav>
		<h2>Explore National Park Geek</h2>
		<ul>

			<li><a href="<c:url value="/"/>">Home Page</a></li>
			<li><a href="<c:url value="/survey"/>">Survey</a></li>
			<li><a href="<c:url value="/favoriteParks"/>">Favorite Parks</a></li>


		</ul>
	</nav>
</body>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />