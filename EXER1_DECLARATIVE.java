// **************************************************************
// File Name: EXER1_DECLARATIVE.java
// Author: Cyril Jay L. Regonas
// Date: September 04 2025
// Description: Nagpakita sa Declarative Style sa Java
//              gamit ang stream() ug kondisyon.
// **************************************************************

import java.util.Arrays;  // Gamiton para makabuhat og fixed-size nga list
import java.util.List;    // Import para sa List collection

public class Exer1_Declarative {
    public static void main(String[] args) {
        // Listahan sa mga ngalan
        List<String> names = Arrays.asList("Bronto", "Butterfly", "Kitsune", "Mimic", "Dragonfly");
Been
        // Declarative style:
        // "Unsay gusto nato i-check?" → kung naa bay pangalan nga ≤ 3 karakter
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
// dili kung giunsa pag-loop sa mga data.
// Ang stream().anyMatch() kay automatic nga mo-agi sa tanang elemento.
// --------------------

