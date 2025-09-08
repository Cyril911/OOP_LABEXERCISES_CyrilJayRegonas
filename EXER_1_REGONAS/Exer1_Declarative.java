// **************************************************************
// File Name: EXER1_DECLARATIVE.java
// Author: Cyril Jay L. Regonas
// Date: September 05 2025
// Deskripsyon: Nagpakita sa Declarative Style sa Java
//              gamit ang stream() ug kondisyon.
// **************************************************************

import java.util.Arrays;  // Gigamit para makahimo og fixed-size nga lista
import java.util.List;    // Import para sa List nga koleksyon

public class Exer1_Declarative {
    public static void main(String[] args) {
        // Lista sa mga ngalan
        List<String> names = Arrays.asList("Bronto", "Butterfly", "Kitsune", "Mimic", "Dragonfly");

        // Declarative nga pamaagi:
        // "Unsay gusto nato i-check?" → kung naa bay ngalan nga ≤ 3 ka karakter
        boolean hasShortName = names.stream().anyMatch(n -> n.length() <= 3);

        // Ipakita ang resulta
        System.out.println("Naa bay ngalan nga mubo (<=3 chars)? " + hasShortName);
    }
}

// ----------------------------
// SAMPLE OUTPUT
// ----------------------------
// Naa bay ngalan nga mubo (<=3 chars)? false
//
// GENERAL COMMENT:
// Sa declarative nga paagi, ang focus kay *unsa ang buhaton*,
// dili kung giunsa ang pag-loop.
// Ang stream().anyMatch() awtomatik nga mo-traverse sa tanang elemento.
// ----------------------------