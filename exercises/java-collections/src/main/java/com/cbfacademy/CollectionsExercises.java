package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        LinkedList < Integer> integers = new LinkedList<>();
        integers.add(4);
        integers.add(5);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2);
        
        System.out.println(integers.size());
        return integers; 

    }

    public static Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
         Stack <Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        // print the first element of the stack on the screen
        System.out.println("First Element of the Stack: " + stack.firstElement());

        // print the last element of the stack on the screen
        System.out.println("Last Element of the Stack: " + stack.lastElement());

        // invoke the method pop() on the stack and print the result on the screen
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // invoke the push(4) method on the stack
        stack.push(4);

        // return the stack
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> result = useStack();
        System.out.println("Final Stack: " + result);
    }
    

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        throw new RuntimeException("Not implemented");
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
