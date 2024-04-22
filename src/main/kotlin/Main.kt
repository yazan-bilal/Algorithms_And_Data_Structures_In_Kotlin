import algorithms.search.max
import algorithms.sort.insertionSort
import algorithms.sort.selectionSort
import data_structures.ListNode
import data_structures.Stack

fun main(args: Array<String>) {
    val linkedList = ListNode(5,ListNode(6,ListNode(7,ListNode(9,ListNode(10)))))
    println(linkedList.toString())
    linkedList.printInReverse()
}
