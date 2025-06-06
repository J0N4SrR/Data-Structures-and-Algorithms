package fibonacciNumberAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Fibonnaci {
    //Implementation Using a For Loop
   public List<Integer> LoopFibonnaci(int num){
        List<Integer> fibonnaci = new ArrayList<>();
        int a = 0;
        int b = 1;
        int d;
        fibonnaci.add(a);
        fibonnaci.add(b);

        for (int i = 2; i < num; i++) {
            d = (fibonnaci.get((i - 2)) + fibonnaci.get((i - 1)));
            fibonnaci.add(d);
        }
    return fibonnaci;
   }

    //Implementation Using Recursion
    public static int getFibonacciNumber(int f){
        if(f <= 1){
            return f;
        } else {
            return getFibonacciNumber(f-2) + getFibonacciNumber(f-1);
        }
    }

    public static List<Integer> RecursiveFibonnaci(int num){
        List<Integer> fibonnaci = new ArrayList<>();
        for (int i = 0; i < num; i++){
            fibonnaci.add(getFibonacciNumber(i));
        }
        return fibonnaci;
    }

}

