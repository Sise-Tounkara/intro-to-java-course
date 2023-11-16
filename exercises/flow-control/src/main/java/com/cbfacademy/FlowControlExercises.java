package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> fizzBuzzList = new ArrayList<>();
        for (int number : numbers) {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                 //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
                fizzBuzzList.add("FizzBuzz");
            }
            else if (number % 3 == 0) {
                //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
                fizzBuzzList.add("Fizz");
            }
            else if (number % 5 == 0) {
                //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
                fizzBuzzList.add("Buzz");
            }
            else {
                //  - it adds the element to the list in any other case
                fizzBuzzList.add(String.valueOf(number));
            }
        }
        //  - it returns the constructed list
        return fizzBuzzList;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}

        switch (number){
            case 1:
            return "January";
            case 2:
            return "February";
            case 3:
            return "March";
            case 4:
            return "April";
            case 5:
            return "May";
            case 6:
            return "June";
            case 7:
            return "July";
            case 8:
            return "August";
            case 9:
            return "September";
            case 10:
            return "October";
            case 11:
            return "November";
            case 12:
            return "December";
            //  - if the ${number} is invalid, the method should return "Invalid month number"
            default:
            return "Invalid month number";
            }
        
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List <Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            integerList.add(i);
        }
        //  - determines the sum of all the even numbers in the list
        int calculatedSumOfEvens = 0;
        for (int j = 2; j <= integerList.size(); j += 2) {
            calculatedSumOfEvens += j;

        }
        //  - determines the sum of all the odd numbers in the list
        int CalculatedSumOfOdds = 0;
        for (int j = 1; j < integerList.size(); j += 2) {
        CalculatedSumOfOdds += j;

        }
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        Map <String, Integer> sumsMap = new HashMap<>();
        sumsMap.put("SumOfEvens", calculatedSumOfEvens);
        sumsMap.put("SumOfOdds", CalculatedSumOfOdds);
        return sumsMap;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        List<Integer> reversedArrayList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i-- ) {
            reversedArrayList.add(numbers.get(i));
        }
        return reversedArrayList;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
