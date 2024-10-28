import java.util.Arrays;

public class LessonArray {
    public static void main(String[] args) {

        final int REGION_CODE = 116;

        // объявляем переменную
        int[] array;

        // задаём размер массива, либо задаём значения массиву
        array = new int[10]; // {0,0,0,0,0,0,0,0,0,0}
        // размер массива равен кол-ву элементов
        int[] array2 = {1235, 223, 3321, 9, 5123, 6, 72, 8, 9, 1};

        // задаём новый размер массива со значение (новый массива!)
        array = new int[] {1, 2, 4};

        // здесь мы работаем с индексом array[i]
        // используем когда нужно получить элементы из массива по индексу
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }

        // foreach  ( ТИП ИМЯ_ЭЛЕМЕНТА : ИМЯ_МАССИВА )
        // используем когда нужно обработать все элементны массива array2
        for ( int elmArray2 : array2) {
            if (elmArray2 == array2[array2.length - 1]) {
                System.out.println(elmArray2);
            } else {
                System.out.println(elmArray2 + ", ");
            }

        }

        int check = 0;

        // можно сделать с помощью foreach, так как мы работаем со значениями
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0) {
                check++;
                if (check == 1 || check == 2) {
                    System.out.println(array2[i]);
                }
/*               if ( check == 2 ) {
                    System.out.println(array2[i]);
                }
*/
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("[" + i + "] " + array2[i] + " ");
            if (i % 2 == 0)
                continue;
            System.out.println("");

            int symb = array2[2];  // array взять элемент массива с индексом [2] = 3321

        System.out.println(symb);
        System.out.println(Arrays.toString(array));

        }

        int[][] listMulti = {{11, 12, 13, 14, 16}, {1, 2, 3}};


        // Пример получения элементов из многомерного массива
        for (int i = 0; i < listMulti.length; i++) {
            for (int j = 0; j < listMulti[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j +"]:" + listMulti[i][j]);
            }
        }

        int[][] newArray = new int[10][10];



    }
}
