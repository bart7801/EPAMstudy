//A new film was released at the cinema. There is 1 hall in the cinema and it can fit 200 spectators.
//Every day, a different number of tickets were sold for a new film in the first and second weeks of its running.
//When did the cinema sell more tickets – during the first or the second week? What was the revenue of the cinema
//in the first two weeks of the movie's distribution, if the price of one ticket is $M?

//W kinie pojawił się nowy film. W kinie znajduje się 1 sala i może pomieścić 200 widzów.
//Każdego dnia sprzedawano inną liczbę biletów na nowy film w pierwszym i drugim tygodniu jego emisji.
//Kiedy kino sprzedało więcej biletów – w pierwszym czy drugim tygodniu?
//Jaki był przychód kina w pierwszych dwóch tygodniach dystrybucji filmu, jeśli cena jednego biletu wynosi miliony dolarów?

import java.util.Scanner;

public class CinemaTickets {
    static void input(int[] array)   //array input function
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number of tickets sold in day " + (i + 1) + " - ");
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();

            if (array[i] > 200) {
                while (array[i] > 200) {
                    System.out.println("The hall is full. Enter again.");
                    System.out.print("Enter the number of tickets sold in day " + (i + 1) + " - ");
                    array[i] = in.nextInt();
                }
            }
        }
    }

    static void output(int[] array)  //array output function
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    static int sum(int[] array)     //cinema revenue calculation function
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    public static void main(String[] args) {

        int[] a = new int[7];
        int[] b = new int[7];
        int sum_first = 0;
        int sum_second = 0;

        System.out.println("Enter the number of tickets sold during the first week");
        input(a);
        output(a);
        System.out.println("\nEnter the number of tickets sold during the second week");
        input(b);
        output(b);
        System.out.println("");
        sum_first = sum(a);
        System.out.println(sum_first + " tickets were sold during the first week.");
        sum_second = sum(b);
        System.out.println(sum_second + " tickets were sold during the second week.");

        if (sum_first > sum_second)
            System.out.printf("In the first week, the cinema sold %d more tickets than in the second one.\n", sum_first - sum_second);
        else if (sum_first < sum_second)
            System.out.printf("In the second week,  the cinema sold %d more tickets than in the first one.\n", sum_second - sum_first);
        else System.out.println("The cinema sold the same number of tickets in the first week as in the second week.");

        System.out.print("Enter ticket price: ");
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int total = price * (sum_first + sum_second);

        System.out.println("The total cinema's revenue for two weeks was $" + total + ".");
    }
}
//Enter the number of tickets sold during the first week
//Enter the number of tickets sold in day 1 - 48
//Enter the number of tickets sold in day 2 - 34
//Enter the number of tickets sold in day 3 - 67
//Enter the number of tickets sold in day 4 - 34
//Enter the number of tickets sold in day 5 - 56
//Enter the number of tickets sold in day 6 - 78
//Enter the number of tickets sold in day 7 - 49
//48 34 67 34 56 78 49
//Enter the number of tickets sold during the second week
//Enter the number of tickets sold in day 1 - 67
//Enter the number of tickets sold in day 2 - 45
//Enter the number of tickets sold in day 3 - 87
//Enter the number of tickets sold in day 4 - 65
//Enter the number of tickets sold in day 5 - 43
//Enter the number of tickets sold in day 6 - 78
//Enter the number of tickets sold in day 7 - 42
//67 45 87 65 43 78 42
//366 tickets were sold during the first week
//427 tickets were sold during the second week
//In the second week, the cinema sold 61 more tickets than in the first one.
//Enter ticket price
//5
//The total cinema's revenue for two weeks was $3965.