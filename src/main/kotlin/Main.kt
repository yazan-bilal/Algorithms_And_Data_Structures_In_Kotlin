import algorithms.search.binarySearch
import algorithms.sort.bucketSort
import algorithms.sort.insertionSort
import algorithms.sort.mergeSort
import data_structures.Queue
import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {

}

fun assignTasks(list: MutableList<String>) {
    for (i in list.indices) {
        var person = list.random()
        list.remove(person)
        println("${i + 1}- $person ")
    }
}
