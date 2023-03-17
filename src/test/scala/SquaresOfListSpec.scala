import org.scalatest.funsuite.AnyFunSuite

class SquaresOfListSpec extends AnyFunSuite {

  test("Test for Square of list using pattren matching ") {
    val inputList = List(5, 2, 3, 4,7)
    assert(squaresOfListElements.squareListByPatternMatching(inputList) == List(25, 4, 9, 16,49))
  }

  test("Test forSquare of list using map(higher order function") {
    val inputList = List(4, 2, 3, 8)
    assert(squaresOfListElements.squareListBymap(inputList) == List(16, 4, 9, 64))
  }

  test("Test for Square of list of negative integers using pattern matching ") {
    val inputList = List(-1, -2, -3, -4)
    assert(squaresOfListElements.squareListByPatternMatching(inputList) == List(1, 4, 9, 16))
  }

  test("Test for Square of list of 0 using map (higher order function ") {
    val inputList = List(0,0,0)
    assert(squaresOfListElements.squareListBymap(inputList) == List(0, 0, 0))
  }
}
