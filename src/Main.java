import SecondTask.CollectionsBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        showSecondJavaTask();
    }

    public static void showFistJavaTask() {
        ShowFistTask.showFirstFileResult();
        ShowFistTask.showSecondFileResult();

    }

    public static void showSecondJavaTask() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));

        CollectionsBlock<Integer> methods = new CollectionsBlock<>();
        System.out.println(methods.collectionTask0(list1, list2));
        System.out.println(methods.collectionTask1(list3));
        System.out.println(methods.collectionTask2(list1, list2));
        System.out.println(methods.collectionTask3(list2, 2));
    }

}
