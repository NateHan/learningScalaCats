package Ch2.Ex_2_5_3

import cats.Monoid
import cats.syntax.semigroup._ // for |+|


object SuperAdder {

/*
  def add(items:List[Int]): Int = items.foldLeft(0)(_ |+| _)

  def addOptions(maybeItems:List[Option[Int]]): Option[Int] = {
    maybeItems.foldLeft(Monoid[Option[Int]].empty)(Monoid[Option[Int]].combine(_, _))
  }

 */

  def add[A: Monoid](items: List[A]): A = items.foldLeft(Monoid[A].empty)(_ |+| _)


}
