package Ch2.Ex_2_5_3

import Ch2.Ex_2_5_3.models.Order
import cats.kernel.Semigroup

object Ex_2_5_3_Main extends App {

  val r = scala.util.Random

  import cats.Monoid
  import cats.instances.int._ // for Monoid
  import cats.instances.option._ // for Monoid

  val items = List.fill(5)(r.nextInt(10))
  println(s"Items: ${items.mkString(",")}")
  val result = SuperAdder.add(items)
  println(s"Ints Result = ${result}")
  println(s"Option result = ${SuperAdder.add(items.map(Some(_)):+None)}")

  implicit val orderMonoid: Monoid[Order] =  new Monoid[Order] {
    def combine(order1:Order, order2:Order): Order = {
      Order(order1.totalCost + order2.totalCost, order1.quantity + order2.quantity)
    }

    def empty = Order(0.0, 0.0)
  }

  val twoOrders = List.fill(2)(Order(r.nextInt(10).toDouble, (r.nextInt(5) + "." + r.nextInt(5)).toDouble ))
  val finalOrder = SuperAdder.add(twoOrders)
  println(s"Two orders: ${twoOrders} become one: ${finalOrder}")



}
