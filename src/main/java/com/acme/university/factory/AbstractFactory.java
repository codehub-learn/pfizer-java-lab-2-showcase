package com.acme.university.factory;

import java.util.List;

public interface AbstractFactory<T> {
    List<T> load(List<String> lines);
}
