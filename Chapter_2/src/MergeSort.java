import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {69,5,4,3,6,2,6,2,7,8,8,3,12,10,21};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        mergeSortDriver(array, 0, array.length - 1);
    }

    private static void mergeSortDriver(int[] array, int start, int end) {
        if (start < end) {
            int middle = (end + start)  / 2;
            mergeSortDriver(array, start, middle);
            mergeSortDriver(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        int[] left = new int[middle - start + 2]; // 4 item array 3-0 = 3 but we need 4 and also one more for sentinel value
        int[] right = new int[end - (middle + 1) + 2];
        copySliceArr(array, start, middle, left);
        copySliceArr(array, middle + 1, end, right);
        int leftPos = 0, rightPos = 0;
        for (int i = start; i <= end; i++) {
            if (left[leftPos] <= right[rightPos])
                array[i] = left[leftPos++];
            else
                array[i] = right[rightPos++];
        }
    }

    private static void copySliceArr(int[] from, int start, int end, int[] to) {
        int i, j;
        for (i = start, j = 0; i <= end; i++, j++) {
            to[j] = from[i];
        }
        to[j] = Integer.MAX_VALUE;
    }
}
