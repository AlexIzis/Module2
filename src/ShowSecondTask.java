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
        System.out.println(methods.collectionTask0(list1, list2));
        System.out.println(methods.collectionTask1(list3));
        System.out.println(methods.collectionTask2(list1, list2));
        System.out.println(methods.collectionTask3(list2, 2));
        System.out.println(methods.collectionTask4(listWords, "Two", "Second"));
        methods.collectionTask5();
    }

    public static void showSecondFileResult(){
        PracticeTask.start();
    }

    public static void showThirdFileResult(){
        StringsTraining methods = new StringsTraining();
        System.out.println(methods.getOddCharacterString("qwerty"));
        System.out.println(Arrays.toString(methods.getArrayLastSymbol("qwyrty")));
        System.out.println(methods.getNumbersCount("qw1er3ty5"));
        System.out.println(methods.replaceAllNumbers("q1w2e3"));
        System.out.println(methods.capitalReverse("QwertY"));
    }
}
