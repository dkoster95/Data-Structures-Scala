package Structures.Stack

import Structures.ListConvertibleStruct

trait Stack[Element] extends ListConvertibleStruct[Element] {
  def isEmpty: Boolean
  def push(element: Element): Stack[Element]
  def pop(): Stack[Element]
  def top: Element
  def tail: Stack[Element]
  def map[OtherElement](transform:(Element => OtherElement)): Stack[OtherElement]
  def flatMap[OtherElement](transform:(Element => Stack[OtherElement])): Stack[OtherElement]
  def filter(query:(Element => Boolean)): Stack[Element]
  def copy: Stack[Element]
  def print: Unit
  def ++(stack: Stack[Element]): Stack[Element]
}




