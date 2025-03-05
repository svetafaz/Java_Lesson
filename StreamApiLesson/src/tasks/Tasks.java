package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {

        String textTask1Example = "Буря мглой небо кроет. Кроет небо мглой буря. Буря небо мглой море кроет.";

        String[] text1Task4Example = new String[] {
                "qwefqw",
                "eqwfqqwef",
                "weqfsacqw",
                "  eqq  qe qw +",
                "wef",
                "okljj",
        };

        String[] text2Task4Example = new String[] {
                "yotyk",
                "tuth",
                "mui",
                "  35hwegmi56 +",
                "ukykkg",
                "cxbvcbx ",
        };

        int k1Task4 = 5;
        int k2Task4 = 7;

        task1(textTask1Example);

//        task2();
//        task3();


        System.out.println(task4(text1Task4Example, text2Task4Example, k1Task4, k2Task4));

//        task5();
//        task6();

    }

    static void task1(String str) {
//        str = str.toLowerCase();
//        // TODO: написать регулярку, которая учитывает точку (****. **** *****)
//        String[] array = str.split(" ");
//
//        Stream<String> stream = Arrays.stream(array);
//
//        Map<String, Long> map = stream.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//
//        map.forEach((key, value) -> System.out.println(key + " - " + value));

        Arrays.stream(str.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " - " + value));
    }

    static List<String> task4(String[] a, String[] b, int k1, int k2) {
//        Stream<String> stream1 = Arrays.stream(a)
//                .filter(s -> s.length() > k1);
//        Stream<String> stream2 = Arrays.stream(b)
//                .filter(s -> s.length() < k2);
//
//        Stream<String> stream3 = Stream.concat(stream1, stream2);
//
//        stream3 = stream3.sorted((x, y) -> -x.compareTo(y));
//
//        return stream3.collect(Collectors.toList());

        return Stream.concat(
                        Arrays.stream(a).filter(s -> s.length() > k1),
                        Arrays.stream(b).filter(s -> s.length() < k2))
                .sorted((x, y) -> -x.compareTo(y))
                .collect(Collectors.toList());

    }

}
