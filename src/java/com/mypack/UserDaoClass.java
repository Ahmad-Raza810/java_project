package com.mypack;

// @author Ahmad Raza
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDaoClass implements UserDaO{
    @Override
   public boolean  isValidate(String username,String password){
      String query = "SELECT * FROM person1 WHERE username=? AND `password`=?";
try {
    
    System.out.println("Connection build ho rha hai!");
    Connection con = DbClass.getConnection();  // Ensure DbClass.getConnection() works properly
    System.out.println("Connection ban gya!");
    PreparedStatement st = con.prepareStatement(query);
    st.setString(1, username);  // Assuming 'username' is a variable in your method
    st.setString(2, password);  // Assuming 'password' is a variable in your method
    ResultSet resultSet = st.executeQuery();  // Now execute the query
    System.out.println("Query execute ho gyi hai!");
            return resultSet.next();
    }
        
        catch (SQLException e) 
        {
	       e.printStackTrace();
	       return false;
        }
   
}
   @Override
    public boolean addUser(User user)
    {
         String query = "INSERT INTO person1(username,password,email)  VALUES(?,?,?)";
try {    
    System.out.println("Connection build ho rha hai!");
    Connection con = DbClass.getConnection();  // Ensure DbClass.getConnection() works properly
    System.out.println("Connection ban gya!");

    PreparedStatement st = con.prepareStatement(query);
    

    st.setString(1, user.getUsername()); 
    st.setString(2, user.getPassword());
    st.setString(3, user.getEmail());
    
    int row = st.executeUpdate();
    return row>0;
    }

catch (SQLException e) 
        {
               System.out.println("gadbad hai bhai code mai");
	       e.printStackTrace();
	       return false;
        }
    }
}

