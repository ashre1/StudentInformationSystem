
package com.ashish.SIS.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    PreparedStatement pstmt=null;
    boolean istrue=false;  
    public ConnectionFactory(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/sis","root","");
            stmt=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkLogin(String username,String password){
        String query="SELECT * FROM logintbl where username=? "
                + "AND password=?";
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs=pstmt.executeQuery();
            while(rs.next()){
                istrue=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return istrue;
    }
    
    public Connection getConnection(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","");
            stmt=con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
          return con;
    }
    
    
}

