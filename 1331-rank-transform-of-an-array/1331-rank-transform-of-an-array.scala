import scala.annotation

object Solution {
  def arrayRankTransform(arr: Array[Int]): Array[Int] = {
      val rankMap = arr.distinct.sorted.zipWithIndex.toMap
      arr.map(rankMap).map(_ + 1)
  }
}