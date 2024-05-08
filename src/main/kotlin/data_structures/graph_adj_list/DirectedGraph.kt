package data_structures.graph_adj_list

import data_structures.linked_list.LinkedList

class DirectedGraph (
    var nodes: Int = 0 ,
    var edges: Int = 0 ,
){
    var adjList = Array(nodes){ LinkedList<Int>() }
    private fun alreadyExist(from:Int , to:Int):Boolean  {
        return false
    }
    fun addEdge(from:Int , to :Int ){
        if (from <nodes && to < nodes && !alreadyExist(from,to)){
            adjList[from].append(to)
            edges++
        }
    }

    fun deleteEdge(from:Int,to:Int){
        if (from <nodes && to < nodes && alreadyExist(from,to)) {
            adjList[from].deleteValue(to)
            edges--
        }
    }

    fun addVertex(){
        nodes++
        adjList = adjList.plus(LinkedList<Int>())
    }
  /*  fun deleteVertex(index:Int){
        nodes--
        var newAdjList = Array(nodes){ LinkedList<Int>() }
        for (i in 0 .. nodes ){
            if (i == index)
                continue
            for(k in adjList[i]) {
                if(k == index)
                    continue
                newAdjList[i].append(k)
            }
        }
        adjList = newAdjList
    }

   */
}