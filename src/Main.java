import AbstractFactory.*;
import AbstractFactory2.*;
import AbstractFactory2.Shape;
import Builder.*;
import Builder2.*;
import Factory.*;
import Factory2.*;
import Prototype.*;
import Prototype2.*;
import Singleton.*;
import Singleton2.*;

public class Main {
    public static void main(String[] args) {

        /* Singleton

       // Singleton pattern is one of the simplest design patterns in Java. T
        //his type of design pattern comes under creational pattern as this pattern
        //provides one of the best ways to create an object.

        //This pattern involves a single class which is responsible to create
        //an object while making sure that only single object gets created.
        //This class provides a way to access its only object which can be
        //accessed directly without need to instantiate the object of the class.

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

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        /* Singleton 2

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();

        //show the message
        object.showMessage();
        object1.showMessage();

        System.out.println("Hash Code for object 1 is :" + object.hashCode());
        System.out.println("Hash Code for object 1 is :" + object1.hashCode());

        System.out.println("Same hashCode means that both objects were created from the same" +
                "instance. Therefore, behavior is as expected....");
         */



        /* Builder

        Builder pattern builds a complex object using simple objects and using a s
        tep by step approach. This type of design pattern comes under creational pattern
        as this pattern provides one of the best ways to create an object.

        A Builder class builds the final object step by step. This builder is independent of other
        objects.

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

        /* Builder 2

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
         */

        /* Factory

        //Factory pattern is one of the most used design patterns in Java.
        //This type of design pattern comes under creational pattern as this
        //pattern provides one of the best ways to create an object.

        //In Factory pattern, we create object without exposing the creation logic to the
        //client and refer to newly created object using a common interface.

        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
        */

        /* Factory 2

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

         */

        
        /* Prototype

        Prototype pattern refers to creating duplicate object while keeping performance in mind.
        This type of design pattern comes under creational pattern as this pattern provides
        one of the best ways to create an object.

        This pattern involves implementing a prototype interface which tells to create a clone
         of the current object. This pattern is used when creation of object directly is costly.
         For example, an object is to be created after a costly database operation. We can cache
         the object, returns its clone on next request and update the database as and when needed
         thus reducing database calls.

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
        /* Prototype 2
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
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

        /* Abstract Factory 2
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