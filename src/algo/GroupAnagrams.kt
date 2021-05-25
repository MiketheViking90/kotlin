package algo

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val keyToAnagrams = HashMap<String, ArrayList<String>>()

        for (str in strs) {
            val key = getKey(str)
            val curAnagrams = keyToAnagrams.getOrDefault(key, ArrayList())
            curAnagrams.add(str)
            keyToAnagrams[key] = curAnagrams
        }

        return keyToAnagrams.values.toList()
    }

    private fun getKey(str: String): String {
        val charArray = str.toCharArray()
        charArray.sort()
        return charArray.joinToString()
    }
}

fun main() {
    val strs = arrayOf("eat","tea","tan","ate","nat","bat")
    val grams = GroupAnagrams().groupAnagrams(strs)
    println(grams)
}