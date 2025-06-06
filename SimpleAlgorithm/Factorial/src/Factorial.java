public class Factorial {

    public static String FactorialList(int num){
        StringBuilder str = new StringBuilder();
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        str.append(num);
        str.append("! = ");
        if(num <= 1){
            str.append(FactorialResult(num));
            return str.toString();
        }
        for(int i = num; i > 0; i--){
            str.append(i);
            if(i > 1) str.append("X");
        }
        str.append(" => ");
        str.append(FactorialResult(num));
        return str.toString();

    }

    public static int FactorialResult(int num){
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num <= 1){
            return 1;
        }
        for(int i = num; i > 1; i--){
            num = num * (i-1);
        }
        return num;
    }

    private int FactorialRecursive(int num){
        int fac = 0;
        if(num < 0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num <= 1){
            return 1;
        }

        return num * FactorialRecursive(num-1);
    }

}
