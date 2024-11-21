package main;

import model.*;
import utils.FuncPrint;

public class Main {
    public static void main(String[] args) {

        FuncPrint system = new FuncPrint();
        Class1 class1 = new Class1();

        User person;

        person = new User();

        User user1 = new User(
                1,
//                "Виталя",
                45,
                5
        );
        User user2 = new User(
                2,
//                "Екатерина",
                64,
                8
                );

        system.print(class1.getDescription());

        system.print("Hello world!");

        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());

        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());


        user1.grow(2, system);
        user2.grow(5, system);

        system.print(user1);
        system.print(user1.getUsername());
        system.print(user1.getAge());
        system.print(user1.getHeight());

        system.print(user2);
        system.print(user2.getUsername());
        system.print(user2.getAge());
        system.print(user2.getHeight());

        system.print(person);
        system.print(person.getUsername());
        system.print(person.getAge());
        person.grow(3, system);
        system.print(person.getAge());
        system.print(person.getHeight());
    }

}
// defaulted
class Class1 {

    private String description;
    private int x;

    // начало инициализаторы
    {
        description = "Я описание main.Class1";
        x = 5;
        x *= 5;
    }
    // конец инициализатора

    public Class1() {

    }

    public String getDescription() {
        return this.description;
    }
}

