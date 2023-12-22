package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateConfigurationFile {
    public static void main(String[] args) {
        List<String> properties = new ArrayList<>();
        properties.add("db.url=localhost");
        properties.add("db.port=5353");
        properties.add("db.user=cbfacademy");
        properties.add("db.password=password");

        Path outputPath = Paths.get("intro-to-java-course/homework/input-output/src/main/resources/configuration.properties");
        try {
            if (Files.exists(outputPath)) {
            System.out.println("File already exists");
        }
        else {
                Files.createFile(outputPath);
                System.out.println("File created!");
            }

            Files.write(outputPath, properties);


        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
}
