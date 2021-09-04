package api.scala.array

object Area {
  def main(args: Array[String]): Unit = {
    val height = Array(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val maxAreaValue = maxArea(height)
    println("method maxArea; maxArea: "
      + maxAreaValue + "; 时间复杂度o(n2),空间复杂度o(1)")
    val maxAreaValue2 = maxArea2(height)
    println("method maxArea2; maxArea: "
      + maxAreaValue2 + "; 时间复杂度o(n),空间复杂度o(1)")
  }

  def maxArea(height: Array[Int]): Int = {
     val length = height.length
     var maxArea = 0
     for (i <- 0 until length - 1) {
       for (j <- i + 1 until length) {
         maxArea = Math.max(maxArea,
           (j - i) * Math.min(height(i), height(j)))
       }
     }
    maxArea
  }

  def maxArea2(height: Array[Int]): Int = {
    val length = height.length
    var i = 0
    var j = length - 1
    var maxArea = 0
    while (i < j) {
      maxArea = Math.max(maxArea,
        (j - i) * Math.min(height(i), height(j)))
      if (height(i) < height(j)) {
        i = i + 1
      } else {
        j = j - 1
      }
    }
    maxArea
  }
}
