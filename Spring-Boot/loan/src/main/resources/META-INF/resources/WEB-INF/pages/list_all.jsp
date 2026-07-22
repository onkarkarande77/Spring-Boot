<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" 
   rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<meta charset="UTF-8">
<title>List Page</title>
</head>
<body>
      <div class="container">
      <div class="row justify-content-center">
      <div class="col mt-5">
      <h2 class="text-muted text-center display-6">Welcome ${username}</h2>
      <hr>
      <table class="table table-striped" >
         <tr>
               <th>ID</th>
               <th>loan Desc</th>
               <th>mobile No</th>
               <th>disb Date</th>
               <th>next Due Date</th>
               <th></th>
               <th></th>
         </tr>
      <a:forEach items="${list}" var="l">
        <tr>
            <td>${l.loanId}</td>
            <td>${l.loanDesc}</td>
            <td>${l.mobileNo}</td>
            <td>${l.disbDate}</td>
            <td>${l.nextDueDate}</td><!-- ${pageContext.request.contextPath} -->
            <td>   <a href="delete_loan?id=${l.loanId}"
                    class="btn btn-danger btn-sm"
                    onclick="return confirm('Are you sure you want to delete this record?');">
                 DELETE
                 </a>
                </td>
                <td><a href="update_loan?id=${l.loanId}"
                    class="btn btn-primary btn-sm"> UPDATE</a></td>
                   
       </tr>
       
      
      </a:forEach>
      
      
      
      </table>
      
      <a href="add_data" class="btn btn-primary btn-sm"><h2>ADD DATA</h2></a>
      
     <!--  <a href="add"><h2>Click to add</h2></a> -->
     
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" 
       integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</div>
</div>
</div>

</body>        
</html>