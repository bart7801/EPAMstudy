//To reverse a word, push the given word to stack (letter by letter) and then, pop letters from the stack.
//Code Example in Java Using a Recursion Function

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Please enter the word or string: \n");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        System.out.print("Reversed string is: \n");
        if (word.length() > 0) {
            reverseString(word, word.length() - 1);
        }
    }

    public static void reverseString(String s, int index) {
        if (index == 0) {
            System.out.println(s.charAt(index));
            return;
        }

        System.out.print(s.charAt(index));
        reverseString(s, index - 1);
    }
}
//Please enter the word or string:
//basic of programming
//Reversed:
//gnimmargorp fo cisab