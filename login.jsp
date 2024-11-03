<!DOCTYPE html>
<html>
<head>
    <title>Library Management System - Login</title>
</head>
<body>
    <h2>Login to Library Management System</h2>
    <form action="AuthServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <input type="submit" value="Login">
    </form>
</body>
</html>
