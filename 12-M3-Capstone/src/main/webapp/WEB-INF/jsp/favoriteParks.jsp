<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<h1>Favorite Parks</h1>

	<c:forEach items="${favorites}" var="entry">

		<c:url value="parkDetails" var="parkDetailsUrl">
			<c:param name="parkCode" value="${entry.key.code}" />
		</c:url>

		<div class="parkTile">
			<c:url var="parkImg" value="/img/parks/${entry.key.code.toLowerCase()}.jpg" />
			<a class="park-image" href="${parkDetailsUrl}">
				<img src="${parkImg}" alt="Image of ${entry.key.name}">
			</a>
			<h3>${entry.key.name}</h3>
			<p>${entry.key.description}
		</div>
	</c:forEach>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />