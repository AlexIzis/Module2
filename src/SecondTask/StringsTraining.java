package SecondTask;

import java.util.HashMap;
import java.util.Map;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     * (нумерация символов идет с нуля)
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuffer str = new StringBuffer();
        char[] c = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                str.append(c[i]);
            }
        }
        return str.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        int[] arr = new int[text.length()];
        char[] c = text.toCharArray();
        char findChar = c[text.length() - 1];
        for (int i = 0; i < text.length() - 1; i++) {
            if (c[i] == findChar) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] == 0) {
                        arr[j] = i;
                        break;
                    }
                }
            }
        }
        return arr;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] c = text.toCharArray();
        int countNumbers = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (c[i] == num[j]) {
                    countNumbers++;
                }
            }
        }
        return countNumbers;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цифры заменены словами
     */
    public String replaceAllNumbers(String text) {
        HashMap<Character, String> numberMap = new HashMap<>(Map.of('1', "one", '2', "two",
                '3', "three", '4', "four", '5', "five", '6', "six", '7', "seven",
                '8', "eight", '9', "nine", '0', "null"));
        StringBuilder str = new StringBuilder(text);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (numberMap.containsKey(c)) {
                str.deleteCharAt(i);
                str.insert(i, numberMap.get(c));
            }
        }
        return str.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuffer str = new StringBuffer(text);
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                char c1 = Character.toUpperCase(c);
                str.deleteCharAt(i);
                str.insert(i, c1);
            } else {
                char c1 = Character.toLowerCase(c);
                str.deleteCharAt(i);
                str.insert(i, c1);
            }
        }
        return str.toString();
    }

}
