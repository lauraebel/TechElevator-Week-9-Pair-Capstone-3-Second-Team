<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

<h1>Welcome to NPGEEK!</h1>

	<c:forEach items="${parks}" var="park">
		<div class="parkTile">
			<c:url var="parkImg" value="/img/parks/${park.code.toLowerCase()}.jpg" />
			<img src="${parkImg}" alt="placeholderImage">
			<h3>${park.name}</h3>
			<p>${park.description}</p>
		</div>
	</c:forEach>
</section>