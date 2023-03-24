<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="./index.css">
</head>
<body>

        <div>
    <h1>Welocme</h1>
        </div>
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

        <div>
            <a href="signup.jsp" > Sign up</a>
        </div>

</body>
</html>