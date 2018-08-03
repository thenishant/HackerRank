package sort;

public class SelectionSort {
    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int array[]) {
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    public static void main(String[] args) {
        int array[] = {12, 6, 3, 89, 56, -23, -67, 54, 7, 7};
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastSortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
            }
            swap(array, largest, lastSortedIndex);
        }
        printArray(array);
    }
}
