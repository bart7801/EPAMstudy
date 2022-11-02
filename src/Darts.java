//There are 3 teams that take part in the darts competition. Each team comprises 4 participants.
//Each participant has 3 attempts. The number of points that each participant gets for one throw is entered
//from a keyboard. The maximum number of points for 1 attempt is 60. Display the winner
//(i.e. the number of the participant with the biggest number of points and his/her result) from each team.
//The participant of which team showed the best result?

//W rywalizacji w rzutki biorą udział 3 drużyny. Każdy zespół składa się z 4 uczestników. Każdy uczestnik ma 3 próby.
//Ilość punktów, które każdy uczestnik otrzymuje za jeden rzut, wpisuje się z klawiatury. Maksymalna liczba punktów
//za 1 próbę to 60. Wyświetl zwycięzcę (tj. numer uczestnika z największą liczbą punktów i jego wynik) z każdej drużyny.
//Uczestnik której drużyny pokazał najlepszy wynik?

import java.util.Random;

public class Darts {
    static void input(int[][] x, int n1, int m1)   // array input function
    {
        int i, j;
        Random rand = new Random();
        for (i = 0; i < n1; i++)
            for (j = 0; j < m1; j++)
                x[i][j] = rand.nextInt(59);         // Entering random numbers in the range from 0 to 60
    }

    static void output(int[][] x, int n1, int m1) //array output function
    {
        int i, j;
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m1; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }

    static int win(int[][] x, int n1, int m1)    //winner determination function
    {
        int i, j;
        int sum;
        int[] a = new int[4];
        for (i = 0; i < n1; i++) {
            sum = 0;
            for (j = 0; j < m1; j++) {
                sum += x[i][j];
                a[i] = sum;
            }
            System.out.printf("Total score of %d player = %d\n", i + 1, sum);
        }

        int imax_a = 0;
        int max_a = a[0];
        for (i = 0; i < n1; i++) {
            if (a[i] > max_a) {
                max_a = a[i];
                imax_a = i;
            }
        }
        System.out.printf("The winner is player %d with the score of ", imax_a + 1);
        return max_a;
    }

    public static void main(String[] args) {

        int[][] x = new int[4][3];
        int[][] y = new int[4][3];
        int[][] z = new int[4][3];
        int n = 4;
        int m = 3;

        System.out.println("First team results\n");
        input(x, n, m);
        output(x, n, m);
        int first_win = win(x, n, m);
        System.out.printf("%d.\n", first_win);

        System.out.println("\nSecond team results\n");
        input(y, n, m);
        output(y, n, m);
        int second_win = win(y, n, m);
        System.out.printf("%d.\n", second_win);

        System.out.println("\nThird team results\n");
        input(z, n, m);
        output(z, n, m);
        int third_win = win(z, n, m);
        System.out.printf("%d.\n", third_win);

        int max, num;

        if (first_win > second_win && first_win > third_win)
            max = first_win;
        else if (second_win > third_win)
            max = second_win;
        else max = third_win;

        if (max == first_win)
            num = 1;
        else if (max == second_win)
            num = 2;
        else num = 3;
        System.out.printf("\nThe best result was shown by player of the team %d with a score of %d.\n", num, max);
    }
}