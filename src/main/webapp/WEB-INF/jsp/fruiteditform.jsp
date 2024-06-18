<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Edit Fruit</h1>
       <form:form method="POST" action="/CRUDSample/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="fid" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="fname"  /></td>
         </tr>  
         <tr>  
          <td>Price :</td>  
          <td><form:input path="fprice" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
