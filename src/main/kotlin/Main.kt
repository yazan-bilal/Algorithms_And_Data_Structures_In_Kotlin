import algorithms.search.binarySearch
import algorithms.sort.bucketSort
import algorithms.sort.insertionSort
import algorithms.sort.mergeSort
import data_structures.Queue
import data_structures.graph_adj_list.UndirectedGraph
import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {
    var list = LinkedList<Int>()
    list.append(5)
    list.append(6)
    list.append(7)
    list.append(8)
    list.append(9)
    list.append(10)
    for (i in list){
        println(i)
    }
}
