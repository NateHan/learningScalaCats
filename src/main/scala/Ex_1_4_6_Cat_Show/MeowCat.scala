package Ex_1_4_6_Cat_Show

import cats.Show
import cats.instances.int._ // for Show
import cats.instances.string._ // for Show
import cats.syntax.show._ // for show

final case class MeowCat(name: String, age: Int, color: String)

object MeowCat {

  implicit val catShow = Show.show[MeowCat] { cat =>
    val mcname = cat.name.show
    val mcage = cat.age.show
    val mccolor = cat.color.show
    s"$mcname is a $mcage year-old $mccolor cat."
  }
}

