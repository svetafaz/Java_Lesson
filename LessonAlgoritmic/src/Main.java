import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] exArray;
        exArray = new int[]{89, 57, 91, 47, 95, 3, 27, 22, 99};
        int[] ex2Array;
        ex2Array = new int[]{2, 3, 5, 675, 42, 32, 43};


        int searchValue = 95;

        int[] result = linearSearch(exArray, ex2Array, searchValue);

        System.out.println(Arrays.toString(result));

        Arrays.sort(exArray);

        int res = binarySearch(exArray, searchValue);
        print(searchValue, res);

        int res2 = recBinarySearch(exArray, 0, exArray.length - 1, searchValue);
        print(searchValue, res2);

        int res3 = recursiveBinarySearch(exArray, 0, exArray.length - 1, searchValue);
        print(searchValue, res3);

    }

    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " не найден.");
        } else {
            System.out.println(elementToSearch + " найден под индексом: " + index);
        }
    }

    /*
    ---Линейный поиск---
    Линейный или последовательный поиск – простейший алгоритм поиска. Он редко используется из-за своей неэффективности. По сути, это метод полного перебора, и он уступает другим алгоритмам.

    У линейного поиска нет предварительных условий к состоянию структуры данных.

    ---Объяснение---
    Алгоритм ищет элемент в заданной структуре данных, пока не достигнет конца структуры.

    При нахождении элемента возвращается его позиция в структуре данных. Если элемент не найден, возвращаем -1.

    ---Временная сложность---
    Для получения позиции искомого элемента перебирается набор из N элементов. В худшем сценарии для этого алгоритма искомый элемент оказывается последним в массиве.

    В этом случае потребуется N итераций для нахождения элемента.

    Следовательно, временная сложность линейного поиска равна O(N).

    ---Пространственная сложность---
    Этот поиск требует всего одну единицу памяти для хранения искомого элемента. Это не относится к размеру входного массива.

    Следовательно, пространственная сложность линейного поиска равна O(1).
     */
    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public static int[] linearSearch(int arr[], int arr2[], int elementToSearch) {

        int index1Array;
        int index2Array;

        index1Array = linearSearch(arr, elementToSearch);
        index2Array = linearSearch(arr2, elementToSearch);

        int[] result = {index1Array, index2Array};

        return result;

    }




    /*
    ---Объяснение---
    Этот вид поиска использует подход «Разделяй и властвуй»,
    требует предварительной сортировки набора данных.

    Алгоритм делит входную коллекцию на равные половины,
    и с каждой итерацией сравнивает целевой элемент с элементом в середине.
    Поиск заканчивается при нахождении элемента.
    Иначе продолжаем искать элемент, разделяя и выбирая соответствующий раздел массива.
    Целевой элемент сравнивается со средним.

    Вот почему важно иметь отсортированную коллекцию при использовании двоичного поиска.

    Поиск заканчивается, когда firstIndex (указатель) достигает lastIndex (последнего элемента).
    Значит мы проверили весь массив Java и не нашли элемента.

    Есть два способа реализации этого алгоритма: итеративный и рекурсивный.

     */

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }




    public static int recBinarySearch(int[] arr, int firstIndex, int lastIndex, int elementToSearch) {
        int middle = (firstIndex + lastIndex) / 2;
        if (lastIndex < firstIndex) {
            return -1;
        }

        if (elementToSearch == arr[middle]) {
            return middle;
        } else if (elementToSearch < arr[middle]) {
            return recBinarySearch(arr, firstIndex, middle - 1, elementToSearch);
        } else {
            return recBinarySearch(arr, middle + 1, lastIndex, elementToSearch);
        }
    }


    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }
}