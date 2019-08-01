package Ex_1_4_6_Cat_Show


object Main_1_4_6 extends App {

  import cats.Show
  import cats.instances.int._ // for Show
  import cats.instances.string._ // for Show
  import cats.syntax.show._ // for show

  final case class Cat(name: String, age: Int, color: String)

  object Cat {
    implicit val catShow = Show.show[Cat] { cat =>
      val name = cat.name.show
      val age = cat.age.show
      val color = cat.color.show
      s"$name is a $age year-old $color cat."
    }
  }

  val cat:Cat = Cat("Derby", 8, "orange tabby")
  val mc:MeowCat = MeowCat("Neffi", 11, "black")

  println("Here is show : " + cat.show)
  println("Here is show : " + mc.show)

  println("1.4.6 Done!")

}
