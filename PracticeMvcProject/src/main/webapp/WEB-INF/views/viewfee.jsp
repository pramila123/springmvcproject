<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	

	<table border="1">
		<thead>
			<tr>
				<td>Student Id</td>
				<td>Name</td>
				<td>Gender</td>
				<td>Admission Year</td>
				<td>Faculty</td>
				<td>Tuition Fee</td>
				<td>Total Fee</td>
				<td>Paid Fee</td>
				<td>Due Fee</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
            <c:forEach var="std" items="${slist}">
            <tr>
				<td>${std.student.sid }</td>
				<td>${std.student.fname } &nbsp ${std.student.lname }</td>
				<td>${std.student.gender }</td>
				<td>${std.student.joiningDate } </td>
				<td>${std.student.faculty.facultyname } </td>
				<td>${std.tuition } </td>
				<td>${std.total }</td>
				<td>${std.paid }</td>
				<td>${std.due } </td>
				<td><input type="submit" value="Edit" onclick="editFee(${std.feeid})">
				<input type="submit" value="Delete" onclick="deleteFee(${std.feeid})">
				<input type="submit" value="Print" onclick="printFee(${std.feeid})"> </td>
				
			</tr>
            </c:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
	function editFee(feeid)
	{
		window.location="${pageContext.request.contextPath}/edit/fee/"+feeid;
	}
	
	function deleteFee(feeid)
	{
		var msg=confirm("Do you want to delete?");
		if(msg==true)
			{
			window.location="${pageContext.request.contextPath}/delete/fee/"+feeid;
			}
	}
	function printFee(feeid)
	{
		window.location="${pageContext.request.contextPath}/print/fee/"+feeid;
	}
	</script>
</body>
</html>
