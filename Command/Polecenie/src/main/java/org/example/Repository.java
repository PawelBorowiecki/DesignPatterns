package org.example;

import java.util.List;

public class Repository {
    private List<String> currentFiles;
    private List<String> previousFiles;

    public void commit(List<String> newFiles){
        previousFiles = currentFiles;
        currentFiles = newFiles;
        System.out.println("Files wera added from staging area to local repository by git commit command.");
    }

    public void reset(){
        currentFiles = previousFiles;
        previousFiles = List.of();
        System.out.println("Commits were cancelled by git reset command.");
    }
}
