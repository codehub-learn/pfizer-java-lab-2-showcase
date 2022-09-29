

package com.acme.university;

import com.acme.university.util.CSVParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        CSVParser parser = new CSVParser();
        List<String> universitiesAsStrings = parser.parse("csvFiles/preprocessed/universities.csv");
        universitiesAsStrings.stream().forEach(university -> log.info("University: {}", university));
        List<String> departmentsAsStrings = parser.parse("csvFiles/preprocessed/departments.csv");
        departmentsAsStrings.stream().forEach(department -> log.info("Department: {}", department));
        List<String> unitsAsStrings = parser.parse("csvFiles/preprocessed/units.csv");
        unitsAsStrings.stream().forEach(units -> log.info("Units: {}", units));
        List<String> studentsAsStrings = parser.parse("csvFiles/preprocessed/students.csv");
        studentsAsStrings.stream().forEach(student -> log.info("Student: {}", student));
        List<String> enrollmentsAsStrings = parser.parse("csvFiles/preprocessed/enrollments.csv");
        enrollmentsAsStrings.stream().forEach(enrollment -> log.info("Enrollment: {}", enrollment));


    }
}
