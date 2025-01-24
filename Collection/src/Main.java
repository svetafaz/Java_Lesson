import example.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        List<String> list1 = new ArrayList<>();

        list1.add("Tom");
        list1.add("Alice");
        list1.add("Kate");
        list1.add("Sam");

        System.out.println(list1.get(1) + "\n");

        for(String person : list1){

            System.out.println("list1: " + person);
        }

        list1.add(1, "Bob");

        System.out.println(list1.get(1) + "\n");

        for(String person : list1){

            System.out.println("list1: " + person);
        }

        if(list1.contains("Tom")){

            System.out.println("ArrayList содержит Tom");
        } else {
            System.out.println("ArrayList не содержит Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        if(list1.remove("Kate")) {
            System.out.println("Kate удалён");
        }
        // удаление по индексу
        list1.remove(0);

        for(String person : list1){

            System.out.println("list1: " + person);
        }

    }

}