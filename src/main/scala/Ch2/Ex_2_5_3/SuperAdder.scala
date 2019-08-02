package Ch2.Ex_2_5_3

import cats.Monoid
import cats.instances.int._ // for Monoid
import cats.syntax.semigroup._ // for |+|

object SuperAdder {

  def add(items:List[Int]): Int = items.foldLeft(0)(_ |+| _)

}
