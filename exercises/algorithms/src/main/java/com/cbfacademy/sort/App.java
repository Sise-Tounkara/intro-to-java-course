package com.cbfacademy.sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] myArray = {2,8,6,1,3,5};
        ArraySorter myArraySorter = new QuickSort();

        myArraySorter.sort(myArray,0,myArray.length - 1);

        System.out.println(Arrays.toString(myArray));

    }
}
