package org.example;

public abstract class Controller {
    protected Mediator mediator;
    protected String event;
    protected String[] params;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public String getEvent() {
        return event;
    }

    public String[] getParams() {
        return params;
    }
}
