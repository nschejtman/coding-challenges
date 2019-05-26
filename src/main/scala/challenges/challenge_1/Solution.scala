package challenges.challenge_1

object Solution {
  def largestNonAdjacentSum(list: Seq[Int]): Int = {
    val nodes = list.map(Node(_, Nil))
    val lastIdx = nodes.size
    nodes.zipWithIndex.foreach { case (node, idx) =>
      node.nonNeighbors = nodes.slice(idx + 2, lastIdx)
    }
    nodes.map(calculateNode).max
  }

  def calculateNode(node: Node): Int = {
    if (node.nonNeighbors.nonEmpty) {
      node.value + node.nonNeighbors.map(calculateNode).max
    } else {
      node.value
    }
  }

  case class Node(value: Int, var nonNeighbors: Seq[Node])



}
