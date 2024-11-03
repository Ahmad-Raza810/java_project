<%-- 
    Document   : login
    Created on : 11-Oct-2024, 7:48:36 pm
    Author     : Ahmad Raza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="loginstyle.css" />

    </head>
<body>
    <div class="container">
        <h1>Login</h1>
        <form action="LoginServlet" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Login</button>
        </form>

        <p><a href="index.html">Back to Home</a></p>
         <% String error=request.getParameter("error");
           if(error!=null && error.equals("1"))
           {
           %>
             <p style="color:red;">Invalid username or password,please try again!</p>
           <%}%>
           <%-- Display error message if Register Successful --%>
        <% String rs = request.getParameter("registration");
            if (rs != null && rs.equals("success")) { %>
                <p style="color: green;">Your Registration is Successful. Please Login.</p>
        <% } %>
    </body>
</div>
</html>
