package de.htwberlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {

    public String Triplet (List<Integer> B,List<Integer> A){

Exception exeption =new Exception();
        int one=0;
        int two=0;
        for (int i=0 ;i<3;i++){
            if(A.get(i)<B.get(i)){ two++; }
            if(A.get(i)>B.get(i)){ one++; }
        }

String Sentence = "first tripel has ("+ one +")  points, and the second tripel to has ("+two+ ") points.";

      if (A.size()!=3 || B.size()!=3){
          throw new Exeption();
        }
          /*{
          System.out.println("one of the inserted variables isnot a triple");
      }*/

return Sentence;
    }

}
