package challenges.challenge_0

import scala.collection.mutable

object Solution {
  def containsAddends(numbers: Seq[Int], k: Int): Boolean = {
    val encountered = mutable.HashSet.empty[Int]
    numbers.foreach { number =>
      if (encountered(k - number)) {
        return true
      } else {
        encountered += number
      }

    }
    false
  }

}
