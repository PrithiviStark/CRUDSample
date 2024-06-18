    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Fruit List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Fid</th><th>Fname</th><th>Fprice</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="fruit" items="${list}"> 
    <tr>
    <td>${fruit.fid}</td>
    <td>${fruit.fname}</td>
    <td>${fruit.fprice}</td>
    <td><a href="editfruit/${fruit.fid}">Edit</a></td>
    <td><a href="deletefruit/${fruit.fid}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="addform">Add New Fruit</a>