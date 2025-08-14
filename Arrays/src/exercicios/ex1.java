/* Implemente um programa em Java que leia 10 números inteiros fornecidos pelo usuário e processe-os utilizando uma estrutura de pilha (java.util.Stack).

O programa deve seguir as regras:
Número par → empilhar na pilha.
Número ímpar → desempilhar um elemento da pilha e exibir o valor removido.
Caso a pilha esteja vazia, exibir a mensagem: "Pilha vazia! Nenhum elemento para remover."
Após a leitura de todos os números, se a pilha não estiver vazia, desempilhar todos os elementos restantes, imprimindo-os na ordem em que forem removidos. */

package exercicios;
import java.util.Scanner;
import java.util.Stack;

public class ex1 {
    private static final int TOTAL = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int teste;
        System.out.println("A seguir será necessário digitar" + TOTAL + " números inteiros");
        for(int i = 0; i < TOTAL; i++){
            System.out.printf("Digite o %dº numero:", i+1);
            try{
            teste = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite apenas um número inteiro.");
                i--;
                continue;
            }
            if(teste%2 == 0){
                stack.push(teste);
            } else {
                if(stack.isEmpty()){
                    System.out.println("Pilha vazia! Nenhum elemento para remover.");
                } else {
                    System.out.printf("Valor Removido: %d \n", stack.pop());
                }
            }
        }
        System.out.println("\n ================================================== \n");
        if(stack.isEmpty()){
            System.out.println("Pilha vazia! Nenhum elemento para remover.");
        } else{
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
        scanner.close();
    }
}
