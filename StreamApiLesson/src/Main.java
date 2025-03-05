import model.Product;
import model.Purchase;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};

        IntStream stream = Arrays.stream(a).filter(x -> x % 2 == 0);

        a[0] = 10;
        a[1] = 3;

        stream.forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(System.out::println);
        System.out.println("---------------------------------------------------");


        String[] citiesStream1 = new String[]{"Париж", "Лондон", "Мадрид","Берлин", "Брюссель"};
        for (String s : citiesStream1) System.out.println(s);
        System.out.println("---------------------------------------------------");

        Product[] products = new Product[] {
                new Product("table", 20),
                new Product("chair", 10),
                new Product("phone1", 40),
                new Product("phone2", 35)
        };

//        Stream до map        -> Stream после map
//        Product("table", 30) -> "table"
//        Product("chair", 35) -> "chair"

        Arrays.stream(products)
                .filter(x -> x.price < 30)
                .map(x -> x.name)
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        Arrays.stream(products)
                .filter(x -> x.price > 30)
                .sorted((x,y) -> Integer.compare(x.price, y.price))
                .forEach(x -> System.out.println(x.name));

        System.out.println("---------------------------------------------------");

        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers
                .sorted() // Если не сделать, то в выводе -4 и -5 потеряются
                .takeWhile(n -> n < 0)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers1.dropWhile(n -> n < 0)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2)
                .distinct() // С помощью этого метода можно удалить повторяющиеся элементы из потока
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");

        Stream<String> citiesStream2 = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        long countCity = citiesStream2
                .skip(1)
                .limit(3)
                .count();

        System.out.println("countCity: " + countCity);

        System.out.println("---------------------------------------------------");

        Optional<Product> product = Arrays.stream(products)
                .max((x, b) -> Integer.compare(x.price, b.price));
//        if (product.isEmpty()) {
//            System.out.println("Массив пуст");
//        } else {
//            System.out.println(product.get().name);
//        }

//        if (product.isPresent()) {
//            System.out.println(product.get().name);
//        }

//        Product product1 = product.orElse(new Product("empty", 0));
//
//        product.ifPresent(x -> System.out.println(x.name));
//
//        System.out.println(product1.name);

        product.ifPresentOrElse(
                x -> System.out.println(x.name),
                () -> System.out.println("no such element")
        );


        System.out.println("---------------------------------------------------");


        Optional<Integer> sum = Arrays.stream(products)
                .map(x -> x.price)
                .reduce((x, y) -> x + y);


        sum.ifPresentOrElse(
                System.out::println,
                () -> System.out.println(1000)
        );

        System.out.println("---------------------------------------------------");

        int sum2 = Arrays.stream(products)
                .map(x -> x.price)
                .reduce(1000, (x, y) -> x + y);

        System.out.println(sum2);

        System.out.println("---------------------------------------------------");

        List<Product> list1 = Arrays.stream(products).toList();

        Set<Product> list2 = Arrays.stream(products).collect(Collectors.toSet());

        Map<String, Integer> list = Arrays.stream(products)
                .collect(Collectors.toMap(
                        x -> x.name,
                        x -> x.price));

        Purchase[] purchases = new Purchase[] {
                new Purchase("People_1", "product_1", 1000),
                new Purchase("People_2", "product_2", 500),
                new Purchase("People_2", "product_3", 6000),
                new Purchase("People_2", "product_3", 6000),
                new Purchase("People_2", "product_4", 8000),
                new Purchase("People_1", "product_7", 8000),
                new Purchase("People_1", "product_7", 4000),
        };

        Map<String, List<Purchase>> map = Arrays.stream(purchases)
                .collect(Collectors.groupingBy(x -> x.buyer));

        System.out.println(map);

        System.out.println(map.get("People_2"));

        System.out.println("---------------------------------------------------");

        Map<Boolean, List<Purchase>> map2 = Arrays.stream(purchases)
                .collect(Collectors.partitioningBy(x -> x.price > 5000));

        System.out.println(map2);


        System.out.println("---------------------------------------------------");

        Map<String, Long> map3 = Arrays.stream(purchases)
                .collect(Collectors.groupingBy(x -> x.buyer, Collectors.counting()));

        System.out.println(map3);

        System.out.println("---------------------------------------------------");

        Map<String, List<Purchase>> map6 = Arrays.stream(purchases)
                .peek(System.out::println)
                .collect(Collectors.groupingBy(x -> x.buyer));

        System.out.println(map6);

        System.out.println("---------------------------------------------------");

        Arrays.stream(products)
                .flatMap(x -> Stream.of(
                        x.name + ": Цена со скидкой - " + x.price * 0.9,
                        x.name + ": Цена  - " + x.price,
                        x.name + ": Цена после повышения - " + x.price * 1.2))
                .forEach(System.out::println);

        Integer[] array = Arrays.stream(products)
                .map(x -> x.price)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

        System.out.println("---------------------------------------------------");

        Map<String, Integer> result = Arrays.stream(purchases)
                .collect(Collectors.groupingBy(x -> x.buyer, Collectors.summingInt(x -> x.price)));

        System.out.println(result);

        System.out.println("---------------------------------------------------");


        Map<String, Integer> results = Arrays.stream(purchases)
                .collect(Collectors.groupingBy(x -> x.buyer,
                        Collectors.reducing(
                                0,
                                x -> x.price,
                                Integer::sum)));



        System.out.println(results);






    }
}