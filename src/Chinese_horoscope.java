//Based on the year of birth that you have entered, display the name of the corresponding animal according
//to the Chinese horoscope. The name of the animal is chosen depending on the remainder of dividing the year
//by 12 according to the following scheme:
//0 - Monkey
//1 - Rooster
//2 - Dog
//3 - Pig
//4 - Rat
//5 - Ox
//6 - Tiger
//7 - Rabbit
//8 - Dragon
//9 - Snake
//11 - Horse
//12 - Goat
import java.util.Scanner;

public class Chinese_horoscope {

    public static void main(String[] args) {
        int year, k, n = 1;

        System.out.print("Enter the year (positive value and less than 10000)\n");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        while (n == 1) {
            if (year <= 0 || year > 10000) {
                System.out.println("Enter the correct value\n");
                System.out.print("Enter the year (positive value and less than 10000)\n");
                year = sc.nextInt();
            } else n = 0;
        }

        k = year % 12;
        switch (k) {
            case 11:
                System.out.println(year + " - The year of the Goat\n");
                break;
            case 10:
                System.out.println(year + " - The year of the Horse\n");
                break;
            case 9:
                System.out.println(year + " - The year of the Snake\n");
                break;
            case 8:
                System.out.println(year + " - The year of the Dragon\n");
                break;
            case 7:
                System.out.println(year + " - The year of the Rabbit\n");
                break;
            case 6:
                System.out.println(year + " - The year of the Tiger\n");
                break;
            case 5:
                System.out.println(year + " - The year of the Ox\n");
                break;
            case 4:
                System.out.println(year + " - The year of the Rat\n");
                break;
            case 3:
                System.out.println(year + " - The year of the Pig\n");
                break;
            case 2:
                System.out.println(year + " - The year of the Dog\n");
                break;
            case 1:
                System.out.println(year + " - The year of the Rooster\n");
                break;
            case 0:
                System.out.println(year + " - The year of the Monkey\n");
                break;
        }
    }
}