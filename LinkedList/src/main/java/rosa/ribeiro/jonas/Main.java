package rosa.ribeiro.jonas;

import rosa.ribeiro.jonas.structure.Node;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Node<String> no1 = new Node<>("Conteudo 1");
        Node<String> no2 = new Node<>("Conteudo 2");
        Node<String> no3 = new Node<>("Conteudo 3");
        Node<String> no4 = new Node<>("Conteudo 4");
        no1.setNext(no2);
        no2.setNext(no3);
        no3.setNext(no4);

        System.out.println(no1.getNext());
    }
}