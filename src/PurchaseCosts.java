//Calculate the total amount you will pay if the purchase costs $N and the following discounts
//are provided: if the purchase costs less than $100 – a 5% discount, if the purchase costs from
//$100 to $200 – a 10% discount, and, finally, if the purchase costs $200 and more – a 15% discount.

import java.util.Scanner;

public class PurchaseCosts {
    public static void main(String[] args) {
        double purchasePrice, result = 0;

        System.out.print("Enter the cost of the purchase \n");
        Scanner sc = new Scanner(System.in);
        purchasePrice = sc.nextDouble();
        if (purchasePrice > 0 && purchasePrice < 100) {
            result = purchasePrice - 0.05 * purchasePrice;
            System.out.printf("Your discount is 5 percent, the amount to be paid is $%.2f.\n", result);
        } else if (purchasePrice >= 100 && purchasePrice < 200) {
            result = purchasePrice - 0.1 * purchasePrice;
            System.out.printf("Your discount is 10 percent, the amount to be paid is $%.2f.\n", result);
        } else if (purchasePrice >= 200) {
            result = purchasePrice - 0.15 * purchasePrice;
            System.out.printf("Your discount is 15 percent, the amount to be paid is $%.2f.\n", result);
        } else System.out.println("The cost of the purchase should be a positive number.\n");
    }
}