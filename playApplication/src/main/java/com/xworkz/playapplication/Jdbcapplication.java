package com.xworkz.playapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcapplication {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("loading driver class");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
     String jdbcurl ="jdbc:mysql://localhost:3306/play";
     String username ="root";
     String password ="root";

     String insertQuery="insert into application_info(ApplicationId,ApplicationName,size,Companyname,ApplicationType)"+
             "values(6,'paypal',50.5,'paypal','fintech'),(7,'condycrush',100,'vitage','game')";
//      String insertQuery1="insert into application_info(Applicationid,Applicationname,size,Companyname,ApplicationType)"+
//              "values(7,'condycrush',100,'vitage','game')";
//        String insertQuery2="insert into application_info(Applicationid,Applicationname,size,Companyname,ApplicationType)"+
//                "values(7,'condycrush',100,'vitage','game')";
//        String insertQuery3="insert into application_info(Applicationid,Applicationname,size,Companyname,ApplicationType)"+
//                "values(7,'condycrush',100,'vitage','game')";
//        String insertQuery="insert into application_info(Applicationid,Applicationname,size,Companyname,ApplicationType)"+
//                "values(7,'condycrush',100,'vitage','game')";
        Connection conn=null;
        Statement stmt=null;

        try {
               conn= DriverManager.getConnection(jdbcurl,username,password);
                stmt =conn.createStatement();
              boolean result= stmt.execute(insertQuery);
            System.out.println("insert data in to data base!!!!!!!!!"+result);
            System.out.println("getting connecting to database");
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        finally {
            if(conn!=null) {
                try {
                    conn.close();
                    System.out.println("connection is closed");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt!=null) {
                try {
                    stmt.close();
                    System.out.println("statment  is closed");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }


            }
        }

    }

