package com.cbfacademy.search;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> myList, int target) {

        int lowIndex = 0;
        int highIndex = myList.size() - 1;
        while (lowIndex <= highIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;
            int valueInMiddle = myList.get(midIndex);
            if (valueInMiddle < target) {
                lowIndex = midIndex + 1;
            }
            else if (valueInMiddle > target) {
                highIndex = midIndex -1;
            }
            else {
                return midIndex;
            }
        }
        // If target is not found
        return -1;
    }
}
