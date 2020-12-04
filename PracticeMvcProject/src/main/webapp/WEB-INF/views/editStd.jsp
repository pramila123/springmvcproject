<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Student</h1>
	<hr>
	<spring:form action="${pageContext.request.contextPath }/update/student" method="post" modelAttribute="smodel">
		<table>
			<tr>
				<td>Student Id</td>
				<td><spring:input path="sid" /></td>
			</tr>
			<tr>
				<td>FirstName</td>
				<td><spring:input path="fname" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><spring:input path="lname" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><spring:radiobutton path="gender" value="male"/>Male
				<spring:radiobutton path="gender" value="female"/>Female </td>
			</tr>
			<tr>
				<td>Admission Year</td>
				<td><spring:input path="joiningDate" type="date" /></td>
			</tr>
			<tr>
				<td>Faculty</td>
				<td><spring:input path="faculty.facultyname" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><spring:input path="phone" /></td>
			</tr>
			
			<tr>
				<td>Country</td>
				<td><spring:input path="address.country" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><spring:input path="address.city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><spring:select path="address.state">
				<spring:option value="--">---Select---</spring:option>
				<spring:option value="State-1">State-1</spring:option>
				<spring:option value="State-2">State-2</spring:option>
				<spring:option value="State-3">State-3</spring:option>
				<spring:option value="State-4">State-4</spring:option>
				<spring:option value="State-5">State-5</spring:option>
				<spring:option value="State-6">State-6</spring:option>
				<spring:option value="State-7">State-7</spring:option>
				</spring:select> </td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Student"> </td>
				
			</tr>
		</table>
<spring:hidden path="sid"/>
<spring:hidden path="faculty.fid"/>
<spring:hidden path="address.addrId"/>
	</spring:form>

</body>
</html>