package org.example;

public interface Visitor {
    void visitLinux(Linux l);
    void visitWindows(Windows w);
}
