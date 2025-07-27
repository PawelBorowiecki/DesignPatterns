package org.example;

import java.util.UUID;

public class AuthService implements Mediator {
    private UserRepository repository;
    private AuthController controller;

    public AuthService(UserRepository repository, AuthController controller) {
        this.repository = repository;
        this.controller = controller;
    }

    @Override
    public String notifyComponent(){
        String[] params = controller.getParams();
        if(controller.getEvent().equals("login")){
            return reactOnLogin(params[0], params[1]);
        }else if(controller.getEvent().equals("register")){
            return reactOnRegister(params[0], params[1]);
        }
        return "Nie znaleziono operacji";
    }

    private String reactOnLogin(String login, String password){
        User user = repository.findUser(login, password);
        String result;
        if(user != null){
            result = "Zalogowano uzytkownika o loginie: " + login;
        }else{
            result = "Nie znaleziono uzytkownika.";
        }
        return result;
    }

    private String reactOnRegister(String login, String password){
        User user = new User(UUID.randomUUID().toString(), login, password);
        if(repository.addUser(user)){
            return "Zarejestrowano uzytkownika";
        }
        return "Nie udalo sie zarejestrowac uzytkownika";
    }
}
