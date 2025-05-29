package com.pawel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionManager {
    private static JdbcConnectionManager instance;
    private String url;

    private JdbcConnectionManager(){
        url = "jdbc:postgresql://ep-billowing-term-a2yl0hr2.eu-central-1.aws.neon.tech/rentingdb?user=rentingdb_owner&password=npg_pBgqX47feahG&sslmode=require";
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
