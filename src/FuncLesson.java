import java.util.Arrays;

public class FuncLesson {

    public static void main(String[] args) {
        //
        char[] arrayChars = new char[] {'x','a', 'b', 'r', 100, 'г', 'ю', 'X', 'X', '#', '&', '|', '\"', '\\'};
        int[] arrayInt = new int[10];

        // вызываем метод, который мы создали, он нам ничего не возвращает, только получает на вход переменную требуемого
        sorted(arrayChars);
        // перегрузка метода - нам важен только какой тип данных был передан внутри, таким образом Java найдёт метод с такой же сигнатурой и использует его
        // от реализации не зависит и от имени переменных, важен тип переданных данных
        // имя метода и принимаемые данные -> сигнатура метода
        sorted();
        sorted(arrayInt);

        System.out.println(Arrays.toString(arrayChars));

        // Так как данные типа String являет массивом char'ов, то принцип работы с ним будет таким же
        String textForSorted = "Hello world! | Привет мир!";

        String textTwo;

        char symbInText = textForSorted.charAt(1);

        System.out.println(symbInText);

        int sybmIndexOf = textForSorted.indexOf("world");

        System.out.println(sybmIndexOf);

        String subText = textForSorted.substring(6, 11);

        System.out.println(subText);

        // чтобы работать со String как с массивом char, нам нужно преобразовать его с помощью уже готового метода .toCharArray()
        char[] text = textForSorted.toCharArray();

        Arrays.sort(text);

        System.out.println(textForSorted + '\n' + Arrays.toString(text));

        constText(textForSorted);
        constText(textForSorted, 6);
        constText("сортировка", 1);
        constText("", 0);

        // так как базово все числа распознаются компилятором как Int, то на нужно явно указать, что мы передаём тип Byte, только в таком случае перегруженный метод будет работать
        constText(textForSorted, (byte) 129);
    }

    // Метод для сортировки, реализация пишется разработчиком и может быть реализована по-разному, главное в результате получить отсортированные данные внутри arrayChars.
    // Почему это сработает и нам не нужно возвращать ничего?
    // Потому что мы влияем на содержимое массива, а не возвращаем новое значение или объект другого типа. Работа с массивом производится по его ссылку (имя_массива хранит в себе ссылку)
    private static void sorted(char[] arrayChars) {
        Arrays.sort(arrayChars);
        String textTwo;
        textTwo = "34";
    }

    static void sorted(int[] arrayChars) {
        Arrays.sort(arrayChars);
    }

    static void sorted() {
        System.out.println("Вы не указали массив для обработки.");
    }

    public int index(int x) {
        if (x == 2) {
            return 1;
        }
        return 4;


    }

    // пример того как влияет сигнатура метода

    static void constText (String text) {
        System.out.println("Результат " + text);
    }

    static void constText (String text, int result) {

        System.out.println("Ответ задачи " + text + " результат вычислений " + result);
    }

    static void constText (String text, byte def) {

        System.out.println("Ответ задачи " + text + " результат вычислений " + def );
    }



}

