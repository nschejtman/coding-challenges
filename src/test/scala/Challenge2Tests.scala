import challenges.challenge_2.Solution
import org.scalatest.FunSuite

class Challenge2Tests extends FunSuite {
  test("Case 0") {
    assert(Solution.permutations(4, Set(1, 2)) == 5)
  }

}
