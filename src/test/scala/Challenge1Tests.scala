import challenges.challenge_1.Solution
import org.scalatest.FunSuite

class Challenge1Tests extends FunSuite {
  test("Case 0") {
    val input = List(2, 4, 6, 2, 5)
    val expected = 13
    assert(Solution.largestNonAdjacentSum(input) == expected)
  }

  test("Case 1") {
    val input = List(5, 1, 1, 5)
    val expected = 10
    assert(Solution.largestNonAdjacentSum(input) == expected)
  }

}
