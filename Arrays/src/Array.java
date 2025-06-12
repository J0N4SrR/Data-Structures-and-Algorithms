public class Array<T>{
    private int size;
    private T[] vector;


    public Array(int size) {
        this.vector = (T[]) new Object[size];
    }
    public boolean add(T element){
        for(T e : vector){
            if(e == null){
                e = element;
                return true;
            }
        }
        return false;       
    }
}
