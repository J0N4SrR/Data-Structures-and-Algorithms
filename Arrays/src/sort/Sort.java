package sort;

public class Sort<T extends Comparable<T>>  {
    private T[] vector;
    private int currentSize;

    public Sort(T[] vector) {
        this.vector = vector;
        this.currentSize = vector.length;
    }

    public boolean isEmpty() {
        return this.currentSize == 0;
    }


    /* Bubble Sort, Selection Sort, and Insertion Sort
    All three are comparison-based sorting algorithms, simple to understand and implement,
    but considered inefficient for large data volumes due to their worst-case time complexity of O(N^2).
    However, the way they reach this complexity and the operations they prioritize vary significantly. */


    //Bubble Sort
    public void bubbleSort() {
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
    public void selectionSort()  {
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

    //Insertion Sort
    public void insertionSort(){
        if(isEmpty() || currentSize < 2) return;
        T valueTemp;
        for(int i = 1; i < currentSize; i++){
            valueTemp = vector[i];
            int j = i - 1;
            while (j >= 0 && vector[j].compareTo(valueTemp) > 0){
                vector[j+1] = vector[j];
                j--;
            }
            vector[j+1] = valueTemp;
        }
    }

    //Quicksort
    public void quickSort(){
        if(isEmpty() || currentSize < 2) return;

    }


}

