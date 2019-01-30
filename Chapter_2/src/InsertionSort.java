import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {69,5,4,3,6,2,6,2,7,8,8,3,12,10,21};
        int[] array1 = {69,5,4,3,6,2,6,2,7,8,8,3,12,10,21};

        insertSort(array);
        System.out.println(Arrays.toString(array));

        insertSortEasierToReadButSlower(array1);
        System.out.println(Arrays.toString(array1));

    }

    /**
     * classical version of insertion sort per the CLRS intro to Algorithms book
     * @param array array to be sorted
     */
    private static void insertSort(int[] array) {
        if (array.length < 2) return;
        for (int i = 1; i < array.length; i++) {
            int toSort = array[i], scanner = i - 1;
            while (scanner > -1 && array[scanner] > toSort) {
                array[scanner + 1] = array[scanner];
                scanner--;
            }
            array[scanner + 1] = toSort;
        }
    }

    /**
     * this adds some constant work, but i think is more easier to read
     * because it models what happens in real life with a hand of cards and insertion sort
     * @param array array to be sorted
     */
    private static void insertSortEasierToReadButSlower(int[] array) {
        if (array.length < 2) return;
        for (int i = 1; i < array.length; i++) {
            int toSort = array[i], scanner = i - 1;
            while (scanner > -1 && array[scanner] > toSort) {
                swap(scanner + 1, scanner, array);
                scanner--;
            }

        }
    }

    /**
     *
     * @param first position of first item to be swapped with second item
     * @param second position of second item to be swapped with first item
     * @param array the array the swapping is intended to happen in
     */
    private static void swap(int first, int second, int[] array) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }
}
