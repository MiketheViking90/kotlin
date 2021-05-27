package algo

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = LinkedList<Char>()

        for (c in s) {
            if (isOpen(c)) {
                stack.push(c)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val open = stack.pop().toChar()
                if (!isMatch(open, c)) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

    private fun isMatch(open: Char, close: Char): Boolean {
        when (open) {
            '(' -> return close == ')'
            '[' -> return close == ']'
            '{' -> return close == '}'
        }
        return false
    }

    private fun isOpen(c: Char): Boolean {
        return c == '(' || c == '[' || c == '{'
    }
}

fun main() {
    val valid = ValidParentheses().isValid("()")
    println(valid)
}