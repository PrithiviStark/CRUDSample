<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Fruit</h1>
       <form:form method="post" action="fsave">  
      	<table >
      	 <tr>  
          <td>Id : </td> 
          <td><form:input path="fid"  /></td>
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
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
