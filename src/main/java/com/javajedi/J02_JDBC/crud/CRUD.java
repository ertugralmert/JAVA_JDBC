package com.javajedi.J02_JDBC.crud;

import java.sql.*;

/**
 * Bu class'ta ben örnek olsun diye tanımlamalar yaptım. Tanımlamaları kendinize göre dğeiştirip bu sınıfı
 * rahatlıkla kullanabilirsiniz.
 */

public class CRUD {
    // create read update delete
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private  final String pathUrl = "jdbc:postgresql://localhost:5432/";
    private final String username = "postgres";
    private final String password = "root";
    private final String DatabaseName;

    public CRUD(String DatabaseName){
        this.DatabaseName = DatabaseName;
    }

    private boolean openConnection(){
        try{
            Driver.class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(pathUrl.concat(DatabaseName),username,password);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    private void closeConnection(){
        try{
            if(!connection.isClosed()){
                connection.close();
            }
        }catch (Exception exception){
            System.out.println("Beklenmeyen bir hata oluştur" + exception);
        }
    }

    /**
     * Bu method insert,update ve delete işlemlerini yerine getirir.
     * @param sql
     * @throws SQLException
     */
    public void executeUpdate(String sql) throws SQLException{
        if(openConnection()){
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.executeUpdate();
            closeConnection();
            System.out.println("Başarılı");
        }else {
            System.out.println("Bağlantı Kurulamadı");
        }
    }

    public ResultSet executeQuery(String sql) throws SQLException{
        if(openConnection()){
            preparedStatement = connection.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            return resultSet;
        }else {
            System.out.println("Bağlantı Kurulamadı");
            return null;
        }
    }
}
