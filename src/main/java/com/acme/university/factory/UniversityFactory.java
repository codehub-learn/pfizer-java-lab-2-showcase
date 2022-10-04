package com.acme.university.factory;

import com.acme.university.model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityFactory implements AbstractFactory<University> {
    @Override
    public List<University> load(List<String> lines) {
        List<University> universities = new ArrayList<>();
        for (String line : lines) {
            String[] lineSplit = line.split(",");
            universities.add(new University(Long.parseLong(lineSplit[0]),lineSplit[1],new ArrayList<>()));
        }
        return universities;
    }
}
