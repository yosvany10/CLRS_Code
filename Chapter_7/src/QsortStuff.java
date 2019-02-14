import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QsortStuff {
    public static void main(String[] args) {
        Integer[] myInts = {5,2,6,21,69,28,44,3,5,1,44,3,2,6,7,8565,45,3,3,43543, 10, -1};
        List<Integer> myList = Arrays.asList(myInts);
        System.out.println(myList);
        Sorter.basicQuickSort(myList);
        Arrays.sort(myInts);
        System.out.println(myList);
        System.out.println(Arrays.toString(myInts));
    }
}
