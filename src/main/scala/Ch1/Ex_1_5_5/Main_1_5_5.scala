package Ch1.Ex_1_5_5

import Ch1.Cat
import cats.Eq

object Main_1_5_5 extends App {

  import cats.instances.int._ // for Eq
  import cats.instances.string._
  import cats.instances.option._ // for Eq
  import cats.syntax.eq._ // for === and =!=

  implicit val catsEq: Eq[Cat] = {
    Eq.instance[Cat] { (cat1, cat2) =>
      (cat1.name === cat2.name) &&
        (cat1.age === cat2.age) &&
        (cat1.color === cat2.color)
    }
  }

  val cat1 = Cat("Garfield", 38, "orange and black")
  val cat2 = Cat("Heathcliff", 33, "orange and black")

  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  println(s"Cat1 equals cat2? ${cat1 === cat2}")
  println(s"optionCat1 equals optionCat1? ${optionCat1 === optionCat1}")
  println(s"optionCat1 equals optionCat2? ${optionCat1 === optionCat2}")
  println("Done!")


}
