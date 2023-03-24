<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="./errorSignin.css">
</head>
<body>
<h1>Either username or password was incorrect, please try again</h1>
<form action="loginServlet">
    <div>
    <label for="username">Username/Email</label>
    <input type="text" id="username" name="username" placeholder="Enter Username/Email" required><br><br>
    </div>
    <div>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter Password" required><br><br>
    </div>
    <input type="submit" value="Sign in">
</form>
<a href="signup.jsp" > Sign up</a>
</body>
</html>