package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> ops = new HashSet<String>();
        // Adding element to HashSet
        ops.add("K");
        ops.add("B");
        ops.add("C");
        ops.add("A");
        ops.add("K");
        ops.add("X");

        System.out.println("Original HashSet: " + ops);
        System.out.println("Size of HashSet: " + ops.size());

        System.out.println("Removing A from HashSet: " + ops.remove("A"));
        if (ops.remove("O")) {
            System.out.println("O removed from the Set");
        } else {
            System.out.println("O is not present in the Set");
        }
        System.out.println("Checking if K is present: " + ops.contains("K"));
        System.out.println("Updated HashSet: " + ops);
    }
}