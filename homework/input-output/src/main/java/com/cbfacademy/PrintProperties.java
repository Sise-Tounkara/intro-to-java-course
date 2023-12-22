package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintProperties {
    
    public static void main(String[] args) {

        Path inputPath = Paths.get("intro-to-java-course/homework/input-output/src/main/resources/example.properties");
        try {
            List<String> content = Files.readAllLines(inputPath);
            content.forEach(System.out::println);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
