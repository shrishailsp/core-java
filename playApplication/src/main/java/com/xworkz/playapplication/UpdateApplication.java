package com.xworkz.playapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApplication {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("loading a driver class!!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
        String url = "jdbc:mysql://localhost:3306/play";
        String userName = "root";
        String password = "root";
        String updateQuery = "update Application_Info set ApplicationName='bgmi',size=500 where ApplicationId=7";
        Connection con=null;
        Statement stm=null;
        try {
             con = DriverManager.getConnection(url, userName, password);
             stm = con.createStatement();
            boolean updateResult = stm.execute(updateQuery);
            System.out.println("getting connction to table!!!"+updateResult);
            System.out.println("updating values!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(con!=null){
            try {
                con.close();
                System.out.println("closing connection");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            }
            if(stm!=null) {
                try {
                    stm.close();
                    System.out.println("closing statment");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
