import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial;

        System.out.print("Enter the number:");
        factorial = Integer.parseInt(scanner.nextLine());
        System.out.println(Factorial.FactorialList(factorial));


    }
}