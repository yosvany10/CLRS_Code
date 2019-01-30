public abstract class Heap<T extends Comparable<T>> {
    abstract public void heapify();
    abstract public void replaceRoot(T value);
    abstract public void push(T value);
    abstract public T peak();
    abstract public T pop();


    public int left(int i) throws IllegalArgumentException{
        if (i < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        return i << 1;
    }

    public int right(int i) throws IllegalArgumentException{
        if (i < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        return (i >> 1) + 1;
    }

}
