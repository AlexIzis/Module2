import SecondTask.CollectionsBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class ShowSecondTask {
    public static void showFirstFileResult(){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<String> listWords = new ArrayList<>(Arrays.asList("One", "Two", "Three"));

        CollectionsBlock<Integer> methods = new CollectionsBlock<>();
//        System.out.println(methods.collectionTask0(list1, list2));
//        System.out.println(methods.collectionTask1(list3));
//        System.out.println(methods.collectionTask2(list1, list2));
//        System.out.println(methods.collectionTask3(list2, 2));
//        System.out.println(methods.collectionTask4(listWords, "Two", "Second"));
        methods.collectionTask5();
    }
}
