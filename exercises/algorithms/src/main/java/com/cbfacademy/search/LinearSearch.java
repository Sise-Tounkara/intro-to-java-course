package com.cbfacademy.search;

import java.util.List;

public class LinearSearch {
    public static <T> int linearSearch(List<T> myList, T element){
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).equals(element)) {
                return i;
            }
        }
        //If the element is not in the list
        return -1;

    }
}
