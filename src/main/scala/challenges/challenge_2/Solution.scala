package challenges.challenge_2

import scala.collection.mutable

object Solution {
  def permutations(n: Int, steps: Set[Int]): Int = {
    var frontier = Seq(0)
    var counter = 0
    while (frontier.nonEmpty) {
      frontier = frontier.head match {
        case head if head < n =>
          frontier.tail ++ steps.map(_ + head).toSeq
        case head if head == n =>
          counter += 1
          frontier.tail
        case head if head > n =>
          frontier.tail
      }
    }
    counter
  }

  case class Node(accum: Int, parent: Node)

}
