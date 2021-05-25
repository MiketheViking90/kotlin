package kotlininaction.ch2

class Person (val name: String, var isMarried: Boolean)


class Rectangle (val height: Int, val width: Int) {
    fun isSquare(): Boolean {
        return height == width
    }
}


enum class Color (val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), YELLOW(255, 255, 0), BLUE(0, 0, 255);

    fun rgb(): Int {
        return (r * 256 + g) + b
    }
}

fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> "R"
        Color.YELLOW -> "Y"
        Color.BLUE -> "B"
    }
}


fun main() {
    val mn1 = getMnemonic(Color.RED)
    println(mn1)
}