<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

<h1>PARK DETAILS! WOW! ISN'T THIS PARK NEAT?</h1>

<div class="parkTile">
			<c:url var="parkImg" value="/img/parks/${park.code.toLowerCase()}.jpg" />
			<img src="${parkImg}" alt="Image of ${park.name}">
			<h3>${park.name}</h3>
			<p>${park.description}</p>
</div>



</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />