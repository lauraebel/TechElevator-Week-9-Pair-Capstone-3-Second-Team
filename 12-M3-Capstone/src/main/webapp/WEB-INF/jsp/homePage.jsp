<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

<h1>Welcome to NPGEEK!</h1>

	<c:forEach items="${parks}" var="park">
	
	<c:url value="details" var="parkDetailsUrl">
				<c:param name="parkCode" value="${park.code}" />
	</c:url>
	
	
		<div class="parkTile">
			<c:url var="parkImg" value="/img/parks/${park.code.toLowerCase()}.jpg" />
			<a class="park-image" href="${parkDetailsUrl}" ><img src="${parkImg}" alt="Image of ${park.name}">
			</a>
			<h3>${park.name}</h3>
			<p>${park.description}	
			
			
		</div>
	</c:forEach>
</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />