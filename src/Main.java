import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        showFirstFileResult();
        showSecondFileResult();
    }

    public static void showFirstFileResult() {
        ElementaryTraining methods = new ElementaryTraining();
        System.out.println("Первая часть");
        System.out.println("Среднее значение введённых параметров.");
        System.out.println("Результат первого метода:");
        System.out.println(methods.averageValue(2, 3));

        System.out.println("Манипуляция с числами и возврат их суммы.");
        System.out.println("Результат второго метода:");
        System.out.println(methods.complicatedAmount(2, 2, 2));

        System.out.println("Замена значения в соответствии с условием.");
        System.out.println("Результат третьего метода:");
        System.out.println(methods.changeValue(5));

        System.out.println("Замена местами первой и последней цифр.");
        System.out.println("Результат четвёртого метода:");
        System.out.println(methods.swapNumbers(12346));

        System.out.println("Изменить значение четных цифр на 0.");
        System.out.println("Результат пятого метода:");
        System.out.println(methods.zeroEvenNumber(32451));
    }

    public static void showSecondFileResult() {
        ArraysTraining methods = new ArraysTraining();
        int[] numbers = {1, 6, 3, 7, 5, 5, 5};

        System.out.println("Вторая часть");
        System.out.println("Сортировка пузырьком.");
        System.out.println("Результат первого метода:");
        System.out.println(Arrays.toString(methods.sort(numbers)));

        System.out.println("Максимальное значение из введённых.");
        System.out.println("Результат второго метода:");
        System.out.println(methods.maxValue(numbers));

        System.out.println("Элементы массива в обратном порядке.");
        System.out.println("Результат третьего метода:");
        System.out.println(Arrays.toString(methods.reverse(numbers)));

        System.out.println("Массив из чисел Фибоначчи.");
        System.out.println("Результат четвёртого метода:");
        System.out.println(Arrays.toString(methods.fibonacciNumbers(10)));

        System.out.println("Максимальное количество одинаковых элементов.");
        System.out.println("Результат пятого метода:");
        System.out.println(methods.maxCountSymbol(numbers));
    }
}
