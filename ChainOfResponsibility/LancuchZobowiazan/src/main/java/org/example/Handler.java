package org.example;

public interface Handler {
    void setNext(Handler h);
    void handle(String request);
}
