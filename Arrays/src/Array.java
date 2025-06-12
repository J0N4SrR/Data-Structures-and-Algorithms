public class Array<T>{
    private int size;
    private T[] vector;


    public Array(int size) {
        if(size < 0) throw new IllegalArgumentException();
        this.vector = (T[]) new Object[size];
    }
    public boolean add(T element){
        for(int i = 0; i < vector.length; i++ ){
            if(vector[i] == null){
                vector[i] = element;
                return true;
            }
        }
        return false;
    }
    public boolean addAtPosition(int index, T element){

        if(index <= vector.length-1){
            for(int i = 0; i < vector.length; i++ ){
                if(index == i){
                    vector[i] = element;
                    return true;
                }
            }
        }
        return false;
    }

    public int findIndexByValue(T element){
        for(int i = 0; i < vector.length; i++ ){
            if(vector[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

}
