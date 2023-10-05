import AbstractFactory.*;
import AbstractFactory2.*;
import Builder.*;
import Factory.*;
import Prototype.*;
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

        /* Builder
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

        System.out.println(user3);*/

        /* Factory
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
        */

        /*
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String showPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
         */

        /* Abstract Factory 1
        //Abstract Factory patterns work around a super-factory
        //which creates other factories.
        //This factory is also called as factory of factories.
        //This type of design pattern comes under creational
        //pattern as this pattern provides one of the best ways
        //to create an object.
        //In Abstract Factory pattern an interface is responsible for
        //creating a factory of related objects without explicitly specifying
        //their classes.
        //Each generated factory can give the objects as per the Factory pattern.

        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
         */
        /*
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();
         */


    }
}