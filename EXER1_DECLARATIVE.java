// **************************************************************
// File Name: EXER1_DECLARATIVE.java
// Author: Cyril Jay L. Regonas
// Date: September 05 2025
// Description: Demonstrates Declarative Style in Java
//              using stream() and condition.
// **************************************************************

import java.util.Arrays;  // Used to create a fixed-size list
import java.util.List;    // Import for the List collection

public class Exer1_Declarative {
    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("Bronto", "Butterfly", "Kitsune", "Mimic", "Dragonfly");

        // Declarative style:
        // "What do we want to check?" → if there is a name with ≤ 3 characters
        boolean hasShortName = names.stream().anyMatch(n -> n.length() <= 3);

        // Display the result
        System.out.println("Is there a short name (<=3 chars)? " + hasShortName);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Is there a short name (<=3 chars)? false
//
// GENERAL COMMENT:
// In the declarative style, the focus is on *what should be done*,
// not on how the loop is executed.
// The stream().anyMatch() automatically traverses all elements.
// ----------------------------
