/*
ou are given N pairs of numbers.
In every pair, the first number is always smaller than the second number.
A pair (c, d) can follow another pair (a, b) if b < c. 
Chain of pairs can be formed in this fashion. You have to find the longest chain
which can be formed from the given set of pairs. 
 */
import java.util.*;
public class Maxlengthchain {
    public static void main(String[] args) {
        int Pair[][] = {{5,24,},{39,60},{15,28},{27,40},{50,90}};

        Arrays.sort(Pair,Comparator.comparingDouble(o -> o[1]));

        int chainlen =1;
        int lastend = Pair[0][1];

        for(int i=0;i<Pair.length;i++){
            if(Pair[i][0] > lastend){   //b<c   or c >b
                chainlen++;
                lastend = Pair[0][1];
            }
        }
        System.out.println("Maxlength of chain"+" "+ chainlen);
    }
}
