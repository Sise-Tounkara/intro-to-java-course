package com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FileManager {
    
    public List<String> readFile(String filename) throws IOException {
        List<String> myList = new ArrayList<>();

        
            Path inputPath = Paths.get(filename);
            myList.addAll(Files.readAllLines(inputPath));
            return myList;
    }

    public void copy(String inputFile, String outputFile) {
        Path sourcePath = Paths.get(inputFile);
        Path destinationPath = Paths.get(outputFile);
        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void reverseLines(String inputFile, String outputFile) throws IOException{
        Path inputPath = Paths.get(inputFile);
        Path outputPath = Paths.get(outputFile);

        List<String> text = Files.readAllLines(inputPath);
        Collections.reverse(text);
        Files.write(outputPath, text);

    }
}
