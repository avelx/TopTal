package com.hacker

import scala.collection.mutable.ListBuffer

object Funs {

  def binaryGraph(n: Int): Int = {

    val values = ListBuffer[Int]()
    val binString : String = n.toBinaryString

    binString.foldLeft( 0 )( (acc, c) => {
      if (c == '0')
        acc + 1
      else {
        if (acc > 0) values.append(acc)
        0
      }
    })


//    println(s"$n " + values.mkString(" "))
    if (values.length == 0) 0 else values.max

  }

}
