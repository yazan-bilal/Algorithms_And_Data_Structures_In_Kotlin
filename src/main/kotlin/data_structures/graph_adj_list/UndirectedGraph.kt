package data_structures.graph_adj_list

import data_structures.linked_list.LinkedList

class UndirectedGraph(
    var nodes: Int = 0,
    val edges: Int = 0
) {
    var adjList = Array(nodes){ LinkedList<Int>() }
    private fun alreadyExist(from:Int , to:Int):Boolean  {
        for(i in adjList[from]){
            if (i == to){
                return true
            }
        }
        return false
    }
    fun addEdge(from:Int , to :Int ){
        if (from <nodes && to < nodes && !alreadyExist(from,to))
        adjList[from].append(to)
        adjList[to].append(from)
    }

    fun deleteEdge(from:Int,to:Int){
        adjList[from].deleteValue(to)
        adjList[to].deleteValue(from)
    }

    fun addVertex(value:Int){
        nodes++
        adjList = adjList.plus(LinkedList<Int>())
    }
    fun deleteVertex(index:Int){
        nodes--
        var newAdjList = Array(nodes){ LinkedList<Int>() }
        for (i in 0 .. nodes ){
            for(k in adjList[i]) {
                if(i == index || k == index) {
                    continue
                }
                newAdjList[i].append(k)
            }
        }
    }
}