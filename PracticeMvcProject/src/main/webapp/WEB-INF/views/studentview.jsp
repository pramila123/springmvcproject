<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
				
				
			</tr>
            </c:forEach>
		</tbody>
	</table>
</body>
</html>