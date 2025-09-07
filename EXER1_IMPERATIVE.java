// **************************************************************
// File Name: Exercise1_Imperative.java
// Author: Cyril Jay Regonas
// Date: September 04 2025
// Deskripsyon: Nagpakita sa Imperative Programming sa Java
//              pinaagi sa paggamit og loop ug manual nga proseso.
// **************************************************************

import java.util.ArrayList; // Gigamit para makahimo og dynamic list
import java.util.List;      // Para sa List nga koleksyon

public class Exercise1_Imperative {
    public static void main(String[] args) {
        // Paghimo og lista sa numero gikan 1 hangtod 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);  // gi-dugang ang numero usa-usa
        }

        // Imperative nga pamaagi:
        // Pagpili sa mga even numbers step-by-step
        List<Integer> evenNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
              
