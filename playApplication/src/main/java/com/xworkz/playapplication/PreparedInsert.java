package com.xworkz.playapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsert {


        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            String jdbcUrl ="jdbc:mysql://localhost:3306/play";
            String userName ="root";
            String password = "root";

            String insertQuery =" INSERT INTO Application_info(Applicationid,ApplicationName,size,companyname,ApplicationType)" + " VALUES(?,?,?,?,?)";

            try {
                Connection conn = DriverManager.getConnection(jdbcUrl,userName,password);
                PreparedStatement pstmt =conn.prepareStatement(insertQuery);
                pstmt.setInt(1,8);
                pstmt.setString(2,"uber");
                pstmt.setInt(3,150);
                pstmt.setString(4,"uber");
                pstmt.setString(5,"Travel");
                pstmt.execute();

                pstmt.setInt(1,9);
                pstmt.setString(2,"Zomato");
                pstmt.setInt(3,120);
                pstmt.setString(4,"zomato");
                pstmt.setString(5,"foodApp");
                pstmt.execute();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }



        }
    }

