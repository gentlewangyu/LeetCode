package api.scala.string

object MaxSubString {
   def main(args: Array[String]): Unit = {
      val s = "jbpnbwwd"
      val maxSubString = lengthOfLongestSubString(s)
      println("method lengthOfLongestSubString: " + maxSubString
        + ", 时间复杂度o(n2),空间复杂度o(n)")
   }

   def lengthOfLongestSubString(s: String): Int = {
      val length = s.length
      val charSet = scala.collection.mutable.Set[Char]()
      var maxLength = 0;
      for (i <- 0 until length) {
        for (j <- i until length) {
           if (!charSet.contains(s.charAt(j))) {
              charSet.add(s.charAt(j))
              maxLength = Math.max(maxLength, charSet.size)
           } else {
              charSet.clear()
           }
        }
        charSet.clear()
      }
      maxLength
   }
}
