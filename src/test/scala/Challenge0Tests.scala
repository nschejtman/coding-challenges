import challenges.challenge_0.Solution
import org.scalatest._


class Challenge0Tests extends FunSuite {

  test("Case 0") {
    val numbers = List(10, 15, 3, 7)
    val k = 17
    assert(Solution.containsAddends(numbers, k))
  }

  test("Case 1") {
    val numbers = List(10, 15, 3, 7)
    val k = 100000
    assert(!Solution.containsAddends(numbers, k))
  }

  test("Case 2") {
    val numbers = List(-10, 15, 3, -7)
    val k = -17
    assert(Solution.containsAddends(numbers, k))
  }

  test("Case 3") {
    val numbers = List(-10, 15, 3, 7)
    val k = -17
    assert(!Solution.containsAddends(numbers, k))
  }

}
