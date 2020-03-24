package Structures.Stack

import Structures.List.{EmptyList, List}
import Structures.List.LinkedList

class LinkedStack[Element](value: Element, next: Stack[Element]) extends Stack[Element] {

  override def isEmpty: Boolean = false

  override def push(element: Element): Stack[Element] = new LinkedStack(element, tail.push(top))

  override def pop(): Stack[Element] = tail.copy

  override def top: Element = value

  override def tail: Stack[Element] = next

  override def map[OtherElement](transform: Element => OtherElement): Stack[OtherElement] = new LinkedStack[OtherElement](transform(top),tail.map(transform))

  override def flatMap[OtherElement](transform: Element => Stack[OtherElement]): Stack[OtherElement] = transform(top) ++ tail.flatMap(transform)

  override def filter(query: Element => Boolean): Stack[Element] = {
    if(query(top)) {
      new LinkedStack(top,tail.filter(query))
    } else {
      tail.filter(query)
    }
  }

  override def print: Unit = {
    println(top)
    tail.print
  }

  override def copy: Stack[Element] = new LinkedStack(top, tail.copy)

  override def toList: List[Element] = new LinkedList[Element](top, tail.toList)

  override def ++(stack: Stack[Element]): Stack[Element] = new LinkedStack(top, tail ++ stack)
}

