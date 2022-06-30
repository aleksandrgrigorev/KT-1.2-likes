fun main() {
    println("Введите число:")
    val likes = readln()
    val people = if (likes.endsWith("1")) " человеку" else " людям"
    print("Понравилось $likes$people")
}