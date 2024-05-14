package data_structures.graph_adj_list

import algorithms.graph_algorithms.VertexState
import data_structures.linked_list.LinkedList

class UndirectedGraph(
    var nodes: Int = 0,
    private var edges: Int = 0
) {
    val state = Array(nodes){ VertexState.NEW}
    val dfsNumber = Array(nodes){0}
    val finishNumber = Array(nodes){0}

    var adjList = Array(nodes){ LinkedList<Int>() }


     fun alreadyExist(from:Int , to:Int):Boolean  {
         return adjList[from].valueExist(to)
    }
    fun addEdge(from:Int , to :Int ){
        if (from <nodes && to < nodes && !alreadyExist(from,to)){
            adjList[from].append(to)
            adjList[to].append(from)
            edges++
        }
    }

    fun deleteEdge(from:Int,to:Int){
        if (from <nodes && to < nodes && alreadyExist(from,to)) {
            adjList[from].deleteValue(to)
            adjList[to].deleteValue(from)
            edges--
        }
    }

    fun addVertex(){
        nodes++
        adjList = adjList.plus(LinkedList<Int>())
    }
    fun deleteVertex(index:Int){
        nodes--
        var removedEdges = 0
        var newAdjList = Array(nodes){ LinkedList<Int>() }
        for (i in adjList.indices) {
            if (i == index){
                removedEdges += adjList[index].size
                continue
            }
            newAdjList[i] = adjList[i].copyWithout(index)
        }
        edges  -=removedEdges
        adjList = newAdjList
    }
}