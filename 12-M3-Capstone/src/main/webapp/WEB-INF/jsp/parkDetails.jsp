<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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

	<div class="forecast">
		<c:forEach items="${forecasts}" var="forecast">
			<div class="dayForecast">
				<c:url var="forecastImg" value="/img/weather/${forecast.imgPath}" />
				<img src="${forecastImg}"
					alt="Image of ${forecast.weatherType} Weather">
				<p>High: ${forecast.high}</p>
				<p>Low: ${forecast.low}</p>
				
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
					<c:if test="${forecast.high > 75}">
						<p>Bring an extra gallon of water!</p>
					</c:if>
					<c:if test="${forecast.high - forecast.low > 20}">
						<p>Wear breathable layers!</p>
					</c:if>
					<c:if test="${forecast.low < 20}">
						<p>Warning: Will Be Exposed to Frigid Temperatures!</p>
					</c:if>
				</div>



			</div>
		</c:forEach>

	</div>
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
	
	<%-- <button type="submit" formaction="<c:url value="/details" />" formmethod="POST" name="FCtoggle" >
		<c:url var="buttonUrl" value="/img/weather/temp-unit-button.png" />
		<img src="${buttonUrl}" alt="Farenheit/Celsius button img" />
	</button>
 --%>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />