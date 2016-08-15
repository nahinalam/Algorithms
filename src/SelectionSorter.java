/**
 * Created by kevin on 8/14/16.
 */
public abstract class SelectionSorter extends BaseSorter {
    public SelectionSorter() {
    }

    @Override
    public void sort(int[] array) {
        selectionSort(array);
    }
}
