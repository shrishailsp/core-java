package com.xworkz.waterfallManagement.repositary;

import com.xworkz.waterfallManagement.dto.Waterfall;

import java.sql.*;
import java.util.List;

public class WaterfallRepositoryImpl implements WaterRepository{

    @Override
    public void saveWaterfall(Waterfall waterfall) {

        System.out.println("colling waterfall repository......");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/tourisam";
        String userName="root";
        String password="root";
        String insertQuery="insert into waterfall(name,place,river_name,state)"+"values(?,?,?,?)";

         Connection con=null;
        PreparedStatement pstmt=null;
        try {
            con= DriverManager.getConnection(url,userName,password);
            pstmt=con.prepareStatement(insertQuery);
            pstmt.setString(1,waterfall.getName());
            pstmt.setString(2,waterfall.getPlace());
            pstmt.setString(3,waterfall.getRiver_name());
            pstmt.setString(4,waterfall.getState());
            pstmt.execute();

            System.out.println("data inserting.......");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveWaterfall(List<Waterfall> waterfall1) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/tourisam";
        String userName="root";
        String password="root";
        String insertQuery="insert into waterfall(name,place,river_name,state)"+"value(?,?,?,?)";
        Connection con=null;
        PreparedStatement pstmt=null;

        try {
            con=DriverManager.getConnection(url,userName,password);
            pstmt=con.prepareStatement(insertQuery);
            for(Waterfall waterfall:waterfall1){
                pstmt.setString(1,waterfall.getName());
                pstmt.setString(2,waterfall.getRiver_name());
                pstmt.setString(3,waterfall.getPlace());
                pstmt.setString(4,waterfall.getState());
                pstmt.executeUpdate();
                System.out.println("inserting records.............");
            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public Waterfall getWaterfallbyName(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url="jdbc:mysql://localhost:3306/tourisam";
        String userNmae="root";
        String password="root";
        String featchquery="select*from waterfall where id=?";
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            conn=DriverManager.getConnection(url,userNmae,password);
            pstmt=conn.prepareStatement(featchquery);
            pstmt.setInt(1,id);
           rs= pstmt.executeQuery();
           Waterfall waterfall=new Waterfall();
           if(rs.next()){
               waterfall.setName(rs.getString("name"));
               waterfall.setPlace(rs.getString("place"));
               waterfall.setRiver_name(rs.getString("river_name"));
               waterfall.setState(rs.getString("state"));

           }
            return waterfall;

        } catch (SQLException e) {
            System.out.println(e);
        }


        return null;
    }
}
