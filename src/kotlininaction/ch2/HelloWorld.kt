package kotlininaction.ch2

fun main() {
    println(max(3, 1))
}

fun max(a: Int, b: Int): Int {
    return if (a>b) a else b
}
