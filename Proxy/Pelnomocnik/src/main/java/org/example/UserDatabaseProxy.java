package org.example;

import java.util.List;

public class UserDatabaseProxy implements Database{
    private Database service;
    private List<User> users;
    private String userInfo;

    public UserDatabaseProxy(Database service) {
        this.service = service;
    }

    @Override
    public List<User> listElements() {
        if(users == null){
            users = service.listElements();
        }
        return users;
    }

    @Override
    public String geElementInfo(String id) {
        if(userInfo == null){
            userInfo = service.geElementInfo(id);
        }else if(!userInfo.startsWith("User{id='" + id)){
            userInfo = service.geElementInfo(id);
        }
        return userInfo;
    }
}
