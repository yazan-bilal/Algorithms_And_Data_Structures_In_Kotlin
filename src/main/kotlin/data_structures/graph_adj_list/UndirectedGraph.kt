package data_structures.graph_adj_list

import data_structures.linked_list.LinkedList

class UndirectedGraph(
    val nodes: Int = 0 ,
    val edges: Int = 0
) {
    val adjList = Array(nodes){ LinkedList<Int>() }
   // private fun alreadyExist(from:Int , to:Int):Boolean  {
     //   for(i in adjList[from])
    // }
    fun addEdge(from:Int , to :Int ){
        if (from <nodes && to < nodes)
        adjList[from].append(to)
        adjList[to].append(from)
    }

}