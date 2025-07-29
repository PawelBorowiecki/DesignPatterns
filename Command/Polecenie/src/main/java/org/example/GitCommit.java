package org.example;

import java.util.List;

public class GitCommit extends Command{
    private Repository repository;
    private List<String> newFiles;

    public GitCommit(String name, Repository repository, List<String> newFiles) {
        super(name);
        this.repository = repository;
        this.newFiles = newFiles;
    }

    @Override
    public void execute() {
        repository.commit(newFiles);
    }
}
