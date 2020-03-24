package Structures.Queue

import Structures.ListConvertibleStruct

trait Queue[Element] extends ListConvertibleStruct[Element] {
  def isEmpty: Boolean
  def copy: Queue[Element]
  def head: Element
  def enqueue(element: Element): Queue[Element]
  def dequeue(): Queue[Element]
  def ++(queue: Queue[Element]): Queue[Element]
  def tail: Queue[Element]

  def map[OtherElement](transform:(Element => OtherElement)): Queue[OtherElement]
  def flatMap[OtherElement](transform:(Element => Queue[OtherElement])): Queue[OtherElement]
  def filter(query:(Element => Boolean)): Queue[Element]
  def print: Unit
}
