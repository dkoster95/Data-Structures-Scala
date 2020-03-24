package Tests
import Structures.Stack
import Structures.Stack.{EmptyStack, LinkedStack}
object StackTests extends App {
  val stack = new LinkedStack[Int](2,new EmptyStack[Int])
  stack.push(3).print
}
