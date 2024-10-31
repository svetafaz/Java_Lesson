import java.util.Arrays;

public class ExampleFunc {
    public static void main(String[] args) {
        sout("Hello world");
        sout("5 * 5 = " + sqr(5));

        sout("Max of 5 and 5 is: " + max(5, 5));
        int[] array = new int[] {1, 2, 3, 4, 5};
        sout("Average of array is: " + average(array));

        double[] arrayRandom = createArray(5);
        System.out.println(Arrays.toString(arrayRandom));
        sout("Created new array\n");
        sout("Average of created array is: " + average(array));
        int i1 = sum(10);
        sout("i1 = " + i1);

    }

    private static void sout(String message) {
        System.out.println(message);
    }
    public static int sqr(int x) {
        return x * x;
    }

    public static String max(int a, int b) {
        if (a > b)
            return "a: " + a;
        else
            return "b: " + b;
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum /= array.length;
    }
    public static double[] createArray(int length) {
        double[] result = new double[length];
        for (int i = 0; i < length; i++){
            result[i] = Math.random() * 10;
        }
        return result;
    }

    // 3!   ?
    // 3 * 2 * 1 = 6
    // n * (n-1) * (n-2)

    /*
    10
    0 + 1 + 2 + 3 + 4 + ... + 10

     */


    static int sum(int n) {
        if (n < 1) {
            return 0;
        }

        if (n==5) {
            sout("n = " + n);
            return 8;
        }

        if (n == 101) {
            return 101;
        }
        sout("n = " + n);

        return n + sum(n-1);
    }

}
