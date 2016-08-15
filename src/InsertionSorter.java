/**
 * Created by kevin on 8/14/16.
 */

public abstract class InsertionSorter extends BaseSorter {
    public InsertionSorter() {
    }

    @Override
    public void sort(int[] array) {
        insertionSort(array);
    }
}
