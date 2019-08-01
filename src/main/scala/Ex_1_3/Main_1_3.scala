package Ex_1_3

object Main_1_3 extends App {

  val cat:Cat = Cat("Magoo", 21, "white with black spotted")

  import PrintableSyntax._

  Printable.print(cat)
  cat.print // alternative way of doing the above

  Cat("Hazlenut", 16, "brown and black spotted").print


  println("Done.")

}
