import java.util.ArrayList;

public class MaxHeapArray<T extends Comparable<T>> implements Heap<T> {

    private ArrayList<T> myHeapArray;
    private int myHeapSize;

    public MaxHeapArray() {
        myHeapArray = new ArrayList<>();
        myHeapSize = 0;
    }

    public void heapify() {

    }

    public void replaceRoot(T value) {

    }

    public void push(T value) {

    }

    public T peak() {
        return this.myHeapArray.get(1);
    }

    public T pop() {
        return null;
    }

    public int size() {
        return this.myHeapSize;
    }
}
