package kotlininaction.ch3

val set = setOf(1, 7, 53)
val list = listOf(1, 7, 53)
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list.maxOrNull())
    println(list.last())
}