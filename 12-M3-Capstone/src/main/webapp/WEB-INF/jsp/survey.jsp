<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<h1>What'd you think?</h1>

	<form <c:url value="/survey"/>" method="POST">

		<div class="formLine">
			<label for="favoritePark">Favorite Park</label> <select
				name="favoriteParkCode">
				<c:forEach items="${parks}" var="park">
					<option value="${park.code}">${park.name}</option>
				</c:forEach>
			</select>
		</div>

		<div class="formLine">
			<label for="askEmail">Email Address: </label> 
			<input type="text" name="email" required/>
		</div>

		<div class="formLine">
			<label for="residentState">State of Residencey</label> <select
				name="state">
				<c:forEach items="${states}" var="state">
					<option value="${state}">${state}</option>
				</c:forEach>
			</select>
		</div>


		<div class="formLine">

			<input type="radio" name="activityLevel" value="inactive"/> <label for="neat">Inactive</label> 
			<input type="radio" name="activityLevel" value="sedentary"/> <label for="neat">Sedentary</label> 
			<input type="radio" name="activityLevel" value="active"/> <label for="neat">Active</label> 
			<input type="radio" name="activityLevel" value="extremely active"/> <label for="neat">Extremely Active</label> 
		</div>
		
		<input type="submit" value="Submit" />

	</form>


</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />