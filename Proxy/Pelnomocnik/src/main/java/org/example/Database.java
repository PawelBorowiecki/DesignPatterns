package org.example;

import java.util.List;

public interface Database {
    List<User> listElements();
    String geElementInfo(String id);
}
