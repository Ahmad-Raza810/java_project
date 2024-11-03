package com.mypack;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.*;




public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              response.setContentType("text/html;charset=UTF-8");
              PrintWriter out = response.getWriter();
              
              String username=request.getParameter("username");
              String password=request.getParameter("password");
              UserDaO userdao=new UserDaoClass();
              
           {
               if(userdao.isValidate(username,password))
               {
                   HttpSession session=request.getSession();
                   session.setAttribute("username",username);
                   response.sendRedirect("welcome.jsp");
               }
               else
               {
                response.sendRedirect("login.jsp?error=1");
               }
           }
    }

}