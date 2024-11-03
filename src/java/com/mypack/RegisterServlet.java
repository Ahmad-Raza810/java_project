package com.mypack;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




public class RegisterServlet extends HttpServlet {
    
    UserDaO userDao=new UserDaoClass();
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/html;charset=UTF-8");
              PrintWriter out = response.getWriter();
              String username=request.getParameter("username");
              String password=request.getParameter("password");
              String email=request.getParameter("email");
              User user=new User();
             
              user.setUsername(username);
              user.setPassword(password);
              user.setEmail(email);
              if (userDao.addUser(user)) {
                   out.println("user added!");
		            response.sendRedirect("login.jsp?registration=success");
		        } 
              else {
		            response.sendRedirect("register.jsp?error=1");
		        }
           {
               
           }
    }

}