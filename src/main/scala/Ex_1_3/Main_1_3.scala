package Ex_1_3

object Main_1_3 extends App {

  case class Cat(name: String, age: Int, color: String)

  import PrintableInstances._

  object Cat {

    implicit val printableCat: Printable[Cat] = new Printable[Cat] {
      def format(cat:Cat) = {
        val catName = Printable.format(cat.name)
        val catAge = Printable.format(cat.age)
        val catColor = Printable.format(cat.color)
        s"$catName is a $catAge year-old $catColor cat."
      }
    }

  }


  val cat:Cat = Cat("Magoo", 21, "white with black spots")

  Printable.print(cat)

}
