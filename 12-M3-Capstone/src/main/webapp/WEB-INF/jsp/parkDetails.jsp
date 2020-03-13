<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section class="details">
	<div class="parkTile">
		<c:url var="parkImg" value="/img/parks/${park.code.toLowerCase()}.jpg" />
		<img src="${parkImg}" alt="Image of ${park.name}">
		<h3>${park.name}</h3>
		<p>${park.description}</p>
		<div id="moreInfo">
			<button type="button" class="collapsible">More Information</button>
			<div class="content">
				<p>Acres: ${park.acres}</p>
				<p>Elevation: ${park.elevation} feet</p>
				<p>Campsite Count: ${park.campsiteCount}</p>
				<p>Animal Species Count: ${park.animalSpeciesCount}</p>
				<p>Miles of Trails: ${park.milesOfTrail } </p>

			</div>
		</div>
	</div>
	<script src="<c:url value="/webcontent/collapseMenu.js" />" /></script>
	
	<c:set var="high" value="" />
	<c:set var="low" value="" />
	<c:set var="suffix" value="" />
	
	<div class="forecast">
		<c:set var="i" value="0" />
		<c:forEach items="${forecasts}" var="forecast">
			<div class="dayForecast">
				
				<fmt:parseDate type="date" pattern="yyyy-MM-dd" value="${forecast.getForecastDate(i)}" var="date"/>
				<fmt:formatDate value="${date}"/>
				<c:set var="i" value="${i + 1}" />
				
				<c:url var="forecastImg" value="/img/weather/${forecast.imgPath}" />
				<img src="${forecastImg}"
					alt="Image of ${forecast.weatherType} Weather">
				
				<c:choose>
					<c:when test="${isFarenheit == true}">
						<c:set var="high" value="${forecast.fHigh}" />
						<c:set var="low" value="${forecast.fLow}" />
						<c:set var="suffix" value="°F" />
					</c:when>
					<c:when test="${isFarenheit == false}">
						<c:set var="high" value="${forecast.cHigh}" />
						<c:set var="low" value="${forecast.cLow}" />
						<c:set var="suffix" value="°C" />
						
					</c:when>
				</c:choose>
				
				<p><c:out value="High: ${high} ${suffix}" /></p>
				<p><c:out value="Low: ${low} ${suffix}" /></p>
				
				<div class="weatherAdvisory">
					<c:if test="${forecast.weatherType == 'snow'}">
						<p>Pack snowshoes!</p>
					</c:if>
					<c:if test="${forecast.weatherType == 'rain'}">
						<p>Pack rain gear and wear water-proof shoes!</p>
					</c:if>
					<c:if test="${forecast.weatherType == 'sunny'}">
						<p>Bring sunblock!</p>
					</c:if>
					<c:if test="${forecast.weatherType == 'thunderstorms'}">
						<p>Seek shelter and avoid hiking on exposed ridges!</p>
					</c:if>
					<c:if test="${forecast.fHigh > 75}">
						<p>Bring an extra gallon of water!</p>
					</c:if>
					<c:if test="${forecast.fHigh - forecast.fLow > 20}">
						<p>Wear breathable layers!</p>
					</c:if>
					<c:if test="${forecast.fLow < 20}">
						<p>Warning: Will Be Exposed to Frigid Temperatures!</p>
					</c:if>
				</div>

			</div>
		</c:forEach>

	</div>
	
	<form action="<c:url value="/details" />" method="POST">
		<c:set var="tempUnit" value="true" />
		
		<input type="radio" value="${tempUnit}" name="tempUnit">
			<c:url var="farenURL" value="/img/weather/farenheit.png" />
			<img src="${farenURL}" alt="Farenheit img" />
		
		<input type="radio" value="${!tempUnit}" name="tempUnit" />
			<c:url var="celURL" value="/img/weather/celsius.png" />
			<img src="${celURL}" alt="Celsius img" />
			
		<input type="submit" value="Change Unit" />	
	</form>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />