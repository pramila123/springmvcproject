<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fee</title>
</head>
<body>
	<h1>Add Fee</h1>
	<hr>
	<spring:form method="post" action="fee" modelAttribute="fmodel">
		<table>
		<tr>
				<td>Student_Id</td>
				<td><spring:input path="student.sid"/></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><spring:input path="paid_date" type="date" /></td>
			</tr>
			<tr>
				<td>Tuition_fee</td>
				<td><spring:input path="tuition" id="t" onkeyup="add()" /></td>
			</tr>
			<tr>
				<td>Library_fee</td>
				<td><spring:input path="library" id="t1" onkeyup="add()" /></td>
			</tr>
			<tr>
				<td>Lab_fee</td>
				<td><spring:input path="lab" id="t2" onkeyup="add()" /></td>
			</tr>
			<tr>
				<td>Miscallenous</td>
				<td><spring:input path="miscallenous"  id="t3" onkeyup="add()"/></td>
			</tr>
			<tr>
				<td>Total_fee</td>
				<td><spring:input path="total" id="total" onkeyup="add()"/></td>
			</tr>
			<tr>
				<td>paid_amount</td>
				<td><spring:input path="paid"  id="p" onkeyup="add()"/></td>
			</tr>
			<tr>
				<td>Due_fee</td>
				<td><spring:input path="due" id="due" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Fee" > </td>
				
			</tr>
		</table>

	</spring:form>
	

	<script type="text/javascript">
	function add() {
		  var a = parseInt(document.getElementById("t").value);
		  var b = parseInt(document.getElementById("t1").value);
		  var c=parseInt(document.getElementById("t2").value);
		 var d= parseInt(document.getElementById("t3").value);
		  document.getElementById("total").value = a+b+c+d;
		  var paid=parseInt(document.getElementById("p").value);
			var m=parseInt(document.getElementById("total").value);
			document.getElementById("due").value = m-paid;
		}
	
	</script>
	<a href="getAllFee">Display Amount</a>
	
</body>
</html>