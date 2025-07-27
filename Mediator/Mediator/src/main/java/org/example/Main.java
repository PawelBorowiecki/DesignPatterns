package org.example;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        AuthController controller = new AuthController();
        Mediator mediator = new AuthService(repository, controller);
        controller.setMediator(mediator);
        controller.register("Jan", "Jan123");
        controller.register("Kuba", "Kuba123");
        controller.login("Jan", "Jan123");
    }
}