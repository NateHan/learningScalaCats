package Ch2.Ex_2_5_3

object Ex_2_5_3_Main extends App {

  val r = scala.util.Random

  val items = List.fill(5)(r.nextInt(100))
  println(s"Items: ${items.mkString(",")}")
  val result = SuperAdder.add(items)
  println(s"Result = ${result}")



}
