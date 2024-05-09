import algorithms.search.binarySearch
import algorithms.sort.bucketSort
import algorithms.sort.insertionSort
import algorithms.sort.mergeSort
import data_structures.Queue
import data_structures.graph_adj_list.UndirectedGraph
import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {
    var graph:UndirectedGraph = UndirectedGraph(nodes=5)
    graph.addEdge(1,2)
    graph.addEdge(0,3)
    graph.addEdge(1,3)
    graph.addEdge(3,4)
    graph.addEdge(0,4)
    graph.addEdge(3,2)
    println(graph.alreadyExist(3,4))
    println(graph.alreadyExist(4,0))
    println(graph.edges)
    graph.deleteVertex(4)
    println(graph.edges)
    println(graph.alreadyExist(3,4))
    println(graph.alreadyExist(0,4))
}
