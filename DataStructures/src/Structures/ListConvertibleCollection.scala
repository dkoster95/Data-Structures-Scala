package Structures
import Structures.List.List

trait ListConvertibleStruct[Element] {
  def toList: List[Element]
}
