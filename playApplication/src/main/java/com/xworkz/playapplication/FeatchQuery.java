package com.xworkz.playapplication;

import java.sql.*;

public class FeatchQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/play";
        String  username="root";
        String password="root";
        String featchQuery="select *from Application_info  where ApplicationName=?";
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement(featchQuery);
            pstmt.setString(1,"uber");
            ResultSet rs=pstmt.executeQuery();
            if(rs.next()){
                System.out.println("name-"+rs.getString("ApplicationName"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
