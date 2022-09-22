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
        if ((inputList == null) || (a.isEmpty()) || (b.isEmpty())) {
            throw new NullPointerException("One of the parameters is null");
        }
        for (int i = 0; i < inputList.size(); i++) {
            if (Objects.equals(inputList.get(i), a)) {
                inputList.set(i, b);
            }
        }
        return inputList;
    }

    /*
      Задание подразумевает создание класса(ов) для выполнения задачи.

      Дан список студентов. Элемент списка содержит фамилию, имя, отчество, год рождения,
      курс, номер группы, оценки по пяти предметам. Заполните список и выполните задание.
      Упорядочите студентов по курсу, причем студенты одного курса располагались
      в алфавитном порядке.
      Найдите средний балл каждой группы по каждому предмету.
      Определите самого старшего студента и самого младшего студентов.
      Для каждой группы найдите лучшего с точки зрения успеваемости студента.
     */
    static class Student {
        String surname;
        String name;
        String patronymic;
        Integer yearOfBirth;
        Integer course;
        Integer numberOfGroup;
        ArrayList<Integer> evaluations;

        Student(String surname, String name, String patronymic, Integer yearOfBirth, Integer course,
                Integer numberOfGroup, ArrayList<Integer> evaluations) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
            this.yearOfBirth = yearOfBirth;
            this.course = course;
            this.numberOfGroup = numberOfGroup;
            this.evaluations = evaluations;
        }

        public String getSurname() {
            return surname;
        }

        public Integer getYearOfBirth() {
            return yearOfBirth;
        }

        public Integer getCourse() {
            return course;
        }

        public Integer getNumberOfGroup() {
            return numberOfGroup;
        }

        public ArrayList<Integer> getEvaluations() {
            return evaluations;
        }
    }

    static class StudentSurnameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

    static class StudentCourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse().compareTo(o2.getCourse());
        }
    }

    static class StudentAgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getYearOfBirth().compareTo(o2.getYearOfBirth());
        }
    }

    static class StudentGroupComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getNumberOfGroup().compareTo(o2.getNumberOfGroup());
        }
    }

    public ArrayList<ArrayList<Integer>> findStudents(ArrayList<Student> students, int cntG, int cntC) {
        ArrayList<ArrayList<Integer>> listOLists = new ArrayList<>();
        ArrayList<Integer> tmpMarks = new ArrayList<>();
        for (int i = 0; i < students.size() - 1; i++) {
            Student curSt = students.get(i);
            if ((curSt.numberOfGroup == cntG) && (curSt.course == cntC)) {
                tmpMarks.addAll(curSt.getEvaluations());
                listOLists.add(new ArrayList<>(tmpMarks));
                tmpMarks.clear();
            }
        }
        return listOLists;
    }

    public void collectionTask5() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иванов", "Иван", "Иванович", 2000, 4,
                1, new ArrayList<>(List.of(5, 5, 5, 5, 5))));
        studentList.add(new Student("Сидоров", "Иван", "Иванович", 1999, 4,
                1, new ArrayList<>(List.of(5, 4, 5, 4, 5))));
        studentList.add(new Student("Рыбкин", "Иван", "Иванович", 2000, 3,
                1, new ArrayList<>(List.of(5, 5, 4, 5, 5))));
        studentList.add(new Student("Мискин", "Иван", "Иванович", 2000, 3,
                1, new ArrayList<>(List.of(4, 5, 4, 5, 4))));
        studentList.add(new Student("Петров", "Иван", "Иванович", 2001, 4,
                2, new ArrayList<>(List.of(5, 4, 5, 5, 5))));
        studentList.add(new Student("Долгов", "Иван", "Иванович", 2000, 4,
                2, new ArrayList<>(List.of(4, 5, 5, 3, 5))));


        System.out.println("1");
        Comparator<Student> comp1 = new StudentCourseComparator().thenComparing(new StudentSurnameComparator());
        studentList.sort(comp1);
        for (Student s: studentList){
            System.out.println(s.getSurname() + " " + s.getCourse());
        }

        System.out.println("2");
        Comparator<Student> comp2 = new StudentCourseComparator().thenComparing(new StudentGroupComparator());
        studentList.sort(comp2);
        int cntS = 1;
        int cntG = 1;
        ArrayList<ArrayList<Integer>> marks = new ArrayList<>();
        for (int i = 1; i <= studentList.size() - 1; i++) {
            Student curS = studentList.get(i);
            Student prevS = studentList.get(i - 1);
            if ((curS.numberOfGroup == prevS.numberOfGroup) && (curS.course == prevS.course)) {
                ArrayList<Integer> oneStudentMarks = new ArrayList<>();
                for (int j = 0; j < 5; j++) {
                    oneStudentMarks.add((curS.evaluations.get(j) + prevS.evaluations.get(j)));
                }
                marks.add(new ArrayList<>(oneStudentMarks));
                oneStudentMarks.clear();
                cntS++;
            } else if ((curS.numberOfGroup != prevS.numberOfGroup) || (curS.course != prevS.course)) {
                ArrayList<Integer> oneStudentMarks = marks.get(cntG - 1);
                for (int j = 0; j <= oneStudentMarks.size() - 1; j++) {
                    oneStudentMarks.set(j, oneStudentMarks.get(j) / cntS);
                }
                marks.set(cntG - 1, oneStudentMarks);
                cntG++;
                cntS = 1;
            }
        }
        ArrayList<Integer> oneStudentMarks = marks.get(cntG - 1);
        for (int j = 0; j <= oneStudentMarks.size() - 1; j++) {
            oneStudentMarks.set(j, oneStudentMarks.get(j) / cntS);
        }
        for (ArrayList<Integer> l: marks){
            System.out.println(l.toString());
        }

        System.out.println("3");
        Comparator<Student> comp3 = new StudentAgeComparator();
        studentList.sort(comp3);
        Student st1 = studentList.get(0);
        Student st2 = studentList.get(studentList.size()-1);
        System.out.println(st1.getSurname() + " " + st1.getYearOfBirth());
        System.out.println(st2.getSurname() + " " + st2.getYearOfBirth());

        System.out.println("4");
        studentList.sort(comp2);
        cntS = 1;
        cntG = 1;
        oneStudentMarks = new ArrayList<Integer>(Collections.nCopies(studentList.size(), 0));
        for (int i = 1; i <= studentList.size() - 1; i++) {
            Student curS = studentList.get(i);
            Student prevS = studentList.get(i - 1);
            if ((curS.numberOfGroup == prevS.numberOfGroup) && (curS.course == prevS.course)) {
                for (int j = 0; j < 5; j++) {
                    oneStudentMarks.set(i, oneStudentMarks.get(i) + prevS.evaluations.get(j));
                    oneStudentMarks.set(i - 1, oneStudentMarks.get(i-1) + curS.evaluations.get(j));
                }
                cntS++;
            } else if ((curS.numberOfGroup != prevS.numberOfGroup) || (curS.course != prevS.course)) {
                int maxSurname = 0;
                int maxValue = 0;
                for (int j = 0; j < oneStudentMarks.size() -1; j++){
                    if (oneStudentMarks.get(j) > maxValue){
                        maxValue = oneStudentMarks.get(j);
                        maxSurname = j;
                    }
                }
                System.out.println(studentList.get(maxSurname).surname);
                oneStudentMarks = new ArrayList<Integer>(Collections.nCopies(studentList.size(), 0));
                cntG++;
                cntS = 1;
            }
        }
        int maxSurname = 0;
        int maxValue = 0;
        for (int j = 0; j < oneStudentMarks.size() -1; j++){
            if (oneStudentMarks.get(j) > maxValue){
                maxValue = oneStudentMarks.get(j);
                maxSurname = j;
            }
        }
        System.out.println(studentList.get(maxSurname).surname);
    }
}
