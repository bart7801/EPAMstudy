//Let us look at the simple example of file handling in which we open a text file,
//write to and read the information from the file:
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FirstFileClass {

    public static void main(String []args) throws IOException {
        FileWriter myFilew = new FileWriter("my_information.txt");
        myFilew.write("My name is Tom Hardy.\n");
        myFilew.write("I am an English actor and a producer.\nI am active in charity work.\n");
        myFilew.close();

        FileReader myFiler = new FileReader("my_information.txt");
        System.out.println("The first reading method:");
        Scanner scan = new Scanner(myFiler);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + ": " + scan.nextLine());
            i++;
        }
        scan.close();
        myFiler.close();

        System.out.println("\nThe second reading method:");
        myFiler = new FileReader("my_information.txt");
        char[] array = new char[100];
        myFiler.read(array);
        System.out.println(array);

        myFiler.close();
    }
}
//The result:

//The first reading method:
//1: My name is Tom Hardy.
//2: I am an English actor and a producer.
//3: I am active in charity work.

//The second reading method:
//My name is Tom Hardy.
//I am an English actor and a producer.
//I am active in charity work.