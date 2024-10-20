import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean check = true;

        // константные значения, который нельзя будет изменить
        final int STATUS_CODE_BASE = 4;
        final int STATUS_CODE_ADMIN = 3;
        final String TEXT_BASE = "ex = ";

        int ex;
        ex = STATUS_CODE_BASE;

        while (check) {   // если while true - выполняем цикл  / false - завершаем цикл и идём дальше

            if (ex == STATUS_CODE_ADMIN) {
                System.out.println(TEXT_BASE + ex);
            }
            System.out.println("Введите имя: ");
            String textUserString = scanner.next();
            System.out.println("Введите возраст: ");
            int textUserAge = scanner.nextInt();
            final String COUNTRY_USER_ADMIN = "Russia";
            System.out.println("Введите свою страну: ");
            String textCountry = scanner.next();

            if (textUserAge < 20) {
                check = false;
            }
            ex = STATUS_CODE_BASE;

            if ((textUserString.equals("Admin") || textUserString.equals("admin") ) && COUNTRY_USER_ADMIN.equals(textCountry) ) {
                System.out.println("Готов к работе");
                ex = STATUS_CODE_ADMIN;

            } else {
                System.out.println("Приятного использования приложения!");
            }

        }

        int a;
        a = 13;

        do {
            System.out.println("Привет! " + a);
            a++;
        }
        while (a<12); // < > == != >= <= .equels()  return true/false
        /* Выполнение блока do
         Проверяем условие для while
         a<12
         a ? = 14
         14 < 12  -- false
        цикл завершён, блок do больше не выполняется.

         */


        byte ageHuman = 21;

        byte ageMax = 20;

        String today = "Суббота";
        String tomorrow = "Суббота";

        int changeValue = 0;

        boolean condition;

        String textUserString = scanner.next();

        condition = today.equals(textUserString);

        System.out.println(condition);

        while (condition) {
            changeValue++;
            System.out.println(today + " : " + changeValue);
            if (changeValue == 4) {
                today = "Среда";
                condition = false;
                System.out.println("Программа завершена " + today);
            }
        }

        for (int i = 0; i <= 4; i++) {

            // пример того, как мы можем влиять на i во время каждой итерации (не рекомендуется!)
            System.out.println(today + " : " + i);
            int i1 = i == 3 ? i++ : i--;

            System.out.println("i1: "+ i1);

            System.out.println("i: " + i);
            System.out.println("i++: " + ++i);
            if (i == 3) {
                today = "Пятница";
            }
        }

        System.out.println("Хорошего дня!");

        // i++ инкремент
        // i-- декремент

    }

}
