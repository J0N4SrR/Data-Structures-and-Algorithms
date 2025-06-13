public class Array<T>{
    private int capacity;
    private int currentSize;
    private T[] vector;




    public Array(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        this.vector = (T[]) new Object[capacity];
        this.currentSize = 0;
    }

    public void add(T element) throws Exception {
        if(currentSize < capacity){
        vector[currentSize] = element;
        currentSize++;
        } else {
            throw new Exception("The array is full");
        }

    }

    public void addAtPosition(int index, T element) throws Exception {
        if(currentSize == capacity) throw new Exception("The array is full");
        if(index >= 0 && index <= vector.length-1){
            for(int i = currentSize; i > index; i-- ){
                vector[i] = vector[i-1];
                }
            vector[index] = element;
            currentSize++;
        } else throw new IllegalArgumentException();
    }


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

    public void removeByElementAll(T element){
        for(int i = 0; i < vector.length; i++){
            if(findIndexByValue(element) != -1){
                removeByIndex(findIndexByValue(element));}
            }
    }

    public void removeByElementAllOptmize(T element) throws Exception {
        if(element == null) throw new NullPointerException();
        T[] vectorTemp = (T[]) new Object[capacity];
        int indexTemp = 0;
        for(int i = 0; i < capacity; i++){
            if(vector[i] != null && !vector[i].equals(element)){
                vectorTemp[indexTemp] = vector[i];
                indexTemp++;
            }
        }
        if(indexTemp > 0){
            vector = vectorTemp;
        }else{
            throw new Exception("Element not found!");
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
