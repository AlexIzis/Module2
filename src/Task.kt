import org.jetbrains.annotations.NotNull

class Task {
    interface Publication {
        var price: Int
        var wordCount: Int
        fun getType(): String
    }

    class Book(override var price: Int, override var wordCount: Int) : Publication {
        override fun getType(): String {
            val returnString: String
            if (wordCount < 1000) {
                returnString = "Flash Fiction"
            } else if (wordCount < 7500) {
                returnString = "Short Story"
            } else {
                returnString = "Novel"
            }
            return returnString
        }

        override fun equals(other: Any?): Boolean {
            if (this === other){
                return true
            }
            return false
        }
    }

    class Magazine(override var price: Int, override var wordCount: Int): Publication{
        override fun getType(): String {
            return "Magazine"
        }

    }

    companion object {
        private fun buy(p: Publication){
            println("The purchase is complete. The purchase amount was ${p.price}")
        }

        fun start() {
            /* Два объекта класса Book */
            val book1 = Book(800, 2000)
            val book2 = Book(1200, 8000)
            /* Объект класса Magazine */
            val magazine = Magazine(100, 1000)

            /* Вывод информации об объектах */
            println("Тип ${book1.getType()} Цена: ${book1.price} Количество слов: ${book1.wordCount}")
            println("Тип ${book2.getType()} Цена: ${book2.price} Количество слов: ${book2.wordCount}")
            println("Тип ${magazine.getType()} Цена: ${magazine.price} Количество слов: ${magazine.wordCount}")

            println(book1 == book2) /* Сравнение через переопределённый equals */
            println(book1 === book2) /* Сравнение по ссылке */

            /* Две переменные класса Book, которые могут содержать null */
            val val1: Book? = book1
            val val2: Book? = null /* Одна содержит */

            /* Вызов метода buy с каждой из переменных */
            if (val1 != null) {
                buy(val1) /* Информация будет выведена */
            }
            if (val2 != null) {
                buy(val2) /* Проверку не пройдёт */
            }

            /* Лямбда выражение */
            val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
            println(sum(1, 2)) /* Вызов лямбды */
        }
    }
}