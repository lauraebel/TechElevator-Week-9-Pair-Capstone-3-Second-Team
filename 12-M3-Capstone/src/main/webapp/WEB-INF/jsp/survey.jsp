<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link href="https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap" rel="stylesheet">
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="survey-details">

	<h1>What'd you think?</h1>
	
	<c:url var="submitSurveyUrl" value="/survey" />
	
	<form:form action="${surveyUrl}" method="POST" modelAttribute="survey">
		
		<div class="errors">
			<form:errors path="*" cssClass="error"/>
		</div>
		
		<h4>Your Favorite National Park:</h4>
		<form:select path="favoriteParkCode" label="Favorite Park:">
			<c:forEach var="park" items="${parks}">			
				<form:option value="${park.code}" label="${park.name}"/>
			</c:forEach>
		</form:select>
		
		<h4>Your Email Address:</h4>
		<form:input path="email" label="Email Address:"/>
		
		<h4>Your State of Residency:</h4>
		<form:select path="state" label="State of Residency:">
			<c:forEach var="state" items="${states}">
				<form:option value="${state}" label="${state}"/>
			</c:forEach>
		</form:select>
		
		
		
		<h4>Your Activity Level:</h4>
		<form:radiobutton path="activityLevel" value="inactive" label="Inactive" />
		<form:radiobutton path="activityLevel" value="sedentary" label="Sedentary" />
		<form:radiobutton path="activityLevel" value="active" label="Active" />
		<form:radiobutton path="activityLevel" value="extremely active" label="Extremely Active" /> 
		
		
		<input type="submit" value="Submit" />
		
	</form:form>

	<%-- <form action="<c:url value="/survey"/>" method="POST">

		<div class="formLine">
			<label for="favoritePark">Favorite Park:</label>
			<select name="favoriteParkCode">
				<c:forEach items="${parks}" var="park">
					<option value="${park.code}" label="${park.name}" />
				</c:forEach>
			</select>
		</div>

		<div class="formLine">
			<label for="askEmail">Email Address:</label>
			<input type="text" name="email" />
		</div>

		<div class="formLine">
			<label for="residentState">State of Residency:</label>
			<select name="state">
				<c:forEach items="${states}" var="state">
					<option value="${state}" label="${state}" />
				</c:forEach>
			</select>
		</div>

		<div class="formLine">
			<label for="activityLevel">Activity Level:</label>
			<input type="radio" name="activityLevel" value="inactive" />Inactive 
			<input type="radio" name="activityLevel" value="sedentary" />Sedentary
			<input type="radio" name="activityLevel" value="active" />Active
			<input type="radio" name="activityLevel" value="extremely active" />Extremely Active
		</div>

		<input type="submit" value="Submit" />

	</form> --%>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />