package Ch1.Ex_1_3

// this is the "Type Class" itself
trait Printable[A] {
  def format(value:A):String
}

//this is the "Interface Object" - useful for when calling Printable(input) -
//but if you'd rather do input.print - you need to use 'interface syntax'
object Printable {

  //could put instances in here as well

  def format[A](input: A)(implicit p: Printable[A]): String =
    p.format(input)

  def print[A](input: A)(implicit p: Printable[A]): Unit =
    println(format(input))
}
