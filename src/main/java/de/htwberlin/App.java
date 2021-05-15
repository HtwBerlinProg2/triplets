package de.htwberlin;

import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    List<Integer> tripletA = Arrays.asList(17, 28, 30);
    List<Integer> tripletB = Arrays.asList(99, 16, 8);
    List<Integer> tripletC = Arrays.asList(99, 16, 8,2);
    Triplet compar = new Triplet();
    System.out.println(compar.Triplet(tripletA,tripletB));
    System.out.println(compar.Triplet(tripletA,tripletC));
    // TODO: Rufen Sie hier Ihre Methode auf
  }
}
