package Structures.Queue
import Structures.List.List
import Structures.List.LinkedList

class LinkedQueue[Element](element: Element, queue: Queue[Element]) extends Queue[Element] {
  override def isEmpty: Boolean = false

  override def copy: Queue[Element] = new LinkedQueue(head, tail.copy)

  override def head: Element = element

  override def enqueue(element: Element): Queue[Element] = new LinkedQueue(head, tail.enqueue(element))

  override def dequeue(): Queue[Element] = tail.copy

  override def ++(queue: Queue[Element]): Queue[Element] = new LinkedQueue(head, tail ++ queue)

  override def tail: Queue[Element] = queue

  override def map[OtherElement](transform: Element => OtherElement): Queue[OtherElement] = new LinkedQueue[OtherElement](transform(head),tail.map(transform))

  override def flatMap[OtherElement](transform: Element => Queue[OtherElement]): Queue[OtherElement] = transform(head) ++ tail.flatMap(transform)

  override def filter(query: Element => Boolean): Queue[Element] = {
    if(query(head)) {
      new LinkedQueue(head,tail.filter(query))
    } else {
      tail.filter(query)
    }
  }

  override def print: Unit = {
    println(head)
    tail.print
  }

  override def toList: List[Element] = new LinkedList[Element](head,tail.toList)
}
