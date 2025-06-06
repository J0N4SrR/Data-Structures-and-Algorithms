package fibonacciNumberAlgorithm;

import java.util.Scanner;

public class FibonnaciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index, term;

        System.out.print("Enter the number of terms:");
        term = Integer.parseInt(scanner.nextLine());
        System.out.println("The first " + term + " values: " + Fibonnaci.RecursiveFibonnaci(term) );
        System.out.print("Enter the position/index:");
        index = Integer.parseInt(scanner.nextLine());
        System.out.println("Index position "+ index + " has value: " + Fibonnaci.getFibonacciNumber(index));

    }
}
