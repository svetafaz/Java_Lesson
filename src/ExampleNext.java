import java.util.Scanner;

public class ExampleNext {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите имена");
        // используем когда мы работаем полностью со строкой, но использовать с осторожностью
        String someText = scr.nextLine();

        System.out.println("Строка 1: " + someText);
        System.out.println("Строка 2 " + someText );

        // можем перечислить элементы через пробел и работать как с отдельными элементами
        String someWord1 = scr.next();
        String someWord2 = scr.next();
        String someWord3 = scr.next();

        System.out.println("1 Слово: " + someWord1);
        System.out.println("2 Слово: " + someWord2);
        System.out.println("3 Слово: " + someWord3);
    }
}
