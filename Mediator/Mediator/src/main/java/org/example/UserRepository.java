package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public User findUser(String login, String password){
        Optional<User> user = users.stream().filter(u -> u.getLogin().equals(login) && u.getPassword().equals(password)).findAny();
        if(user.isPresent()){
            return user.get();
        }

        return null;
    }

    public boolean addUser(User user){
        return users.add(user);
    }
}
