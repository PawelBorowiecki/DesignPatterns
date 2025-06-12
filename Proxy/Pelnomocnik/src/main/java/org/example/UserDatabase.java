package org.example;

import java.util.List;
import java.util.Optional;

public class UserDatabase implements Database{
    List<User> users;

    public UserDatabase(List<User> users) {
        this.users = users;
    }

    @Override
    public List<User> listElements() {
        return users;
    }

    @Override
    public String geElementInfo(String id) {
        Optional<User> user = users.stream().filter(u -> u.getId().equals(id)).findAny();
        if(user.isPresent()){
            return user.get().toString();
        }
        return "Wybrany element nie istnieje w bazie";
    }
}
