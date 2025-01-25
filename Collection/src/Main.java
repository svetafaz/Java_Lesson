import example.Example;

import java.util.*;

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

        Deque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        System.out.println(states);
        states.addFirst("France"); // добавляем элемент в самое начало
        System.out.println(states);
        states.push("Great Britain"); // добавляем элемент в самое начало
        System.out.println(states);
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        System.out.println(states);
        states.add("Italy");
        System.out.println(states);
        states.add("Germany");
        System.out.println(states);

        int[] array2 = {1235, 223, 3321, 9, 5123, 6, 72, 8, 9, 1};

        Arrays.sort(array2);

        System.out.println(Arrays.toString(array2));

        Example[] exArray = {new Example(), new Example(), new Example()};

        Arrays.sort(exArray);

        System.out.println(Arrays.toString(exArray));



    }

}