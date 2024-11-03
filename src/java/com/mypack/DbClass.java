package com.mypack;

/**
 *
 * @author Ahmad Raza
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@SuppressWarnings("CallToPrintStackTrace")
public class DbClass {
         private static final String URL = "jdbc:mysql://localhost:3306/ahmad";
	 private static final String USERNAME = "root";
	 //private static final String PASSWORD = "";
     static {
              try {
                     // Load the MySQL JDBC driver
                     Class.forName("com.mysql.cj.jdbc.Driver");
                  }
                 
              catch (ClassNotFoundException e) 
              {
                 e.printStackTrace();
              }
            }

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME,"");
    }
 
    
}
