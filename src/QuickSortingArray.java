//Look at the program implementation of the quicksort.

public class QuickSortingArray {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int keyIndex = partition(arr, left, right);
            quickSort(arr, left, keyIndex - 1);// Sort the elements on the left of a key element
            quickSort(arr, keyIndex + 1, right);// Sort the elements on the right of a key element
        }
    }

    private static int partition(int[] items, int left, int right) {
        int key = items[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (items[j] <= key) {
                i++;
                int temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
        }
        int temp = items[i + 1];
        items[i + 1] = items[right];
        items[right] = temp;
        return (i + 1);
    }

    static void showArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] libraryNum = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println("Initial array");
        showArray(libraryNum);
        quickSort(libraryNum, 0, libraryNum.length - 1);
        System.out.println("Sorted array");
        showArray(libraryNum);
    }
}
//The result:

//Initial array:
//124 235 456 123 756 476 285 998 379 108
//Sorted array:
//108 123 124 235 285 379 456 476 756 998