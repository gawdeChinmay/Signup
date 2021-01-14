
package com.cloud.dao;

import java.sql.PreparedStatement;
import com.cloud.services.SignupDetails;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class signuUpDao {
    
      public void AddDetail( SignupDetails signupdetail ) throws ClassNotFoundException, SQLException {
PreparedStatement myStmt = null;
        	
        
        Class classdriver = Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection myConn = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/signup", "java", "java");

        
       String sql = "insert into signupdetails "
				+"(UserFirstName, UserLastName, PhoneNumber, Password)"
				+"values( ?, ?, ?, ?)";
       myStmt = myConn.prepareStatement(sql);
    
       

				myStmt.setString(1, signupdetail.getUserFirstName());
		myStmt.setString(2, signupdetail.getUserLastName());
		myStmt.setInt(3,signupdetail.getPhoneNumber() );
                myStmt.setString(4, signupdetail.getPassword());
		
				 myStmt.execute();
                                 
                                 myConn.close();
				
    }

    
}
