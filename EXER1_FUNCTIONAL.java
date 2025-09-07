// **************************************************************
// File Name: Exercise1_Functional.java
// Author: Cyril Jay Regonas
// Date: September 04 2025
// Deskripsyon: Nagpakita sa Functional Programming sa Java
//              gamit ang lambda expressions ug Stream API.
// **************************************************************

import java.util.Arrays;    // Para sa Arrays.asList()
import java.util.List;      // Para sa List interface
import java.util.stream.Collectors;  // Para sa collect() method

public class Exercise1_Functional {
    public static void main(String[] args) {
        // Dataset: lista sa mga numero (gihimo sa user)
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Functional nga pamaagi:
        // Ibutang lang unsay buhaton → pili ug even numbers unya i-square
        List<Integer> squaresOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)        // kuhaon lang ang mga even numbers
                .map(n -> n * n)                // himuon silang square
                .collect(Collectors.toList());  // ibutang sa usa ka bag-ong lista

        // Ipakita ang resulta
        System.out.println("Squares sa mga even numbers (Functional): " + squaresOfEven);
    }
}

// ----------------------------
// SAMPLE OUTPUT:
// ----------------------------
// Squares sa mga even numbers (Functional): [4, 16, 36, 64, 100]
//
// GENERAL COMMENT:
// Ang functional nga paagi mas dali ug mas klaro tan-awon.
// Dili na kinahanglan og detalye sa loop kay ang Stream API
// mao nay mobuhat sa proseso sa iteration.
// ----------------------------

