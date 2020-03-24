package Structures.List

// abstract class
trait List[Element] {
  def isEmpty: Boolean
  def count: Int
  def append(element: Element): List[Element]
  def push(element: Element): List[Element]
  def head: Element
  def tail: List[Element]
  def print: Unit
  def forEach(function: Element => Unit)
  def filter(query:(Element=>Boolean)):List[Element]
  def sort(compare:((Element, Element) => Int)): List[Element]
  def map[B](transform:(Element => B)): List[B]
  def flatMap[B](transform:(Element => List[B])): List[B]
  def ++[B>:Element](list: List[B]): List[B]
  def first (where: (Element => Boolean)): Element
  def contains(element: Element): Boolean
  def zipWith[B,C](list: List[B],transform: (Element,B) => C): List[C]
  def fold[B](startValue: B)(operator:(B,Element) =>B ): B
}
