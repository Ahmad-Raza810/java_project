<%-- 
    Document   : register
    Created on : 08-Oct-2024, 11:17:23 pm
    Author     : Ahmad Raza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="loginstyle.css" />

    </head>
    <body>
    <div class="container">
        <h1>Register</h1>
        <form action="RegisterServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="email">Email:</label>
            <input type="text" id="username" name="email" required><br>   
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Register</button>
        </form>
    
        <p><a href="index.html">Back to Home</a></p>
          <%-- Display error message if registration fails --%>
        <% String error = request.getParameter("error");
           if (error != null && error.equals("1")) { %>
            <p style="color: red;">Registration failed. Please try again.</p>
        <% } %>
    </div>
    </body>
</html>
 
