package base.webapp

import scala.scalajs.js
import scala.scalajs.js.JSApp
import org.scalajs.dom
import org.scalajs.jquery.jQuery
import scala.scalajs.js.annotation.JSName

//----------------------------------------------------------

class FooJSFunction extends js.Object {
  def sayHello(a: String): String = js.native
}

object FooJSObject extends js.Object {
  def sayHello(a: String): String = js.native
}

@JSName("FooJSObject")
object MyFooJSObject extends js.Object {
  @JSName("sayHello")
  def sayHelloMyWay(a: String): String = js.native
}
//----------------------------------------------------------

object BaseApp extends JSApp {
  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    val greeting1 = new FooJSFunction().sayHello("foo")
    val greeting2 = FooJSObject.sayHello("bar")
    val greeting3 = MyFooJSObject.sayHelloMyWay("baz")

    jQuery("""<button type="button">Trigger JS from SJS</button>""")
      .click(() => {
          println(greeting1)
          println(greeting2)
          println(greeting3)
        }
      ).appendTo(jQuery("body"))
  }
}
