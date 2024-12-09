package main;

import utils.Logger;
import model.*;

import utils.FuncPrint;
import utils.TimeLogger;

public class Main {

    public static Logger logger;

    public static void main(String[] args) {

        logger = new TimeLogger();
//        System.out.println("Привет магазин!");
//
//        System.out.println("Начало дня: " + Product.counterProducts);
        Storage storage = new Storage();

        Product[] productsOne = new Product[3];
//        System.out.println(Arrays.toString(productsOne));

        productsOne[0] = new Product("table", 0, 5);
        productsOne[1] = new Product("chair", 1, 10);
        productsOne[2] = new Product("bookshelf", 2, 3);

        Product[] productsTwo = {
                new Product("table", 0, 5),
                new Product("chair", 1, 10),
                new Product("bookshelf", 2, 3)
        };

        //TODO: Product[] newStorаge = storage.addNewStorage();

        Product table = new Product("table", 0, 5);
        Product chair = new Product("chair", 1, 10);
        Product bookshelf = new Product("bookshelf", 2, 3);

        Product[] productsThree = new Product[3];

        storage.addProducts(productsThree, table);
        storage.addProducts(productsThree, chair);
        storage.addProducts(productsThree, bookshelf);

//        System.out.println(Arrays.toString(productsOne));
//        System.out.println(Arrays.toString(productsTwo));
//        System.out.println(Arrays.toString(productsThree));

//        storage.getProducts(productsThree);
        storage.buyProducts(productsThree, table);

        Employee employee1 = new Employee(
                1,
                "Russia",
                24,
                1L
        );

        Employee employee2 = new Employee(
                2,
                "Russia",
                30,
                2L
        );

//        System.out.println(employee1.getEmployeeCard());
//        System.out.println(employee2.getEmployeeCard());


        Buyer buyer1 = new Buyer(
                1,
                "Russia",
                -1,
                "Вася",
                "Kazan"
        );

        Buyer buyer2 = new Buyer(
                1,
                "French",
                -1,
                "Василиса",
                "Paris"
        );

//        System.out.println(buyer1.getAge());

        Employee employee3 = new Employee(
                3,
                "Russia",
                -30,
                3L
        );
//        System.out.println(employee3.getAge());


        User buyer3 = new Buyer(
                1,
                "French",
                -1,
                "Вадим",
                "Paris"
        );

//        System.out.println(buyer3.getAge());
//        System.out.println(buyer3.getUsername());

        User child1 = new Child(
                1,
                "French",
                -1,
                "Марина",
                "Paris"
        );

//        System.out.println(child1.getAge());

        Student student1 = new Student(
                1,
                "Russia",
                8,
                "Ваня",
                "Школа 1"
        );

//        System.out.println("Student: " + student1.getAge());

        User[] arrayUsers = new User[]{
                employee1,
                employee2,
                employee3,
                buyer1,
                buyer2,
                buyer3,
                child1,
                student1
        };

//        FuncPrint.print("arrayUsers[0]: " + arrayUsers[0].getAge());
//        FuncPrint.print("arrayUsers[6]: " + arrayUsers[6].getAge());
//        FuncPrint.print("arrayUsers[7]: " + arrayUsers[7].getAge());


        for (User user : arrayUsers) {
            FuncPrint.print(user.getPass());
        }

    }

}