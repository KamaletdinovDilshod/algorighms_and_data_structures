import scala.annotation

object Solution {
  def arrayRankTransform(arr: Array[Int]): Array[Int] = {
    if (arr.length == 0) return Array()
    
    val array2 = arr.sorted
    
    val map = rec(array2 = array2, rank = 1, prev = array2.head, map = Map.empty[Int, Int])

    for (i <- arr.indices)
      arr(i) = map(arr(i))

    arr
  }

  @annotation.tailrec
  def rec(array2: Array[Int], rank: Int, prev: Int, map: Map[Int, Int]): Map[Int, Int] = {
    if (array2.isEmpty) map
    else {
      val newRank = if (array2.head > prev) rank + 1 else rank
      rec(array2.tail, newRank, array2.head, map + (array2.head -> newRank))
    }
  }
}