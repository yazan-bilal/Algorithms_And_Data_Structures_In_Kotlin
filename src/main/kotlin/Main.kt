import algorithms.search.binarySearch
import algorithms.sort.bucketSort
import algorithms.sort.insertionSort
import algorithms.sort.mergeSort
import data_structures.Queue
import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {

    var arr1 = arrayOf(10,34,53,3,2,4,5,9)
    bucketSort(arr1 , Array<Int>(size = 100){0})
    for (i in arr1){
        print("$i ")
    }
    println(binarySearch(arr1,53))

    var workers = mutableListOf<String>(
        "Yazan, Ahmad",
        "Yara Mohammad, Julia",
        "Yamamah, Yara Maia",
        "Yasmin, Yara Razok",
        "Walaa, Sarah"
    )
}

fun assignTasks(list: MutableList<String>) {
    for (i in list.indices) {
        var person = list.random()
        list.remove(person)
        println("${i + 1}- $person ")
    }
}
