package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class SquareRootTest extends AnyFunSuite{

  test("Square Root Test"){

    val instanceOfSquareRoot = new SquareRoot
    val list = List(4.0,16.0,25.0,36.0,49.0,64.0)
    val actualResult = instanceOfSquareRoot.getSquareRoot(list)
    val ExpectedResult =List(2.0, 4.0, 5.0, 6.0, 7.0, 8.0)
    assert(actualResult===ExpectedResult)
  }

  test("Square Root Test for Empty List") {

    val instanceOfSquareRoot = new SquareRoot
    val list = List()
    val actualResult = instanceOfSquareRoot.getSquareRoot(list)
    val ExpectedResult = List()
    assert(actualResult === ExpectedResult)
  }

}
