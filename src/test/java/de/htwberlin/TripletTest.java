package de.htwberlin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletTest {
Triplet compare = new Triplet();

    @Test
    void triplettest() {
        List<Integer>  actual1 = List.of(1, 25, 30);
        List<Integer>  actual2 = List.of(41, 66, 13);
        assertTrue(compare.Triplet(actual1, actual2).equals("first tripel has (2)  points, " +
                "and the second tripel to has (1) points."));
    }

    @Test
    void triplettest2() {
        List<Integer>  actual1 = List.of(17, 28, 30);
        List<Integer>  actual2 = List.of(99, 16, 8);
        assertTrue(compare.Triplet(actual1, actual2).equals("first tripel has (1) " +
                " points, and the second tripel to has (2) points."));
    }


    @Test
    void exeptionttest() {
        List<Integer>  actual1 = List.of(1, 25 );
        List<Integer>  actual2 = List.of(41, 66, 13);
        assertThrows(Exeption.class, ()-> compare.Triplet(actual1, actual2));
    }
}