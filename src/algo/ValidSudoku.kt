package algo

class ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val n = board.size

        val rowToElts = HashMap<Int, HashSet<Int>>()
        val colToElts = HashMap<Int, HashSet<Int>>()
        val boxToElts = HashMap<Int, HashSet<Int>>()

        for (i in 0 until n) {
            rowToElts[i] = HashSet()
            colToElts[i] = HashSet()
            boxToElts[i] = HashSet()
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                val c = board[i][j]
                if (Character.isDigit(c)) {
                    val gridVal = Character.getNumericValue(c)
                    val boxNo = i % 3 + 3 * (j % 3)

                    val rowElts = rowToElts[i]
                    if (rowElts == null || rowElts.contains(gridVal)) {
                        return false
                    }
                    rowElts.add(gridVal)

                    val colElts = colToElts[j]
                    if (colElts == null || colElts.contains(gridVal)) {
                        return false
                    }
                    colElts.add(gridVal)

                    val boxElts = boxToElts[boxNo]
                    if (boxElts == null || boxElts.contains(gridVal)) {
                        return false
                    }
                    boxElts.add(gridVal)
                }
            }
        }
        return true
    }
}

fun main() {
    for (i in 0 until 5) {
        println(i)
    }
}