package data_structures.graph_adj_list

import data_structures.linked_list.LinkedList

class DirectedGraph (
    var nodes: Int = 0 ,
    var edges: Int = 0 ,
){

    var adjList = Array(nodes){ LinkedList<Int>() }


    fun alreadyExist(from:Int , to:Int):Boolean  {
        return adjList[from].valueExist(to)
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
    fun deleteVertex(index:Int){
        nodes--
        var removedEdges = 0
        var newAdjList = Array(nodes){ LinkedList<Int>() }
        for (i in adjList.indices) {
            if (i == index){
                removedEdges += adjList[index].size
                continue
            }
            if (adjList[i].valueExist(index)){
                removedEdges++
                newAdjList[i] = adjList[i].copyWithout(index)
            }
        }
        edges -= removedEdges
        adjList = newAdjList
    }

    fun outgoingEdges(index:Int):Int {
        return adjList[index].size
    }
    fun incomingEdges(index:Int):Int {
        var counter = 0
        for(i in adjList.indices) {
            if (i == index)
                continue
            if (adjList[i].valueExist(index)){
                counter++
            }
        }
        return counter
    }

  /* fun toUndirectedGraph():UndirectedGraph {
        val undirectedGraph  = UndirectedGraph(nodes = nodes)
       for(i in adjList.indices) {
           adjList[i]
           undirectedGraph.adjList[i]  = adjList[i]
       }
    }
   */

}