package tasks;

import tasks.model.Purchase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class TasksCollectors {
    public static void main(String[] args) {
        String result = task1(new Purchase[] {});
        System.out.println(result);

    }

    public static String task1(Purchase[] purchases) {
        return Arrays.stream(purchases)
                .collect(Collectors.groupingBy(x -> x.buyer,
                        Collectors.reducing(0,
                                x -> x.count,
                                (x, y) -> x + y)))
                .entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("None");
    }

}
