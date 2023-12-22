package com.cbfacademy.search;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> myList = new ArrayList<>(List.of(2,5,10,22,67,99));
        int indexOfMyElement = LinearSearch.linearSearch(myList,99);

        int indexOfMyElement2 = BinarySearch.binarySearch(myList, 99);

        System.out.println(indexOfMyElement);
        System.out.println(indexOfMyElement2);
    }
}
