package de.htwberlin;

import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    List<Integer> tripletA = Arrays.asList(17, 28, 30);
    List<Integer> tripletB = Arrays.asList(99, 16, 8);
    List<Integer> tripletC = Arrays.asList(99, 16, 8,2);
    List<Integer> tripletw = Arrays.asList(1, 25, 30);
    List<Integer> triplete = Arrays.asList(41, 66, 13);
    Triplet compar = new Triplet();
    System.out.println(compar.Triplet(tripletA,tripletB));
    System.out.println(compar.Triplet(tripletw,triplete));
    System.out.println(compar.Triplet(tripletA,tripletC));
    // TODO: Rufen Sie hier Ihre Methode auf
  }
}
