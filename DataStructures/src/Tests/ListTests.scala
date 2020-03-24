package Tests
import Structures.List.{EmptyList, List}
import Structures.List.{EmptyList, LinkedList}

object ListTests extends App {
  testsForAppend()
  testsForPush()
  testsForContains()
  testsForConcat()

  def testsForAppend() = {
    println("--------- Tests For Append -----------")
    val list: List[Int] = new EmptyList()
    println("*printint empty list")
    list.print
    println("*Appending 5 to empty list")
    val appendList = list.append(5)
    appendList.print
    println("*Appending 4 to [5] list: value expected: 5,4")
    appendList.append(4).print
    println("--------- End Tests For Append -----------")
  }

  def testsForPush(): Unit = {
    println("--------- Tests For Push -----------")
    val list: List[Int] = new EmptyList()
    println("*printint empty list")
    list.print
    println("*Pushing 5 to empty list")
    val appendList = list.push(5)
    appendList.print
    println("*Push 4 to [5] list: value expected: 4,5")
    appendList.push(4).print
    println("--------- End Tests For Push -----------")
  }

  def testsForContains() = {
    println("--------- Tests For Contains -----------")
    val list: List[Int] = new EmptyList()
    println("*printint empty list contains 4")
    println(list.contains(4))
    println("*Pushing 5 to empty list, and printing if list contains 5 expected: true")
    val appendList = list.push(5)
    println(appendList.contains(5))
    println("*Push 4 to [5] list and contains 55: value expected false")
    println(appendList.push(4).contains(55))
    println("--------- End Tests For Contains -----------")
  }

  def testsForConcat() = {
    println("--------- Tests For Concat -----------")
    val list: List[Int] = new EmptyList()
    println("Appending empty to [56] and printing result")
    val appendList = list.push(56)
    val concatList = list++appendList
    concatList.print
    println("appending [1,2,3] to [56]")
    val otherList = new LinkedList[Int](3,new EmptyList[Int]()).push(2).push(1)
    val result = concatList++otherList
    result.print
    println("--------- End Tests For Concat -----------")
  }

}
