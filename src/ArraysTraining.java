import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < valuesArray.length - 1; i++) {
                if (valuesArray[i] > valuesArray[i + 1]) {
                    flag = false;
                    int tmp = valuesArray[i];
                    valuesArray[i] = valuesArray[i + 1];
                    valuesArray[i + 1] = tmp;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if (values.length == 0) {
            return 0;
        } else {
            int max = values[0];
            for (int value : values) {
                if (value >= max) {
                    max = value;
                }
            }
            return max;
        }
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            int tmp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = tmp;
        }
        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        int[] fibArr = new int[numbersCount];
        if (numbersCount < 1) {
            return fibArr;
        } else if (numbersCount == 1) {
            fibArr[0] = 0;
        } else {
            fibArr[0] = 0;
            fibArr[1] = 1;
            for (int i = 2; i < numbersCount; i++) {
                fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
            }
        }
        return fibArr;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        int[] tmpArr = array.clone();
        HashSet<Integer> set = IntStream.of(array).boxed().collect(Collectors.toCollection(HashSet::new));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : set) {
            map.put(j, 0);
        }
        for (int i : tmpArr) {
            map.put(i, map.get(i) + 1);
        }
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
