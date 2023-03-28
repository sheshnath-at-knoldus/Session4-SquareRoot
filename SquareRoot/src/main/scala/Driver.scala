package com.knoldus

object Driver extends App{

  val instanceOfSquareRoot = new SquareRoot
  val list = List(4.0,16.0,25.0,64.0)
  private val result = instanceOfSquareRoot.getSquareRoot(list)
  print(result)

}
