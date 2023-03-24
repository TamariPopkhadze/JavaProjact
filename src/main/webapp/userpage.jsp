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
  <title>Helloo</title>
  <link rel="stylesheet" type="text/css" href="./userpage.css">
</head>
<body>
<h1>Welcome ${Firstname}  ${Surname}</h1><br><br>
<form action="update-Servlet">
  <input type="hidden" name="USERNAME" value="${USERNAME}" >
  <h4>your username/Email is -> ${username}</h4>
  <label for="username">Update Username/Email</label>
  <input type="text" id="username" name="username"  placeholder="Update Username/Email" ><br><br>

  <h4>Your password is -> ${password}</h4>
  <label for="password">Update Password</label>
  <input type="password" id="password" name="password"  placeholder="Update Password" ><br><br>

  <h4>your firstname is -> ${Firstname}</h4>
  <label for="firstname">Update Firstname</label>
  <input type="text" id="firstname" name="firstname"  placeholder="Update firsname" ><br><br>

  <h4>your surname is -> ${Surname}</h4>
  <label for="surname">Update surname</label>
  <input type="text" id="surname" name="surname"  placeholder="Update surname" ><br><br>

  <h4>your profession is -> ${profession}</h4>
  <label for="profession">Update profession</label>
  <input type="text" id="profession" name="profession"  placeholder="Update profession" ><br><br>



  <input type="submit" value="update">
</form>
<a href="index.jsp">sign out</a>
</body>
</html>
