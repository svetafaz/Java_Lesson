import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {

        long myValue = 0L;
        // array {0L, 0L}

        // объявление массива
        short[] arrayShort;

        // инициализация массива
        short[] arrayShortExp = new short[10];

        // 0 2 2345

        int valueInt = 3;

        // заполняем массив помощью явного приведения
        arrayShortExp[1] = (short) valueInt;

        byte[] arrayID = {0,1,2,3,4};

        int[] arrayIDInteger = new int[10]; // {0,0,0,0,0,0,0}

        int i = 0;

        for (int element: arrayID) {
            arrayIDInteger[i] = element;
            i++;
        }

//        System.out.println(Arrays.toString(arrayIDInteger));


        int[] array1 = {1,2,3};
        int[] array2 = array1;
        // Если мы захотим создать новый массив и заполнить его теми же данными, то Arrays.copyOf(array1, array.length)

        int[] array3 = {3,2,1};

        int[][] bigArray = {array1, array3};


        for (int[] elm: bigArray) {
            System.out.println(Arrays.toString(elm));
        }
        System.out.println(Arrays.toString(bigArray));

        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);


        /* Задача: Автобус - 56 мест --- int[56]
        На 1 остановку - 4
        while так как каждая остановка = 1 итерации, цикл завершится когда проедем 3 остановки
        [0] - 1
        [1] - 2
        ...
        На 2 ост - 15
        не допустить, чтобы на 2 остановку пассажир сел на место, где занято
        На 3 ост - 7

        Вопрос: Какие места свободны?

        Как найти ответ? Нам нужно будет найти последнее место, отнять занятые

         */


        // С чего начать? Инициализация переменных
        int[] seatsBus = new int[56]; // {0,0,0,0,0,...,0} 0 -> 1

        System.out.println(seatsBus.length);

        int checkStops = 1;

        while ( checkStops <= 3 ) {


            checkerPlace(checkStops, seatsBus);

//            for (int j = 0; j < seatsBus.length; j++) {
//                if (seatsBus[j] == 0){
//                    seatsBus[j] = 1;
//                }
//            }

            // Выполняем условия и операции

            checkStops++;

        }



    }

    public static void checkerPlace(int check, int[] seats) {
        switch (check) {
            case 1:

            case 2:
                if (fullPlace(seats)) {
                    break;
                }
                //.... for
                fullPlace(seats);
            case 3:
                if (fullPlace(seats)) { // проверка на пустоту автобуса
                    break;
                }
            default:
                System.out.println();
        }
    }

    public static boolean fullPlace(int[] seats) {
        // проверка на пустоту автобуса
        return seats[seats.length - 1] == 1;
    }



}
