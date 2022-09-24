import SecondTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowSecondTask {
    public static void showFirstFileResult(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<String> listWords = new ArrayList<>(Arrays.asList("One", "Two", "Three"));

        CollectionsBlock<Integer> methods = new CollectionsBlock<>();
        System.out.println("Два списка в один");
        System.out.println(methods.collectionTask0(list1, list2));
        System.out.println("После каждого элемента добавляется предшествующая ему часть");
        System.out.println(methods.collectionTask1(list3));
        System.out.println("Проверка совпадения множества элементов");
        System.out.println(methods.collectionTask2(list1, list2));
        System.out.println("Циклический сдвиг");
        System.out.println(methods.collectionTask3(list2, 2));
        System.out.println("Замена каждого слова на другое");
        System.out.println(methods.collectionTask4(listWords, "Two", "Second"));
        System.out.println("Над списком студентов выполнить действия");
        methods.collectionTask5();
    }

    public static void showSecondFileResult(){
        System.out.println("""
                Тексты заданий в файле ClassesBlock
                Первые 4 задания реализованы в отдельных классах
                1 - Mobile
                2 - Dynamic
                3 - Triangle
                4 - Time
                """);
        System.out.println("Далее имена классов отображают номер задания");
        System.out.println("Задание 5");
        TaskV.start();
        System.out.println("Взаимодействие между классами");
        System.out.println("Задание 6 - TaskVI");
        System.out.println("Задание 7 - TaskVII");
    }

    public static void showThirdFileResult(){
        StringsTraining methods = new StringsTraining();
        System.out.println("Строка из нечетных символов входной");
        System.out.println(methods.getOddCharacterString("qwerty"));
        System.out.println("Количество символов идентичных последнему");
        System.out.println(Arrays.toString(methods.getArrayLastSymbol("qwyrty")));
        System.out.println("Количество цифр в строке");
        System.out.println(methods.getNumbersCount("qw1er3ty5"));
        System.out.println("Заменить все цифры соответствущими словами");
        System.out.println(methods.replaceAllNumbers("q1w2e3"));
        System.out.println("Заглавные на прописные и наоборот");
        System.out.println(methods.capitalReverse("QwertY"));
    }

    public static void showFourthFileResult(){
        PracticeTask.start();
    }
}
