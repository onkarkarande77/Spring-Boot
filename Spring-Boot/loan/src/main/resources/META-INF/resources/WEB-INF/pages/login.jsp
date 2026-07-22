<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="beige" text="maroon">
${errMsg}
 <form action="loginaction" >
   <input type="text" name="userName" placeholder="userName"/>
   <input type="password" name="userPwd" placeholder="password"/>
   <input type="submit" value="login">
 </form>

</body>
</html>