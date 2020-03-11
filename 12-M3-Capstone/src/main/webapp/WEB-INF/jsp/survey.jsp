<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section>

	<h1>What'd you think?</h1>

	<form <c:url value="/favoriteParks"/>" method="GET">

		<div class="formLine">
			<label for="favoritePark">Favorite Park</label> <select
				name="selectedPlanet">
				<option value="linkin">Linkin Park</option>
			</select>
		</div>

		<div class="formLine">
			<label for="askEmail">Email Address: </label> 
			<input type="text" name="userEmail" required/>
		</div>

		<div class="formLine">
			<label for="residentState">State of Residencey</label> <select
				name="residentState">
				<option value="Ohio">Ohio</option>
				<option value="California">California</option>
			</select>
		</div>


		<div class="formLine">

			<input type="radio" name="neat" /> <label for="neat">neat</label> 
			<input type="radio" name="neat" /> <label for="neat">neat</label> 
			<input type="radio" name="neat" /> <label for="neat">neat</label> 
			<input type="radio" name="neat" /> <label for="neat">neat</label> 
		</div>
		
		<input type="submit" value="Submit" />

	</form>


</section>