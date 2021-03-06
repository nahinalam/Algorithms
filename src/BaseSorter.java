/**
 * Base Sorter class.
 * In the interest of programming the algorithms, these classes will only be sorting ints.
 */

public abstract class BaseSorter {

    protected BaseSorter() {
    }

    protected static void swap(int i, int j) {
        final int temp = i;
        i = j;
        j = temp;
    }

    /*
    protected abstract int compare(int a, int b);
    protected abstract int swap(int a, int b);
    */
    public abstract void sort(int[] array);


    protected void insertionSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int x = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > x)) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = x;

        }
    }

    protected void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int j_min = i;
            for (int j = 0; j < array.length; ++j) {
                if (array[j] < array[j_min]) {
                    j_min = j;
                }
            }
            if (j_min != i) {
                swap(array[i], array[j_min]);
            }
        }
    }


}
