import shapeless._
import shapeless.Generic

object Example extends App {

  val hlist = 1 :: "one" :: true :: HNil

  println("My first HList: " + hlist)

  sealed trait Shape
  final case class Rectangle(width: Double, height: Double) extends Shape
  final case class Circle(radius: Double) extends Shape

  val gen = Generic[Shape]

  println(gen.to(Rectangle(3D, 3D)))

  println(gen.to(Circle(1.0)))
}
