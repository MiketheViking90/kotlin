package algo

import ds.TreeNode
import java.util.*

class BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val levels = TreeMap<Int, ArrayList<Int>>()
        traverse(root, levels, 0)
        return ArrayList<List<Int>>(levels.values)
    }

    private fun traverse(root: TreeNode?, levels: TreeMap<Int, ArrayList<Int>>, i: Int) {
        if (root == null) {
            return
        }

        val level = levels.getOrDefault(i, ArrayList<Int>())
        level.add(root.`val`)
        levels.put(i, level)
        traverse(root.left, levels, i+1)
        traverse(root.right, levels, i+1)
    }
}