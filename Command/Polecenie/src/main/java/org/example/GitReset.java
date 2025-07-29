package org.example;

public class GitReset extends Command{
    private Repository repository;

    public GitReset(String name, Repository repository) {
        super(name);
        this.repository = repository;
    }

    @Override
    public void execute() {
        repository.reset();
    }
}
