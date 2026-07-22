<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" 
   rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <div class="container">
       <div class=" row justify-content-center">
          
          <div class="col-lg-6 mt-5">
          
          <h2 class="text-center display-4">Welcome ${username}</h2>
          <form action="update_action">
         
         <input type="hidden" name="loanId" value="${ln_bn.getLoanId()}" class="form-control form-control-sm"/>
         <input type="text" name="loanee" value="${ln_bn.getLoanee()}" class="form-control form-control-sm"/>
          <input type="text" name="loanDesc" value="${ln_bn.getLoanDesc()}" class="form-control form-control-sm"/>
         <input type="text" name="mobileNo" value="${ln_bn.getMobileNo()}" class="form-control form-control-sm"/>
         <input type="text" name="disbDate" value="${ln_bn.getDisbDate()}" class="form-control form-control-sm"/>
         <input type="text" name="nextDueDate"value="${ln_bn.getNextDueDate()}" class="form-control form-control-sm"/>
         <input type="submit" value="confirm changes" class="btn btn-warning"/>
         </form>
         
       </div>
       </div>
       </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" 
       integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
       
</body>
</html>