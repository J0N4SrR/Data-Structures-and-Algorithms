//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Array<Integer> teste = new Array<>(10);
        teste.add(2);
        teste.add(1);
        teste.add(1);
        teste.add(5);
        teste.add(7);
        teste.add(1);
        teste.add(3);
        System.out.println(teste);
        teste.addAtPosition(7,9);
        System.out.println(teste);
        teste.removeByElementAll(1);
        System.out.println(teste);



    }
}