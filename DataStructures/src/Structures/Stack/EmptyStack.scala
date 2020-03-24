package Structures.Stack

import Structures.List.{EmptyList, List}
import Structures.List.EmptyList

class EmptyStack[Element] extends Stack[Element] {

  override def copy: Stack[Element] = new EmptyStack

  override def isEmpty: Boolean = true

  override def push(element: Element): Stack[Element] = new LinkedStack[Element](element, new EmptyStack)

  override def pop(): Stack[Element] = new EmptyStack

  override def top: Element = ???

  override def tail: Stack[Element] = ???

  override def map[OtherElement](transform: Element => OtherElement): Stack[OtherElement] = new EmptyStack

  override def flatMap[OtherElement](transform: Element => Stack[OtherElement]): Stack[OtherElement] = new EmptyStack

  override def filter(query: Element => Boolean): Stack[Element] = new EmptyStack

  override def print: Unit = ()

  override def toList: List[Element] = new EmptyList[Element]

  override def ++(stack: Stack[Element]): Stack[Element] = stack
}
