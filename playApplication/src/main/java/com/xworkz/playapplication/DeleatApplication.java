package com.xworkz.playapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleatApplication {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connecting driver classs.....");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
        String url = "jdbc:mysql://localhost:3306/play";
        String userName = "root";
        String pasword = "root";
        String deleatQueri = "Delete from Application_info where ApplicationName='snap'";
        Connection con = null;
        Statement stm = null;
        try {
            con = DriverManager.getConnection(url, userName, pasword);
          stm=  con.createStatement();
            boolean re = stm.execute(deleatQueri);
            System.out.println("deleat record !!!" + re);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            }
            if(stm!=null){
            try {
                stm.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            }
        }
        }
    }

