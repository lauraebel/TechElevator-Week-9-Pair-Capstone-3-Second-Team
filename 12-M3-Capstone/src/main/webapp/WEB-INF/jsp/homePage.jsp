<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="grid-container">
	<header class="grid-item header"> </header>
	<div class="grid-item title"></div>
	<main class="grid-item main">
	<div class="items">
		<c:set var="detail" value="" />
		<c:forEach items="${parks}" var="park">
			<div class="polaroid">
				<c:url value="/" var="homepageDetails">
					<c:param name="parkCode" value="${park.code}" />
				</c:url>

				<c:url var="parkImg"
					value="/img/parks/${park.code.toLowerCase()}.jpg" />
				<a class="" href="${homepageDetails}"> <img src="${parkImg}"
					alt="Image of ${park.name}">
					<p>${park.name}</p>
				</a>
			</div>
			<c:if test="${param.parkCode == park.code}">
				<c:set var="detail" value="${park}" />
			</c:if>
		</c:forEach>

	</div>

	</main>
	<div id="description">
		<h3>Park Description</h3>
		<c:choose>
			<c:when test="${detail == '' }">
				<p>default message</p>
			</c:when>
			<c:otherwise>
				<c:url value="details" var="parkDetailsUrl">
					<c:param name="parkCode" value="${detail.code}" />
				</c:url>
				<p>${detail.description}</p>
				<a class="" href="${parkDetailsUrl}">
					<p>View Additional Park Details</p>
				</a>
			</c:otherwise>

		</c:choose>
		<h1>${parkDetail.name}</h1>

	</div>

</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />