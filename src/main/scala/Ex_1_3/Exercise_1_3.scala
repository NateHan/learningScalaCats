trait Printable[A] {
  def format(value:A):String
}

object Printable {
  def format[A](value:A)(implicit p:Printable[A]): String = {
    p.format(value)
  }

  def print[A](value:A)(implicit p:Printable[A]): Unit = {
    println("Printable object printing: " + p.format(value))
  }
}

object PrintableInstances {

  implicit val printableString: Printable[String] = {
    new Printable[String] {
      def format(value:String) = value
    }
  }

  implicit val printableInt: Printable[Int] = {
    new Printable[Int] {
      def format(value:Int) = value.toString
    }
  }

}