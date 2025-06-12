public class Array<T>{
    private int capacity, currentSize;
    private T[] vector;



    public Array(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException();
        this.vector = (T[]) new Object[capacity];
        this.currentSize = 0;
    }

    public boolean add(T element){
        if(currentSize < capacity){
        vector[currentSize] = element;
        currentSize++;
        return true;
        }
        return false;
    }

    public boolean addAtPosition(int index, T element){

        if(index <= vector.length-1){
            for(int i = currentSize; i > index; i-- ){
                vector[i] = vector[i-1];
                }
            vector[index] = element;
            currentSize++;
            return true;
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

    public boolean removeByIndex(int index){
        if(!(index < 0 || index >= currentSize)){
            for(int i = index; i < currentSize; i++ ){
                vector[i] = vector[i +1];
            }
            currentSize--;
            return true;
        }
        return false;

    }

    public boolean removeByElementAll(T element){

    }

}
