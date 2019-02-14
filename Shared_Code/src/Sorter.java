import java.util.Collections;
import java.util.List;

public class Sorter {
    private Sorter(){}

    public static <T extends Comparable<T>> void basicQuickSort(List<T> toBeSorted) {
        qSortDriver(toBeSorted, 0, toBeSorted.size() - 1);
    }

    private static <T extends Comparable<T>> void qSortDriver(List<T> toBeSorted, int start, int end) {

        if (start < end) {
            int q = partition(toBeSorted, start, end);
            qSortDriver(toBeSorted, start, q - 1);
            qSortDriver(toBeSorted, q + 1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(List<T> toBeSorted, int start, int end) {
        T pivot = toBeSorted.get(end); // take the last item and now we try to put it in the correct spot
        int swapSpot = start - 1;
        for (int i = start; i < end; i++) {
            if (toBeSorted.get(i).compareTo(pivot) <= 0) {
                swapSpot++;
                Collections.swap(toBeSorted, swapSpot, i);
            }
        }
        Collections.swap(toBeSorted, swapSpot + 1, end);
        return swapSpot + 1;
    }
}
