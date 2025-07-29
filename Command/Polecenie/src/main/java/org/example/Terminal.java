package org.example;

import java.util.List;
import java.util.Optional;

public class Terminal {
    private List<Command> commands;
    private Command currentCommand;

    public Terminal(List<Command> availableCommands) {
        this.commands = availableCommands;
    }

    public void setCommand(String commandName){
        Optional<Command> commandOpt = commands.stream().filter(c -> c.getName().equals(commandName)).findAny();
        if(commandOpt.isPresent()){
            currentCommand = commandOpt.get();
        }
    }

    public void executeCommand(){
        currentCommand.execute();
    }
}
