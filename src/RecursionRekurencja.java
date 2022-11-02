//Consider recursion on a more efficient example of finding the greatest common divisor (DCD).
//The program takes two positive integers as input from a user and calculates GCD using recursion.
//Rozważ rekurencję na bardziej efektywnym przykładzie znajdowania największego wspólnego dzielnika (DCD).
//Program pobiera dwie dodatnie liczby całkowite jako dane wejściowe od użytkownika i oblicza GCD za pomocą rekurencji.

import java.util.Scanner;

public class RecursionRekurencja {
    static int calculateGCD(int num1, int num2) {
        if (num2 != 0)
            return calculateGCD(num2, num1 % num2);
        else
            return num1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the first positive integer value: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter the second positive integer value: ");
        int num2 = sc.nextInt();
        System.out.print("The greatest common divisor of " + num1 + " and " + num2 + " is " + calculateGCD(num1, num2));

        sc.close();
    }
}
//The result:
//Enter the first positive integer value:121
//Enter the second positive integer value:561
//The greatest common divisor of 121and 561is 11