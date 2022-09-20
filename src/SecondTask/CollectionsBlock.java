package SecondTask;

import java.util.*;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see CollectionsBlockTest.
 */
public class CollectionsBlock<T extends Comparable> {

    /**
     * Даны два упорядоченных по убыванию списка.
     * Объедините их в новый упорядоченный по убыванию список.
     * Исходные данные не проверяются на упорядоченность в рамках данного задания
     *
     * @param firstList  первый упорядоченный по убыванию список
     * @param secondList второй упорядоченный по убыванию список
     * @return объединенный упорядоченный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask0(List<T> firstList, List<T> secondList) {
        if ((firstList == null) || (secondList == null)) {
            throw new NullPointerException("One of the parameters is null");
        }
        firstList.addAll(secondList);
        return firstList;
    }

    /**
     * Дан список. После каждого элемента добавьте предшествующую ему часть списка.
     *
     * @param inputList с исходными данными
     * @return измененный список
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask1(List<T> inputList) {
        if (inputList == null) {
            throw new NullPointerException("One of the parameters is null");
        }
        ArrayList<T> tmpList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            tmpList.add(inputList.get(i));
            for (int j = 0; j <= i; j++) {
                tmpList.add(inputList.get(j));
            }
        }
        return tmpList;
    }

    /**
     * Даны два списка. Определите, совпадают ли множества их элементов.
     *
     * @param firstList  первый список элементов
     * @param secondList второй список элементов
     * @return <tt>true</tt> если множества списков совпадают
     * @throws NullPointerException если один из параметров null
     */
    public boolean collectionTask2(List<T> firstList, List<T> secondList) {
        if ((firstList == null) || (secondList == null)) {
            throw new NullPointerException("One of the parameters is null");
        }
        HashSet<T> set1 = new HashSet<>(firstList);
        HashSet<T> set2 = new HashSet<>(secondList);
        return set1.equals(set2);
    }

    /**
     * Создать список из заданного количества элементов.
     * Выполнить циклический сдвиг этого списка на N элементов вправо или влево.
     * Если N > 0 циклический сдвиг вправо.
     * Если N < 0 циклический сдвиг влево.
     *
     * @param inputList список, для которого выполняется циклический сдвиг влево
     * @param n         количество шагов циклического сдвига N
     * @return список inputList после циклического сдвига
     * @throws NullPointerException если один из параметров null
     */
    public List<T> collectionTask3(List<T> inputList, int n) {
        if ((inputList == null) || (n == 0)) {
            throw new NullPointerException("One of the parameters is null");
        }
        if (n < 0) {
            n *= -1;
            for (int i = 0; i < n; i++) {
                T tmp = inputList.get(0);
                inputList.add(tmp);
                inputList.remove(0);
            }
        } else {
            for (int i = 0; i < n; i++) {
                T tmp = inputList.get(inputList.size() - 1);
                inputList.add(0, tmp);
                inputList.remove(inputList.size() - 1);
            }
        }
        return inputList;
    }

    /**
     * Элементы списка хранят слова предложения.
     * Замените каждое вхождение слова A на B.
     *
     * @param inputList список со словами предложения и пробелами для разделения слов
     * @param a         слово, которое нужно заменить
     * @param b         слово, на которое нужно заменить
     * @return список после замены каждого вхождения слова A на слово В
     * @throws NullPointerException если один из параметров null
     */
    public List<String> collectionTask4(List<String> inputList, String a, String b) {
        //TODO: implement it
        return Collections.emptyList();
    }

    /*
      Задание подразумевает создание класса(ов) для выполнения задачи.

      Дан список студентов. Элемент списка содержит фамилию, имя, отчество, год рождения,
      курс, номер группы, оценки по пяти предметам. Заполните список и выполните задание.
      Упорядочите студентов по курсу, причем студенты одного курса располагались
      в алфавитном порядке. Найдите средний балл каждой группы по каждому предмету.
      Определите самого старшего студента и самого младшего студентов.
      Для каждой группы найдите лучшего с точки зрения успеваемости студента.
     */
}
