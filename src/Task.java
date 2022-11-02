//class Pizza.Item.Main {
//    public static void main(String args[]) {
//        int a=0;
//        System.out.println("to jest wynik " + a);
//    }
//}

import java.util.Scanner;

public class Task {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Your name is %s. You are %d years old.\n", name, age);
    }
}