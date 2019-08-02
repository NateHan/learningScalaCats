package Ch3_Functors

object Examples extends App {

  val func = {
    ((x: Int) => x.toDouble)
      .map(x => x + 1)
      .map(x => x * 2)
      .map(x => x + "!")
  }

  println(s"The result is: ${func(123)}")
  // res10: String = 248.0!

}
