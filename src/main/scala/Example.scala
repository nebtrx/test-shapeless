import shapeless._
import shapeless.Generic
import shapeless.labelled.{FieldType, KeyTag}
import shapeless.syntax.SingletonOps
import shapeless.syntax.singleton._

import shapeless.labelled.field

object Example extends App {

  val hlist = 1 :: "one" :: true :: HNil

  println("My first HList: " + hlist)

  sealed trait Shape
  final case class Rectangle(width: Double, height: Double) extends Shape
  final case class Circle(radius: Double) extends Shape

  val gen = Generic[Shape]

  println(gen.to(Rectangle(3D, 3D)))

  println(gen.to(Circle(1.0)))

  val aa: 42 = 42

  trait Cherries

  val numCherries2: Int with Cherries = 23.asInstanceOf[Int with Cherries]


  val someNumber = 123

  val numCherries: FieldType[SingletonOps#T, Int] = "numCherries" ->> someNumber

  val f: FieldType[Cherries, Int] = field[Cherries](234)

}
