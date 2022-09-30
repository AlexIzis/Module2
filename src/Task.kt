import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Task {
    //Пункт 2
    enum class Type {
        DEMO, FULL
    }

    //Пункт 3
    data class User(var id: Int, var name: String, var age: Int, var type: Type) {
        val startTime: String by lazy {
            LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("hh:mm:ss"))
        }
    }

    //Пункт 8
    fun User.isLarge() {
        if (this.age >= 18) {
            println(this.name)
        } else {
            throw Exception("Младше 18")
        }
    }

    val anonymous = object : AuthCallback {
        override fun authSuccess() {
            println("Авторизация пройдена")
        }

        override fun authFailed() {
            println("Авторизация не пройдена")
        }

    }

    //Пункт 12
    sealed class Action
    class Registration : Action()
    class Login(val user: User) : Action()
    class Logout : Action()

    //Пункт 13
    fun doAction(action: Action) {
        when (action) {
            is Login -> auth(action.user, anonymous) { updateCache() }
            is Registration -> println("Registration started")
            is Logout -> println("Logout started")
        }
    }

    //Пункт 9
    interface AuthCallback {
        fun authSuccess()
        fun authFailed()
    }

    fun updateCache() {
        println("Кэш обновлен")
    }

    //Пункт 10-11
    inline fun auth(user: User, callback: AuthCallback, updateCache: () -> Unit) {
        if (user.age >= 18) {
            callback.authSuccess()
            updateCache()
        } else {
            callback.authFailed()
        }
    }

    fun start() {
        //Пункт 4
        val user1 = User(1, "alex", 21, Type.FULL)
        println(user1.startTime)
        Thread.sleep(1000)
        println(user1.startTime)

        //Пункт 5
        val userList = mutableListOf<User>()
        userList.add(User(2, "pavel", 20, Type.FULL))
        userList.apply {
            this.add(User(3, "oleg", 18, Type.DEMO))
            this.add(User(4, "maxim", 20, Type.DEMO))
            this.add(User(5, "david", 20, Type.FULL))
        }
        //Пункт 6
        val fullUserList = userList.filter { it.type == Type.FULL }
        for (user in fullUserList) {
            println(user.name)
        }
        //Пункт 7
        val userNameList = userList.map{ it.name }
        println(userNameList.firstOrNull())
        println(userNameList.lastOrNull())
    }
}


