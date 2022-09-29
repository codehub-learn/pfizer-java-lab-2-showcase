package com.acme.university.factory;

import com.acme.university.model.University;

import java.util.List;

public class UniversityFactory implements AbstractFactory<University> {
    @Override
    public List<University> load(List<String> lines) {
        for (String line : lines) {
            String[] lineSplit = line.split(",");
        }
        return List.of();
    }
}
