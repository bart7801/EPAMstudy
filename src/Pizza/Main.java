//The pizza delivery service processes its orders on the first come, first served basis.
//After a client has paid for his/her order, he/she is added to the online waiting list.
//After the pizza is ready, the information is passed to a courier,
//saved to a file, and removed from the waiting list.
//Display the number of customers who are currently waiting for an order.
// An order is written from the waiting list to the file when it is deleted).
//
//Expected functionality:
//
//    Enter the info (customer's name, address, order, total cost).
//    Write to file – delete the order data.
//    Display the number of customers waiting for the order (customer's name, address, total cost).
//
//Dostawa pizzy realizuje zamówienia na zasadzie „kto pierwszy ten lepszy”.
//Po opłaceniu zamówienia przez klienta, zostaje on dodany do internetowej listy oczekujących.
//Po przygotowaniu pizzy informacje przekazywane są kurierowi, zapisywane do pliku i usuwane z listy oczekujących.
//Wyświetl liczbę klientów, którzy aktualnie czekają na zamówienie.
//Zlecenie jest zapisywane z listy oczekujących do pliku po jego usunięciu).
//
//Oczekiwana funkcjonalność:
//
//     Wprowadź informacje (imię i nazwisko klienta, adres, zamówienie, całkowity koszt).
//     Zapisz do pliku – usuń dane zamówienia.
//     Wyświetl liczbę klientów oczekujących na zamówienie (nazwa klienta, adres, koszt całkowity).

package Pizza;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void instructions() {
        System.out.printf("\n1) Add order to the queue\n" +
                "2) Deleting an order from the queue \n" +
                "3) Count orders\n" +
                "4) Output on display\n" +
                "0) Exit the program\n");
    }

    static Order insert() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Enter the address: ");
        String address = in.nextLine();
        System.out.println("Enter the order: ");
        int finish = 1;
        int sum = 0;
        String pizzaName;
        float cost;
        int quantity;
        List<Pizza> pizzaList = new ArrayList<Pizza>();
        while (finish != 0) {
            System.out.println("Enter the name of the pizza: ");
            pizzaName = in.nextLine();
            System.out.println("Enter cost of the pizza: ");
            cost = in.nextFloat();
            System.out.println("Enter the quantity: ");
            quantity = in.nextInt();
            pizzaList.add(new Pizza(pizzaName, cost, quantity));
            sum += quantity * cost;
            System.out.println("Finish order 0-yes 1-no");
            finish = in.nextInt();
            if (finish == 1) in.nextLine();
        }

        System.out.print("Total amount $\n" + sum);
        return new Order(name, address, pizzaList, sum);  //creating an order object

    }

    public static void main(String[] args) throws IOException {
        MyQueue queue = new MyQueue();            //creating an order queue object
        instructions();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    queue.push(insert());
                    break;
                case 2:
                    String filePath = "my_order.txt";
                    queue.saveFile(filePath, queue.pop());
                    break;
                case 3:
                    queue.quantity();
                    break;
                case 4:
                    queue.show();
                    break;
                default:
                    System.out.println("Invalid entry. Please try again\n");
                    break;
            }
            instructions();
            choice = in.nextInt();
        }
    }
}

//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        1
//        Enter the name.
//        Alex
//        Enter the address
//        357 Backstreer av
//
//        Enter the order.
//        Enter the name of the pizza.
//        Peperoni
//        Enter the cost of the pizza.
//        7.5
//        Enter the quantity.
//        3
//        Finish order 0-yes 1-no.
//        1
//        Enter the name of the pizza.
//        4 seasons
//        Enter the cost of the pizza.
//        9.5
//        Enter the quantity.
//        4
//        Finish order 0-yes 1-no.
//        0
//        Total amount – $60.50.
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        1
//        Enter the name.
//        Kris
//        Enter the address.
//        775 Backstreet av
//
//        Enter the order.
//        Enter the name of the pizza.
//        Calsone
//        Enter the cost of the pizza.
//        6.5
//        Enter the quantity.
//        3
//        Finish order 0-yes 1-no.
//        1
//        Enter the name of the pizza.
//        Calzone
//        Enter the cost of the pizza.
//        9
//        Enter the quantity.
//        1
//        Finish order 0-yes 1-no.
//        0
//        Total amount – $28.50.
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        3
//        Number of clients 2
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        4
//        ______________________________________________
//        |  Order
//        ______________________________________________
//        1| Name           Alex
//        | Address 357 Backstreer av
//        | Total amount 60.50
//        ______________________________________________
//        2| Name           Kris
//        | Address 775 Backstreet av
//        | Total amount 28.50
//        ______________________________________________
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        2
//        The order is deleted.
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        2
//        The order is deleted.
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        3
//        No orders
//
//
//        1) Add an order to the queue.
//        2) Delete the order from the queue.
//        3) Count orders.
//        4) Display on a monitor.
//        0) Exit the program.
//        ?
//        0
//
//        File Information:
//
//        ______________________________________________
//        Name           Alex
//        | Address 357 Backstreer av
//        | Total amount 60.50
//        ______________________________________________
//        ______________________________________________
//        Name           Kris
//        | Address 775 Backstreet av
//        | Total amount 28.50
//        ______________________________________________
//
