import java.lang.reflect.Array;

public class Arrays<T extends Comparable<T>>  {
    private Class<T> type;
    private int capacity;
    private int currentSize;
    private T[] vector;

    public Arrays(Class<T> type, int capacity) {
        if(capacity < 0) throw new IllegalArgumentException();
        this.type = type;
        this.capacity = capacity;
        this.vector = (T[]) Array.newInstance(type, capacity);
        this.currentSize = 0;
    }

    private boolean isEmpty(){
        int counter = 0;
        for(int i =0; i < capacity; i++){
            if(vector[i] == null) counter++;
        }

        return currentSize == 0 && capacity == counter;
    }

    private boolean isFull(){
        return currentSize == capacity;
    }


    public void add(T element) {
        if(!isFull()){
        vector[currentSize] = element;
        currentSize++;
        } else {
            throw new IllegalStateException("The array is full");
        }
    }

    public void addAtPosition(int index, T element) throws Exception {
        if(isFull()) throw new IndexOutOfBoundsException("The array is full");
        if(index >= 0 && index < currentSize){
            for(int i = currentSize; i > index; i-- ){
                vector[i] = vector[i-1];
            }
            vector[index] = element;
            currentSize++;
        }
    }

    public T getElement(int index){
        if(index >= 0 && index < currentSize) return vector[index];
        else throw new  IndexOutOfBoundsException("Index " + index + " is out of bounds for current size: " + currentSize);
    }

    public T setElement(int index, T element){

        if(index < 0 || index >= currentSize) {
           throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for current size: " + currentSize);

       }
        T oldElement = vector[index];
        vector[index] = element;
        return oldElement;
    }

    public void removeByIndex(int index){
        if(!(index < 0 || index >= currentSize)){
            for(int i = index; i < currentSize; i++ ){
                if(i+1 < currentSize){
                    vector[i] = vector[i + 1];
                } else vector[i] = null;
            }
            currentSize--;
        }
    }

//    public void removeByElementAll(T element){
//        for(int i = 0; i < vector.length; i++){
//            if(findIndexByValue(element) != -1){
//                removeByIndex(findIndexByValue(element));}
//                currentSize--;
//            }
//    }

    public void removeByElementAllOptmize(T element) throws Exception {
        if(element == null) throw new NullPointerException();
        T[] vectorTemp = (T[]) Array.newInstance(type, capacity);;
        int indexTemp = 0;
        for(int i = 0; i < capacity; i++){
            if(vector[i] != null && !vector[i].equals(element)){
                vectorTemp[indexTemp] = vector[i];
                indexTemp++;
            }
        }
        if(indexTemp > 0){
            vector = vectorTemp;
            currentSize = indexTemp;
        }else{
            throw new Exception("Element isn't found!");
        }
    }

    public boolean clearArray(){
        for(int i =0; i < capacity; i++){
            vector[i] = null;
        }
        currentSize = 0;
        return isEmpty();
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[currentSize];
        for(int i = 0; i < currentSize; i++){
            newArray[i] = vector[i];
        }
        return newArray;
    }

    //Linear Search Algorithm
    public int findIndexByValue(T element){
        for(int i = 0; i < currentSize; i++ ){
            if(vector[i] != null ){
                if(vector[i].equals(element)){
                    return i;
                }
            }
        }
        return -1;
    }

    public T findByValue(T element){
        for(int i = 0; i < currentSize; i++ ){
            if(vector[i].equals(element)){
                return vector[i];
            }
        }
        return null;
    }

    //Bubble Sort
    public void bubbleSort() throws Exception {
        if(isEmpty() || currentSize < 2) return;

        for(int i = 0; i < currentSize - 1; i++){
            for(int j = 0; j < currentSize - 1 - i; j++){
                if(vector[j].compareTo(vector[j+1]) > 0){
                    T temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
    }
    //Selection Sort
    public void selectionSort() throws Exception {
        if(isEmpty() || currentSize < 2) return;
        T valueTemp;
        for(int i = 0; i < currentSize -1 ; i++){
            int indexMin = i;
            for(int j = i + 1; j < currentSize; j++){
                if(vector[j].compareTo(vector[indexMin]) < 0){
                    indexMin = j;
                }
            }
            valueTemp = vector[indexMin];
            vector[indexMin] = vector[i];
            vector[i] = valueTemp;

        }
    }   

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Capacity: ");
        sb.append(capacity);
        sb.append(" | Size: ");
        sb.append(currentSize);
        sb.append(" | Vector= [");

        for(int i = 0; i < currentSize; i++ ){
            sb.append(vector[i]);
            if(i < currentSize -1) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }



}
