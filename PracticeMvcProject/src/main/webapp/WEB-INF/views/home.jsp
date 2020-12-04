<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<script type="text/javascript">
		alert("${msg}");
	</script>

	<table border="1">
		<thead>
			<tr>
				<td>Student Id</td>
				<td>Name</td>
				<td>Gender</td>
				<td>Admission Year</td>
				<td>Faculty</td>
				<td>Address</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
            <c:forEach var="std" items="${slist}">
            <tr>
				<td>${std.sid }</td>
				<td>${std.fname } &nbsp ${std.lname }</td>
				<td>${std.gender }</td>
				<td>${std.joiningDate } </td>
				<td>${std.faculty.facultyname} </td>
				<td>${std.address.country} &nbsp ${std.address.state}</td>
				<td>
				<input type="submit" value="Add Student" onclick="addStd()">
				<input type="submit" value="Edit" onclick="editStd(${std.sid})">
				<input type="submit" value="Delete" onclick="deleteStd(${std.sid})">
				</td>
			</tr>
            </c:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
	function addStd(){
		location.replace("student");
		
	}
	function editStd(sid)
	{
		window.location="${pageContext.request.contextPath}/edit/"+sid;
	}
	
	function deleteStd(sid)
	{
		var msg=confirm("Do you want to delete?");
		if(msg==true)
			{
			window.location="${pageContext.request.contextPath}/delete/"+sid;
			}
	}
	</script>
</body>
</html>
