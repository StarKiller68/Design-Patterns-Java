import Builder.*;
import Singleton.*;
public class Main {
    public static void main(String[] args) {

        /* Singleton
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        } */

        User user1 = new User.UserBuilder("Herman", "Breckenridge")
                .age(30)
                .phone("1234567")
                .address("1234 Fake St.")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Darth", "Vader")
                .age(40)
                .phone("9787")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Khan", "Singh")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}