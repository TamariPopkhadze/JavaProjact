<%--
  Created by IntelliJ IDEA.
  User: tato
  Date: 21.03.23
  Time: 04:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign UP</title>
    <link rel="stylesheet" type="text/css" href="./signUp.css">
</head>
<body>
<form action="signup-servlet">
    <label for="username">Username/Email</label>
    <input type="text" id="username" name="username" placeholder="Enter Username/Email" required><br><br>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="Enter Password" required><br><br>

    <label for="repeatPassword">Please, confirm password</label>
    <input type="password" id="repeatPassword" name="repeatPassword" placeholder=" Repeat password" required><br><br>

    <label for="firstname">firstname</label>
    <input type="text" id="firstname" name="firstname" placeholder="Enter firsname" required><br><br>

    <label for="surname">surname</label>
    <input type="text" id="surname" name="surname" placeholder="Enter surname" required><br><br>

    <label for="profession">profession</label>
    <input type="text" id="profession" name="profession" placeholder="Enter profession" required><br><br>



    <input type="submit" value="Sign up">
</form>
<a href="index.jsp">Open log in Page</a>
</body>
</html>
