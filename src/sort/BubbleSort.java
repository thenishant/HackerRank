package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {12, 6, 3, 89, 56, -23, -67, 54, 7, 7};
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
        }
        printArray(array);
    }

    private static void swap(int array[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int array[]) {
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }
}
