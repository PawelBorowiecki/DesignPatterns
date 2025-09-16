package com.pawel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionManager {
    private static JdbcConnectionManager instance;
    private String url;

    private JdbcConnectionManager(){
        url = DB_URL;
    }

    public static JdbcConnectionManager getInstance(){
        if(instance == null){
            instance = new JdbcConnectionManager();
        }
        return instance;
    }

    public Connection getConnection(){
        try {
            return DriverManager.getConnection(url);
        }catch (SQLException e){
            throw new RuntimeException("Connection failed!", e);
        }
    }
}

