package com.hacker.tests

import com.hacker.Funs
import org.scalatest.FunSuite

class FunsSpec extends FunSuite {

    test("when N = 9 returns 2") {
      assert(Funs.binaryGraph(9) == 2)
    }

    test("when N = 1041 returns 5") {
      assert(Funs.binaryGraph(1041) == 5)
    }

    test("when N = 529 returns 4") {
      assert(Funs.binaryGraph(529) == 4)
    }

    test("when N = 15 return 0"){
      assert(Funs.binaryGraph(15) == 0)
    }

    test("when N = 32 return 0"){
      assert(Funs.binaryGraph(32) == 0)
    }

    test("when 4329 return 4"){
      assert(Funs.binaryGraph(4329) == 4)
    }

    test("when 12833 return 4") {
      assert(Funs.binaryGraph(12833) == 4)
    }

    test("when 51712 returns 2"){
      assert(Funs.binaryGraph(51712) == 2)
    }
}
