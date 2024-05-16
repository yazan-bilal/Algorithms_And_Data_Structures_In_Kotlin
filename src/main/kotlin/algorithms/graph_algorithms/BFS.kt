package algorithms.graph_algorithms

import data_structures.Queue
import data_structures.graph_adj_list.DirectedGraph

fun DirectedGraph.breadthFirstSearch(v:Int) {
    color = Array(nodes) { Color.WHITE }
    distance = Array(nodes) { 0 }
    father = Array<Int?>(nodes) { null }

    color[v] = Color.GRAY
    distance[v] = 0
    father[v] = null
    var q = Queue<Int>()
    q.enqueue(v)
    while (!q.isEmpty()){
        var u = q.dequeue()!!.value
        for (w in adjList[v]){
            if (color[w] == Color.WHITE) {
                color[v]= Color.GRAY
                distance[v] = distance[u]+1
                father[w] = u
                q.enqueue(w)
            }
        }
        color[u] = Color.BLACK
    }
}


enum class Color {
    WHITE, GRAY, BLACK
}