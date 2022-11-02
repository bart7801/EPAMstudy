//Look at the program implementation of the insertion sort.

public class InsertionSortingArray {
    static void insertionSort(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int keyItem = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > keyItem) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = keyItem;
        }
        System.out.println("The number of permutations is " + count);
    }

    static void showArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] libraryNum = {124, 235, 456, 123, 756, 476, 285, 998, 379, 108};
        System.out.println("Initial array");
        showArray(libraryNum);
        insertionSort(libraryNum);
        System.out.println("Sorted array");
        showArray(libraryNum);
    }
}
//The result:

//Initial array
//124 235 456 123 756 476 285 998 379 108
//The number of permutations is 20
//Sorted array
//108 123 124 235 285 379 456 476 756 998
