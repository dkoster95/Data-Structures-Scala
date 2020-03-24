package Structures.Queue
import Structures.List
import Structures.List.EmptyList

class EmptyQueue[Element] extends Queue[Element] {
  override def isEmpty: Boolean = true

  override def copy: Queue[Element] = new EmptyQueue

  override def head: Element = ???

  override def enqueue(element: Element): Queue[Element] = new LinkedQueue[Element](element,new EmptyQueue)

  override def dequeue(): Queue[Element] = ???

  override def ++(queue: Queue[Element]): Queue[Element] = queue

  override def tail: Queue[Element] = ???

  override def map[OtherElement](transform: Element => OtherElement): Queue[OtherElement] = new EmptyQueue[OtherElement]

  override def flatMap[OtherElement](transform: Element => Queue[OtherElement]): Queue[OtherElement] = new EmptyQueue[OtherElement]

  override def filter(query: Element => Boolean): Queue[Element] = new EmptyQueue

  override def print: Unit = ()

  override def toList: List.List[Element] = new EmptyList
}
