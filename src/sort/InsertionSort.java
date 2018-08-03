package sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{12, 6, 3, 89, 56, -23, -67, 54, 7, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
        insertionSort.printArray(array);
    }

    private void insertionSort(int array[]) {
        for (int unSortedIndex = 1; unSortedIndex < array.length; unSortedIndex++) {
            int newElement = array[unSortedIndex];
            int i;
            for (i = unSortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

    }

    private void printArray(int array[]) {
        for (int anArray : array) {
            System.out.println(anArray);

        }
    }
}
