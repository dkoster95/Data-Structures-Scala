package Structures.List

class LinkedList[Element](element: Element, next: List[Element]) extends List[Element] {
  override def isEmpty: Boolean = false

  override def count: Int = 1 + tail.count

  override def append(element: Element): List[Element] = new LinkedList(head,tail.append(element))

  override def push(element: Element): List[Element] = new LinkedList(element,tail.push(this.element))

  override def head: Element = element

  override def tail: List[Element] = next

  override def print: Unit = {
    println(head)
    tail.print
  }

  override def forEach(function: Element => Unit): Unit = {
    function(head)
    tail.forEach(function)
  }

  override def filter(query: Element => Boolean): List[Element] = {
    if(query(head)) {
      new LinkedList(head,tail.filter(query))
    } else {
      tail.filter(query)
    }
  }

  override def sort(compare: (Element, Element) => Int): List[Element] = {
    def insertOrdered(element: Element, list: List[Element]): List[Element] = {
      if (list.isEmpty) {
        new LinkedList(element,new EmptyList)
      } else {
        if(compare(element,list.head) <= 0) {
          new LinkedList(element,insertOrdered(list.head,list.tail))
        } else {
          new LinkedList(list.head,insertOrdered(element,list.tail))
        }
      }
    }
    val orderedlist = tail.sort(compare)
    insertOrdered(element,orderedlist)
  }

  override def map[B](transform: Element => B): List[B] = new LinkedList[B](transform(head),tail.map(transform))

  override def flatMap[B](transform: Element => List[B]): List[B] = transform(head) ++ tail.flatMap(transform)

  override def ++[B >: Element](list: List[B]): List[B] = {
    new LinkedList[B](head,tail++(list))
  }

  override def first(where: Element => Boolean): Element = if (where(head)) { head } else { tail.first(where) }

  override def contains(element: Element): Boolean = if(element == head) { true } else { tail.contains(element) }

  override def zipWith[B, C](list: List[B], transform: (Element, B) => C): List[C] = {
    if (count == list.count) {
      new LinkedList[C](transform(head,list.head),tail.zipWith(list.tail,transform))
    } else {
      new EmptyList[C]
    }
  }

  override def fold[B](startValue: B)(operator: (B, Element) => B): B = ???
}
