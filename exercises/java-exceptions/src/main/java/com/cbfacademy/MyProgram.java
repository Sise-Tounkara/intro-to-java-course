package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

public class MyProgram {
    public static void main(String[] args) {
        FileExtension fileExtension = new FileExtension();
        List<String> myList = new ArrayList<>();
        myList.add("App.java");
        myList.add("App.txt");
        myList.add(null);
        myList.add("App.md");

        System.out.println(fileExtension.map(myList));
    }
}
