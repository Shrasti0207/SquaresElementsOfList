object squaresOfListElements extends App{
  def squareListByPatternMatching(inputList: List[Int]): List[Int] = {
    inputList match{
      case Nil => Nil
      case headElement :: tailElements => headElement * headElement :: squareListByPatternMatching(tailElements)
    }
  }
  def squareListBymap(inputList: List[Int]): List[Int] = {
    val newSquaredList = inputList map(element => element * element)
    newSquaredList
  }

}
