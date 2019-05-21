object Runner {
  def main(args: Array[String]) = {
//    val below = 1000
//    val multiples = for {
//      x <- 1 to below - 1
//      if (x % 3 == 0 || x % 5 == 0)
//    } yield x
//    println( multiples.sum )

    var x = 0
    val maxValue = 20

    def devided(y: Int ): Boolean = {
      val s = for{
        z <- 1 to maxValue
        r = (y % z) == 0
      } yield r
      s.forall(_ == true)
    }

    do{
      x = x + maxValue
      println(x)
    } while(devided(x) == false)

    println(x)

  }
}