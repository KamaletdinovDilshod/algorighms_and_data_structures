/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val res: ListNode = new ListNode()
    rec(l1, l2, 0, res, null)
    res
  }
    def rec(l1: ListNode, l2: ListNode, diff: Int, traversable: ListNode, prev: ListNode): Unit =
      (l1, l2) match {
        case (l1, l2) if l1 == null && l2 == null => if ((prev.x == 0 && diff == 1) || diff == 1) prev.next = new ListNode(1);
        case (l1, _) if l1 == null                =>
          val sum = l2.x + diff
          traversable.x = sum % 10
          traversable.next = if (l2.next == null) null else new ListNode()
          rec(l1, l2.next, (l2.x + diff) / 10, traversable.next, traversable)

        case (l1, l2) if l2 == null =>
          val sum = l1.x + diff
          traversable.x = sum  % 10
          traversable.next = if (l1.next == null) null else new ListNode()
          rec(l1.next, l2, sum / 10, traversable.next, traversable)

        case (l1, l2) =>
          val sum = l1.x + l2.x + diff
          traversable.x = sum % 10
          traversable.next = if (l1.next == null && l2.next == null) null else new ListNode()
          rec(l1.next, l2.next, sum / 10, traversable.next, traversable)
      }
}