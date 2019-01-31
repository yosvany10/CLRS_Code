import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxHeapArray<T extends Comparable<T>> implements Heap<T> {

    private ArrayList<T> myHeapArray;
    private int myHeapSize;

    public MaxHeapArray() {
        myHeapArray = new ArrayList<>();
        myHeapArray.add(null);
        myHeapSize = 0;
    }

    public MaxHeapArray(ArrayList<T> input) {
        myHeapArray = new ArrayList<>();
        myHeapArray.add(null);
        myHeapArray.addAll(input);
        myHeapSize = input.size();
    }

    public MaxHeapArray(T[] input) {
        myHeapArray = new ArrayList<>();
        myHeapArray.add(null);
        myHeapArray.addAll(Arrays.asList(input));
        myHeapSize = input.length;
    }

    public void heapify() {
        for (int i = myHeapSize / 2; i >= 1; i--) {
            heapifyHelp(i);
        }
    }

    public void heapSort() {
        int rememberHeapSize = myHeapSize;
        for (int i = myHeapSize; i > 0; i--) {
            heapify();
            Collections.swap(myHeapArray, 1, myHeapSize);
            myHeapSize--;
        }
    }

    public static void main(String[] args) {
        Integer[] tempArray = new Integer[]{4,7,5,2,7,3};
        MaxHeapArray<Integer> maxHeapArray = new MaxHeapArray<>(tempArray);
        System.out.println(maxHeapArray);
        maxHeapArray.heapify();
        System.out.println(maxHeapArray);
        maxHeapArray.heapSort();
        System.out.println(maxHeapArray);
    }

    private void heapifyHelp(int i) throws IllegalArgumentException {
        if (checkIfNegativeOrZero(i)) {
            throw new IllegalArgumentException("Only Positive integers are allowed.");
        }
        int left = i << 1;
        int right = (i << 1) + 1;
        int largest = i;
        if (left <= myHeapSize && myHeapArray.get(left).compareTo(myHeapArray.get(largest)) > 0) {
            largest = left;
        }
        if (right <= myHeapSize && myHeapArray.get(right).compareTo(myHeapArray.get(largest)) > 0) {
            largest = right;
        }
        if (largest != i) {
            Collections.swap(myHeapArray, largest, i);
            heapifyHelp(largest);
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T item: myHeapArray) {
            output.append(item).append(" ");
        }
        return output.toString();
    }

    public void replaceRoot(T value) {

    }

    public void push(T value) {

    }

    public T peak() {
        return myHeapArray.get(1);
    }

    public T pop() {
        return null;
    }

    public int size() {
        return myHeapSize;
    }

    private boolean checkIfNegativeOrZero(int toCheck) {
        return toCheck < 1;
    }
}
