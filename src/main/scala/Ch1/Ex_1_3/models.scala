package Ch1.Ex_1_3

case class Cat(name: String, age: Int, color: String)

import Ch1.Ex_1_3.PrintableInstances._

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
