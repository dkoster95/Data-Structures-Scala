package Structures.List

class EmptyList[Element] extends List[Element] {
  override def isEmpty: Boolean = true

  override def count: Int = 0

  override def append(element: Element): List[Element] = new LinkedList[Element](element, new EmptyList())

  override def push(element: Element): List[Element] = new LinkedList[Element](element, new EmptyList())

  override def head: Element = ???

  override def tail: List[Element] = ???

  override def print: Unit = ()

  override def forEach(function: Element => Unit): Unit = ()

  override def filter(query: Element => Boolean): List[Element] = new EmptyList()

  override def sort(compare: (Element, Element) => Int): List[Element] = new EmptyList()

  override def map[B](transform: Element => B): List[B] = new EmptyList[B]()

  override def flatMap[B](transform: Element => List[B]): List[B] = new EmptyList[B]()

  override def ++[B >: Element](list: List[B]): List[B] = list

  override def first(where: Element => Boolean): Element = ???

  override def contains(element: Element): Boolean = false

  override def zipWith[B, C](list: List[B], transform: (Element, B) => C): List[C] = new EmptyList[C]()

  override def fold[B](startValue: B)(operator: (B, Element) => B): B = startValue
}
