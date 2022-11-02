//In general, a method declaration is almost the same as a function in C programming. An access modifier was added before a method. A modifier defines the access type of a method, i.e. it shows the scope of a method in the program. In Java, there are 4 types of access specifiers:
//
//    Package-private (default) (declared/defined without using any modifier): a method accessible within the same class, and the package within which its class is defined.
//    Private: a method accessible only within the class in which it is defined.
//    Protected: a method accessible within the class in which it is defined and in its subclass(es) as well.
//    Public: a method accessible in all classes in your application.
//
//Usually, all properties of a class are made private, and its methods are public. All actions with private properties of a class are implemented through its methods. But it is better to apply the principle of least privilege, which states that each separate block of a program should work only with those rights that it needs to execute the code.
//
//Since the data in a class is private, a user cannot directly define or change the data values. For these purposes, special methods called set- and get- functions are used, using which you can work with data members. There can be several functions of this kind in a class, for one or for each variable.
//
//Setter methods allow you to set (assign) a value to a class variable. A getter function allows you to get the value of a class variable as specified.
//
//Using functions to set initial values for object fields can lead to unexpected errors. In this regard, a special function has been introduced that allows you to initialize an object in the process of its declaration (definition). This function is called a constructor.
//
//class class_name {
//    public class_name (); // default constructor
//}
//
//Unlike regular methods, constructors have certain rules:
//
//    A constructor is a member of a class and has the same name as the class.
//    A constructor may or may not have arguments, but it never returns a value (even void).
//    A constructor that has all its arguments by default is called a default constructor, that is, a constructor that can be called without specifying any arguments. There can only be one default constructor for each class.
//    A class can have multiple constructors, which allows for several different ways to initialize objects. A constructor is a function, which means it can be overloaded. To overload the constructor of a class, you just need to declare it in all the required formats and define the action associated with each form of the constructor.
//    A constructor cannot be called in the same way as a regular method of an object is called.
//    A constructor is not inherited.
//
//Now let us program our example about the buildings.

package ClassesAndObjectsInOOP;

public class Execute {
    public static void main(String[] args) {
        Building cafe = new Building();
        cafe.purpose = "organization of recreation";
        cafe.address = "London, Baker Street";
        cafe.floors_number = 2;
        // cafe.wallMaterial="brick"; // error because of private type
        cafe.setWallMaterial("brick");
        System.out.println("Information about the cafe:\n" + cafe.getInfo());

        Building shop = new Building("organization of shopping", "London, Crawford street", 1, "wood");
        System.out.println("Information about the shop:\n" + shop.getInfo());
    }
}
//The result:
//
//Information about the cafe:
// The purpose is organization of recreation.
// Address: London, Baker Street.
// Number of floors: 2 and wall material is brick
//Information about the shop:
// The purpose is organization of shopping.
// Address: London, Crawford street.
// Number of floors: 1 and wall material is wood