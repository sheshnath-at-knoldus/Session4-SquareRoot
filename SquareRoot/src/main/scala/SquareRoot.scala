package com.knoldus
import scala.math.sqrt
import scala.util.{Failure, Success, Try}

//class Square Root
class SquareRoot {

  //method to get Square Root
  def getSquareRoot(listOfNumber :List[Double]):List[Double] = {
    Try {
      if (listOfNumber.isEmpty) throw new NullPointerException() //throw Null Pointer Exception
      val squareRootOfNumbers = listOfNumber.map(num => sqrt(num))
      squareRootOfNumbers
    }
    match {
      case Success(squareRootOfNumbers) => squareRootOfNumbers
      case Failure(exception) => List()
    }
  }

}
