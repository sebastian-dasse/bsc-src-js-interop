package base.webapp

import scala.scalajs.js.annotation.{JSExportAll, JSExportNamed, JSExport}

@JSExport
class FooClass {
  @JSExport
  def sayHello(arg: String): String =
    s"Hello from Scala.js!  -  You passed an argument: $arg"
  def notExported() = ()
}

@JSExport
object FooObject {
  @JSExport
  def sayHello(arg: String): String =
    s"Hello from Scala.js!  -  You passed an argument: $arg"
  def alsoNotExported() = ()
}

@JSExport("MyFoo")
object FooObject2 {
  @JSExport("sayHelloMyWay")
  def sayHello(arg: String): String =
    s"Hello from Scala.js!  -  You passed an argument: $arg"
  def notAtAllExported() = ()

  @JSExportNamed
  def foo(x: Int = 123, y: Int = 456, z: String = "ping"): Unit =
    println(s"x: $x, y: $y, z: $z")
}
