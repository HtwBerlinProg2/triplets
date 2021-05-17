package de.htwberlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {

    public String Triplet (List<Integer> B,List<Integer> A){
        int one=0;
        int two=0;
        if (A.size()!=3 || B.size()!=3){
            throw new Exeption();
        }
        for (int i=0 ;i<3;i++){
            if(A.get(i)<B.get(i)){ two++; }
            if(A.get(i)>B.get(i)){ one++; }
        }

String Sentence = "first tripel has ("+ one +")  points, and the second tripel to has ("+two+ ") points.";

return Sentence;
    }

}
