<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap" rel="stylesheet"/>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="survey-details">

	<h1>What'd you think?</h1>
	
	<c:url var="submitSurveyUrl" value="/survey" />
	
	<form:form action="${surveyUrl}" method="POST" modelAttribute="survey">
		
		<div class="errors">
			<form:errors path="*" cssClass="error"/>
		</div>
		
		<h3>Your Favorite National Park:</h3>
		<form:select path="favoriteParkCode" label="Favorite Park:">
			<c:forEach var="park" items="${parks}">			
				<form:option value="${park.code}" label="${park.name}"/>
			</c:forEach>
		</form:select>
		
		<h3>Your Email Address:</h3>
		<form:input path="email" label="Email Address:"/>
		
		<h3>Your State of Residency:</h3>
		<form:select path="state" label="State of Residency:">
			<c:forEach var="state" items="${states}">
				<form:option value="${state}" label="${state}"/>
			</c:forEach>
		</form:select>
		
		<div class="buttons">
		
		<h3>Your Activity Level:</h3>
		<form:radiobutton path="activityLevel" value="inactive" label="Inactive" />
		<form:radiobutton path="activityLevel" value="sedentary" label="Sedentary" />
		<form:radiobutton path="activityLevel" value="active" label="Active" />
		<form:radiobutton path="activityLevel" value="extremely active" label="Extremely Active" /> 
		</div>
		
		<input type="submit" value="Submit" id="submit" />
		
	</form:form>

</section>











<c:import url="/WEB-INF/jsp/common/footer.jsp" />