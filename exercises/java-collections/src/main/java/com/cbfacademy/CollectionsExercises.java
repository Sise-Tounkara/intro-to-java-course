package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        integers.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        //  - add another 2 as the last element of the list
        integers.add(2);
        //  - add 4 as the 3rd element of the list
        integers.add(2,4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(integers.element());
        //  - return the list
        return integers;
    }
    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> integers = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        integers.push(5);
        integers.push(6);
        integers.push(8);
        integers.push(9);
        //  - print the first element of the stack on the screen
        System.out.print(integers.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(integers.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(integers.pop());
        //  - invoke the push(4) method on the stack
        integers.push(4);
        //  - return the stack
        return integers;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(integers.getFirst());
        //  - print the last element of the queue on the screen
        System.out.print(integers.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(integers.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(integers.element());
        //  - return the queue
        return integers;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> integers = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        integers.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        integers.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        integers.put(3, "Python");
        //  - add {4, Java} entry to the map
        integers.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        integers.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        integers.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(integers.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(integers.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(integers.containsValue("English"));
        //  - return the map
        return integers;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
