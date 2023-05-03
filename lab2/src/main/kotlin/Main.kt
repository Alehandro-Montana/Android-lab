open class Animal(private var name: String, private var age: Int) {
    var weight: Double = 0.0

    private var isHungry = true
    // абстрактная функция
    abstract fun makeSound() {}
    //публичная функция
    fun eat(){
        isHungry = false
        println("$name is eating....")
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    //переопредел.функция
    override fun makeSound() {
        println("Woof!")
    }

    // доп.публичная функция
    fun fetch() {
        println("$name is fetching the ball!")
    }
}

class Bird(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        println("Chirp!")
    }
    var wingspan: Double = 0.0
    // доп.публичная функция
    fun fly() {
        println("$name is  flying!")
    }
}

class Fish(name: String, age: Int) : Animal(name, age) {
    override fun makeSound() {
        //рыбы не издают звуков
    }

    fun swim(){
        println("$name is swimming...")
    }
}

// Определение интерфейса с функцией
interface MakeNoise {
    fun makeNoise(volume: String)

}

// реализация интерфейса  в классе Dog
class LoudDog(name: String, age: Int) : Dog(name, age), MakeNoise {
    override fun makeNoise(volume: String) {
        println("$name is barking $volume!")
    }
}
//реализация интерфейса в классе Bird
class QuietBird(name: String, age: Int) : Bird(name, age), MakeNoise {
    override fun makeNoise(volume: String) {
        println("$name is chirping $volume...")
    }
}
// создаем объекты класса
fun main() {
    val dog = LoudDog("Sharik", 5)
    val bird = QuietBird("Richi", 2, )
    val fish = Fish("Goldie", 1, )


}
