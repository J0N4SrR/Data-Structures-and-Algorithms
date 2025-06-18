
public class Main {

    public static void main(String[] args) throws Exception {
        Arrays<Integer> teste = new Arrays<>(Integer.class,15);
        teste.add(1);
        teste.add(2);
        teste.add(1);
        teste.add(1);
        teste.add(5);
        teste.add(7);
        teste.add(1);
        teste.add(1);
        teste.add(3);
        teste.add(1);
        teste.add(1);
        System.out.println(teste);
        teste.bubleSort();
        System.out.println(teste);
        teste.addAtPosition(7,9);
        System.out.println(teste);
        teste.bubleSort();
        System.out.println(teste);
        teste.removeByElementAllOptmize(1);
        System.out.println(teste);




    }
}