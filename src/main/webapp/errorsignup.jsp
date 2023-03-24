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
    <link rel="stylesheet" type="text/css" href="./errorSignup.css">
</head>
<body>
<h1> Sorry please repeat your password correctly</h1>
<form action="signup-servlet">
    <div>
    <label for="username">Username/Email</label>
    <input type="text" id="username" name="username" value="<%=request.getParameter("username")%>" placeholder="Enter Username/Email" required><br><br>
    </div>
    <div>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" value="<%=request.getParameter("password")%>" placeholder="Enter Password" required><br><br>
    </div>
    <div>
    <label for="repeatPassword">Please, confirm password</label>
    <input type="password" id="repeatPassword" name="repeatPassword" value="<%=request.getParameter("repeatPassword")%>"  placeholder="Enter Repeat password" required><br><br>
    </div>
    <div>
    <label for="firstname">firstname</label>
    <input type="text" id="firstname" name="firstname" value="<%=request.getParameter("firstname")%>" placeholder="Enter firsname" required><br><br>
    </div>
    <div>
    <label for="surname">surname</label>
    <input type="text" id="surname" name="surname" value="<%=request.getParameter("surname")%>" placeholder="Enter surname" required><br><br>
    </div>
    <div>
    <label for="profession">profession</label>
    <input type="text" id="profession" name="profession" value="<%=request.getParameter("profession")%>" placeholder="Enter profession" required><br><br>
    </div>
    <input type="submit" value="Sign Up">
</form>
<a href="index.jsp">Sign In</a>
</body>
</html>
