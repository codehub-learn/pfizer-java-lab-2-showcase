package com.acme.university.util;

import com.acme.university.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private static final Logger log = LoggerFactory.getLogger(CSVParser.class);

    public List<String> parse(String filepath) {
        final ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        } catch (IOException ioException) {
            log.error("Exception thrown {}", ioException.getMessage());
        }
        return lines;
    }
}
