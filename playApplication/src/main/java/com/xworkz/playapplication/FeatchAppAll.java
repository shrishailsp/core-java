package com.xworkz.playapplication;

import java.sql.*;

public class FeatchAppAll {

        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String url="jdbc:mysql://localhost:3306/play";
            String username="root";
            String password="root";
            String featch="select*from Application_info ";


            try {
                Connection con= DriverManager.getConnection(url,username,password);
                Statement stm=con.createStatement();
                ResultSet re =  stm.executeQuery(featch);
                if (re.next()){
                    System.out.println("record exist..........");
                    String name= re.getString("ApplicationName");
                    System.out.print(name +" ");
                    int size= re.getInt("size");
                    System.out.print(size +" "  );
                    int id =re.getInt("ApplicationId");
                    System.out.print(id +" " );
                    String comName=re.getString("Companyname");
                    System.out.print(comName+"   ");
                    String type=re.getString("ApplicationType");
                    System.out.println(type);
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }
    }



