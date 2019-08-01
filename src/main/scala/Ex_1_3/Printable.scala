package Ex_1_3
// this is the "Type Class" itself
trait Printable[A] {
  def format(value:A):String
}

//this is the "Interface Object"
object Printable {
  def format[A](input: A)(implicit p: Printable[A]): String =
    p.format(input)
  def print[A](input: A)(implicit p: Printable[A]): Unit =
    println(format(input))
}
