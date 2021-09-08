package api.scala.dp

object Palind {
  def main(args: Array[String]): Unit = {
     val s = "babad"
     val result = longestPalindrome(s)
  }

  def longestPalindrome(s: String): String = {
      if (s == null || s.length < 2) {
        return s
      }
      var maxLength = 1
      var begin = 0
      var c = s.toCharArray

      s.substring(begin, begin + maxLength)
  }
}
