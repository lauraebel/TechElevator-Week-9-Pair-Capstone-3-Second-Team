<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<h1>PARK DETAILS! WOW! ISN'T THIS PARK NEAT?</h1>

	<div class="parkTile">
		<c:url var="parkImg" value="/img/parks/${park.code.toLowerCase()}.jpg" />
		<img src="${parkImg}" alt="Image of ${park.name}">
		<h3>${park.name}</h3>
		<p>${park.description}</p>
		<div id="moreInfo">
			<button type="button" class="collapsible">More Information</button>
			<div class="content">
				<p>Lorem ipsum...</p>
			</div>
		</div>

				<c:choose>
					<c:when test="${isFarenheit == true}">isFarenheit is true</c:when>
					<c:when test="${isFarenheit == false}">isFarenheit is false</c:when>
				</c:choose>


		<div class="forecast">
			<c:forEach items="${forecasts}" var="forecast">
				<c:url var="forecastImg" value="/img/weather/${forecast.imgPath}" />
				<img src="${forecastImg}"
					alt="Image of ${forecast.weatherType} Weather">
				
				<%-- <p>High: ${forecast.high}</p>
				<p>Low: ${forecast.low}</p> --%>
			</c:forEach>

		</div>
	</div>
	
	<form action="<c:url value="/details" />" method="POST">
		<c:set var="choseFarenheit" value="true" />
		
		<input type="radio" value="${choseFarenheit}" name="changeUnit">
			<c:url var="farenURL" value="/img/weather/farenheit.png" />
			<img src="${farenURL}" alt="Farenheit img" />
		
		<input type="radio" value="${!choseFarenheit}" name="changeUnit" />
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