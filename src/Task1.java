//N people are taking part in the donut eating competition. To win, you need to eat as many donuts
//as possible in 10 minutes. Display on the screen the result of 3 winners and the worst result.
//(Hint: The program allocates dynamic memory for an array of n elements and requests the array from a keyboard.
//Try sorting the data using different methods. The case when several participants ate the same number
//of donuts should not be considered).

//N osób bierze udział w konkursie jedzenia pączków. Aby wygrać, musisz zjeść jak najwięcej pączków w ciągu 10 minut.
//Wyświetl na ekranie wynik 3 zwycięzców i wynik najgorszy. (Wskazówka: program alokuje pamięć dynamiczną dla tablicy
//składającej się z n elementów i żąda tablicy z klawiatury. Spróbuj posortować dane różnymi metodami.
//Nie należy brać pod uwagę przypadku, gdy kilku uczestników zjadło tę samą liczbę pączków).

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of bidders:(more than 3): ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] dounts = new int[size];
        while (size < 3) {
            System.out.println("The number of participants must be more than 3!\n");
            System.out.println("Enter again.\n");
            size = in.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number of donuts eaten by " + (i + 1) + " participant: ");
            dounts[i] = in.nextInt();
        }

        switch (Menu()) {
            case 1:
                bubbleSort(dounts);
                break;
            case 2:
                insertionSort(dounts);
                break;
            case 3:
                selectionSort(dounts);
                break;
            default:
                System.out.println("Incorrect choice.\n");
        }

        printArray(dounts);
    }

    static void bubbleSort(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            int n = array.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        needIteration = true;
                    }
        }
    }

    static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int keyItem = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < keyItem) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyItem;
        }
    }

    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] > array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    static void printArray(int[] array) {
        int flag = 0;
        int temp, i, j, tmpj = 0;
        int size = array.length;
        for (i = 0; i < size && flag < 3; i++) {
            int how = 1;
            for (j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    how++;
                    tmpj = j;
                }
            }

            if (how > 1) {
                System.out.printf("%d participants took place %d with result - %d donuts.\n", how, (++flag), array[i]);
                i = tmpj;
            } else {
                System.out.printf("The result of the participant who took place %d - %d donuts.\n", (++flag), array[i]);
            }
        }
        if ((i != size) && (size > 3)) {
            System.out.println("The worst result corresponds to " + (array[size - 1]) + " donuts.\n");
        }
    }

    static int Menu() {
        System.out.println("\t1 - Outputting the result using Bubble sort.");
        System.out.println("\t2 - Outputting the result using Insert sort.");
        System.out.println("\t3 - Outputting the result using Selection sort.");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.print("Incorrect choice. Enter again:");
            choice = in.nextInt();
        }
        return choice;
    }

    static void showArray(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}
//Enter the number of bidders: (more than 3): 6
//
//Enter the number of donuts eaten by 1 participant: 14
//Enter the number of donuts eaten by 2 participant: 12
//Enter the number of donuts eaten by 3 participant: 16
//Enter the number of donuts eaten by 4 participant: 10
//Enter the number of donuts eaten by 5 participant: 12
//Enter the number of donuts eaten by 6 participant: 14
//        1 - Outputting the result using Bubble sort.
//        2 - Outputting the result using Insert sort.
//        3 - Outputting the result using Selection sort.
//2
//The result of the participant who took 1 place - 16 donuts.
//2 participants took 2 place with result - 14 donuts.
//2 participants took 3 place with result - 12 donuts.
//The worst result corresponds to 10 donuts.