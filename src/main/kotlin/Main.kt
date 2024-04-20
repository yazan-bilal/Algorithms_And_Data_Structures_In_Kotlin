import algorithms.search.max
import algorithms.sort.insertionSort
import algorithms.sort.selectionSort
import data_structures.Stack

fun main(args: Array<String>) {
    val s = Stack()
    s.push(5)
    s.push(6)
    println(s.pop())

}

fun testFunction(
    list:List<Int>
):List<Int> {
    val list1 = list.toMutableList()
    var j = list.lastIndex -1
    var key = list.last()
    while (j!=1){
        list1[j+1] = list1[j]
        list1[j] = key
        j-=1
    }
    return list1.toList()
}