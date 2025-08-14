/*Escreva um programa, usando pilha, que testa se uma sequência de caracteres fornecida pelo usuário é um palíndromo,
ou seja, é uma palavra cuja primeira metade é simétrica à segunda metade. */

package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean palindromo = true;
        Stack<Character> stack = new Stack<>();
        System.out.println("===== Verificador de Palindromo =====");
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
        for(int i = 0; i < palavra.length(); i++){
            stack.push(palavra.charAt(i));
        }
        for(int i = 0; i < palavra.length(); i++){
            if(!(palavra.charAt(i) == stack.pop())) palindromo = false;
        }
        if(palindromo){
            System.out.printf("A palavra %s é um palindromo!", palavra);
        }else{
            System.out.printf("A palavra %s NÃO é um palindromo!", palavra);
        }
        System.out.println("\n=====================================");



    }
}
