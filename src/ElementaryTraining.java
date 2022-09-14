/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        return (double) (firstValue + secondValue) / 2;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        firstValue *= 2;
        secondValue -= 3;
        thirdValue *= thirdValue;
        return firstValue + secondValue + thirdValue;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        if(value > 3){
            value += 10;
        } else {
            value -= 10;
        }
        return value;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    public int swapNumbers(int value) {
        if (value < 10){
            return value;
        } else {
            String st = String.valueOf(value);
            char[] chars = st.toCharArray();
            char tmp = chars[0];
            chars[0] = chars[st.length() - 1];
            chars[st.length() - 1] = tmp;
            value = Integer.parseInt(String.valueOf(chars));
        }
        return value;
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */
    public int zeroEvenNumber(int value) {
        if (value < 10){
            return value;
        } else {
            String st = String.valueOf(value);
            char[] chars = st.toCharArray();
            for (int i = 0; i < chars.length; i++){
                int y = Character.getNumericValue(chars[i]);
                if(y%2 == 0) {
                    chars[i] = '0';
                }
            }
            value = Integer.parseInt(String.valueOf(chars));
        }
        return value;
    }
}
