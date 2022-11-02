//Look at the program implementation of the selection sort.

public class SelectionSortingArray {
    static void selectionSort(int arr[]) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            count++;
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
        selectionSort(libraryNum);
        System.out.println("Sorted array");
        showArray(libraryNum);
    }
}
//The result:

//Initial array
//124 235 456 123 756 476 285 998 379 108
//The number of permutations is 9
//Sorted array
//108 123 124 235 285 379 456 476 756 998