package com.pawel;

public class Main {
    public static void main(String[] args) {
        JdbcConnectionManager jdbcConnectionManager = JdbcConnectionManager.getInstance();
        jdbcConnectionManager.getConnection();
    }
}