package com.example.Projact;

import javax.servlet.ServletContext;
import java.sql.*;

public class DatabasesManager {
    private static final String DATABASE_NAME = "datebase";
    private static final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "user";
    private static final String PASSWORD = "Paroli69!";
    private static final String TABLE_NAME = "users";

    public  void insert(User User) {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String query = "insert into " + TABLE_NAME + "(username,Firstname, Surname, Profession,Paroli) values (?, ?, ?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, User.getUsername());
            preparedStatement.setString(2, User.getFirstname());
            preparedStatement.setString(3, User.getSurname());
            preparedStatement.setString(4, User.getProfession());
            preparedStatement.setString(5, User.getPassword());


            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e);
        }
    }
    public boolean containSignUp(User User){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String query = " select * from " + TABLE_NAME + " where username = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, User.getUsername());
            ResultSet rs;
            rs = ps.executeQuery();
            boolean res = rs.next();
            rs.close();
            return res;
        } catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return false;
    }
    public boolean contain(User User){
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);

            String query = " select * from " + TABLE_NAME + " where username = ? and Paroli = ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, User.getUsername());
            ps.setString(2, User.getPassword());
            ResultSet rs;
            rs = ps.executeQuery();

            boolean res = rs.next();
            rs.close();
            return res;
        } catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return false;
    }
    public String getUserName(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query = "select Firstname FROM " + TABLE_NAME + " where username = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getUsername());
            ResultSet rs = preparedStatement.executeQuery();

                if(rs.next()) {
                    String firstName = rs.getString("Firstname");
                    return firstName;
                }
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return null;
    }
    public String getUserLasName(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query = "select Surname FROM " + TABLE_NAME + " where username = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getUsername());
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()) {
                String surname = rs.getString("Surname");
                return surname;
            }
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return null;
    }

    public String getUserProf(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query = "select Profession FROM " + TABLE_NAME + " where username = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getUsername());
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()) {
                String profession = rs.getString("Profession");
                return profession;
            }
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return null;
    }
    public String getPassword(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query = "select Paroli FROM " + TABLE_NAME + " where username = ? ";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getUsername());
            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()) {
                String password = rs.getString("Paroli");
                return password;
            }
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }
        return null;
    }
    public void updateFirstname(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query  = "UPDATE users SET Firstname = ? WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getFirstname());
            preparedStatement.setString(2, User.getKey());

            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }

    }
    public void updateUsername(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query  = "UPDATE users SET username = ? WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);


            preparedStatement.setString(1, User.getUsername());
            preparedStatement.setString(2, User.getKey());

            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }

    }
    public void updatePassword(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query  = "UPDATE users SET Paroli = ? WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);


            preparedStatement.setString(1, User.getPassword());
            preparedStatement.setString(2, User.getKey());

            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }

    }


    public void updateSurname(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query  = "UPDATE users SET Surname = ? WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getSurname());
            preparedStatement.setString(2, User.getKey());

            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }

    }
    public void updateProfession(User User)  {

        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            String Query  = "UPDATE users SET Profession = ? WHERE username = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(Query);

            preparedStatement.setString(1, User.getProfession());
            preparedStatement.setString(2, User.getKey());

            preparedStatement.executeUpdate();
        }catch (Exception e) {
            System.out.println("Got an prablem!");
            System.out.println(e);
        }

    }



}