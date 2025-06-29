package org.example;

import java.util.Stack;

public class Caretaker {
    Stack<Memento> history;

    public Caretaker() {
        history = new Stack<>();
    }

    public void addMemento(Memento m){
        history.push(m);
    }

    public void reclaim(){
        if(!history.empty()){
            System.out.println("Przywrocono poprzednie wspolrzedne.");
            history.pop().restore();
        }
    }
}
