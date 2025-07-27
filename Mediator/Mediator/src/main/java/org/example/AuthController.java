package org.example;

public class AuthController extends Controller{
    public AuthController(){}

    public void login(String login, String password){
        if(params == null){
            params = new String[2];
        }
        event = "login";
        params[0] = login;
        params[1] = password;
        System.out.println(mediator.notifyComponent());
    }

    public void register(String login, String password){
        if(params == null){
            params = new String[2];
        }
        event = "register";
        params[0] = login;
        params[1] = password;
        System.out.println(mediator.notifyComponent());
    }
}
