package kotlininaction.ch3

fun <T> Collection<T>.joinToString(
        collection: Collection<T>,
        sep: String = ", ",
        pre: String = "",
        post: String = ""
): String {
    val res = StringBuilder(pre)

    for ((idx, elt) in collection.withIndex()) {
        if (idx > 0) {
            res.append(sep)
        }
        res.append(elt)
    }

    res.append(post)
    return res.toString()
}

fun main() {
    val list = listOf(1,2,3)
    val list1 = listOf("a", "b", "c")
    val joined = list.joinToString(list, "; ", "(", ")")
    val joined1 = list.joinToString(list1, "; ", "(", ")")
    println(joined)
    println(joined1)
}