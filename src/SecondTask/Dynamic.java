package SecondTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

/* Решение задания II из ClassesBlock */
public class Dynamic {
    int length;
    ArrayList<Integer> array;

    public Dynamic(int length) {
        this.length = length;
        this.array = new ArrayList<>(length);
    }
    public void randomValues(){
        for (int i = 0; i < this.length; i++){
            this.array.add(5 + (int)(Math.random() * ((10 - 5) + 1)));
        }
    }

    public void randomIndex(){
        this.array.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return new Random().nextInt();
            }
        });
    }

    public void arrayToSet(){
        HashSet<Integer> set = new HashSet<>(this.array);
        System.out.println(set);
    }

    public void printArray(){
        System.out.println(this.array);
    }
}
