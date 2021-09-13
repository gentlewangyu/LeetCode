package api.scala.deepsearch

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
   var value: Int = _value
   var left: TreeNode = _left
   var right: TreeNode = _right
}

object SearchTree {
  def main(args: Array[String]): Unit = {
    val tree1 = new TreeNode(1, null, null)
    val tree2 = new TreeNode(3, null, null)
    val tree = new TreeNode(2, tree1, tree2)
    val result = isValidBST(tree)
    println(result)
  }

  def isValidBST(root: TreeNode): Boolean = {
     isValidBST1(root)
  }

  def isValidBST1(node: TreeNode, leftValue: Long = Long.MinValue, rightValue: Long = Long.MaxValue): Boolean = {
     if (node == null) return true
     if (node.value < leftValue || node.value > rightValue) return false
     isValidBST1(node.left, leftValue, node.value) && isValidBST1(node.right, node.value, rightValue)
  }
}
