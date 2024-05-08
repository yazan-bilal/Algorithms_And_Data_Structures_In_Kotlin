package data_structures.graph_adj_list

import data_structures.linked_list.LinkedList

class UndirectedGraph(
    var nodes: Int = 0,
    var edges: Int = 0
) {
    
    var adjList = Array(nodes){ LinkedList<Int>() }

    //  alreadyExist is not working correctly
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
        var newAdjList = Array(nodes){ LinkedList<Int>() }
        for (i in adjList.indices) {
            if (i == index)
                continue
            newAdjList[i] = adjList[i].copyWithout(index)
        }
        adjList = newAdjList
    }
}