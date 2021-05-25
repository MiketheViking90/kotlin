package algo


class LetterCombosOfPhoneNumber {
    private val digitToLetters = mapOf(
            2 to arrayOf("a", "b", "c"),
            3 to arrayOf("d", "e", "f"),
            4 to arrayOf("g", "h", "i"),
            5 to arrayOf("j", "k", "l"),
            6 to arrayOf("m", "n", "o"),
            7 to arrayOf("p", "q", "r", "s"),
            8 to arrayOf("t", "u", "v"),
            9 to arrayOf("w", "x", "y", "z"),
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return ArrayList()
        }
        val combos = ArrayList<String>()
        dfs("", combos, digits, 0)
        return combos
    }

    private fun dfs(s: String, combos: ArrayList<String>, digits: String, i: Int) {
        if (i == digits.length) {
            combos.add(s)
            return
        }

        val digit = Character.getNumericValue(digits[i])
        val letters = digitToLetters[digit]
        if (letters != null) {
            for (letter in letters) {
                dfs(s+letter, combos, digits, i+1)
            }
        }
    }
}