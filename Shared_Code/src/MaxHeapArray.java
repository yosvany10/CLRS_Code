import java.util.ArrayList;

public class MaxHeapArray<T extends Comparable<T>> extends Heap<T> {

    private ArrayList<T> myHeapArray;
    private int myHeapSize;

    public MaxHeapArray() {
        myHeapArray = new ArrayList<>();
        myHeapSize = 0;
    }

    @Override
    public void heapify() {

    }

    @Override
    public void replaceRoot(T value) {

    }

    @Override
    public void push(T value) {

    }

    @Override
    public T peak() {
        return this.myHeapArray.get(1);
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
