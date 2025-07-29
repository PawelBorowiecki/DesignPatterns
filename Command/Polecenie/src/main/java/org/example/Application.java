package org.example;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Command commitCommand = new GitCommit("commit", repository, List.of("/home/user/file1", "/home/user/file2"));
        Command resetCommand = new GitReset("reset", repository);
        Terminal terminal = new Terminal(List.of(commitCommand, resetCommand));
        terminal.setCommand("commit");
        terminal.executeCommand();
        terminal.setCommand("reset");
        terminal.executeCommand();
    }
}