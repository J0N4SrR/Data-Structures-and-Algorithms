package rosa.ribeiro.jonas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class WordReverser {
    public static void main(String[] args) {
        ArrayDeque<Character> stack =  new ArrayDeque<>();
        System.out.println("Type a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());

    }

}