public interface Heap<T extends Comparable<T>> {
    void heapify();
    void replaceRoot(T value);
    void push(T value);
    T peak();
    T pop();
    int size();
}
