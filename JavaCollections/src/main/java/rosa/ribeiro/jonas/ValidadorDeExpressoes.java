package rosa.ribeiro.jonas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ValidadorDeExpressoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Avaliador de expressões.");
        System.out.println("Iremos avaliar se a expressão está bem formatada.");
        System.out.println("Digite uma classe contendo parênteses (), chaves {} e/ ou colchetes []:");
        String exp =  scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        boolean result = true;

        for(int i = 0; i < exp.length()/2 ; i++){
//            System.out.println(exp.charAt(i));
//            System.out.println(exp.charAt((exp.length()-1)-i));
            if(!(exp.charAt(i) == exp.charAt((exp.length()-1)-i))){
                result = false;
            }
        }


    }
}
