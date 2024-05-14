package data_structures.graph_adj_list

import algorithms.graph_algorithms.VertexState
import data_structures.Stack
import data_structures.linked_list.LinkedList

class DirectedGraph(
    var nodes: Int = 0,
    private var edges: Int = 0,
) {
    var dfsCounter = 0
    var finishedCounter = 0
    var state = Array(nodes){ VertexState.NEW}
    var dfsNumber = Array(nodes){0}
    var finishNumber = Array(nodes){0}
    var adjList = Array(nodes) { LinkedList<Int>() }


    fun alreadyExist(from: Int, to: Int): Boolean {
        return adjList[from].valueExist(to)
    }

    fun addEdge(from: Int, to: Int) {
        if (from < nodes && to < nodes && !alreadyExist(from, to)) {
            adjList[from].append(to)
            edges++
        }
    }

    fun deleteEdge(from: Int, to: Int) {
        if (from < nodes && to < nodes && alreadyExist(from, to)) {
            adjList[from].deleteValue(to)
            edges--
        }
    }

    fun addVertex() {
        nodes++
        adjList = adjList.plus(LinkedList<Int>())
    }

    fun deleteVertex(index: Int) {
        nodes--
        var removedEdges = 0
        var newAdjList = Array(nodes) { LinkedList<Int>() }
        for (i in adjList.indices) {
            if (i == index) {
                removedEdges += adjList[index].size
                continue
            }
            if (adjList[i].valueExist(index)) {
                removedEdges++
                newAdjList[i] = adjList[i].copyWithout(index)
            }
        }
        edges -= removedEdges
        adjList = newAdjList
    }

    fun outgoingEdges(index: Int): Int {
        return adjList[index].size
    }

    fun incomingEdges(index: Int): Int {
        var counter = 0
        for (i in adjList.indices) {
            if (i == index)
                continue
            if (adjList[i].valueExist(index)) {
                counter++
            }
        }
        return counter
    }

    fun toUndirectedGraph(): UndirectedGraph {
        val undirectedGraph = UndirectedGraph(nodes = nodes)
        var stack = Stack<Int>()
        for (i in adjList.indices) {
            val pointer = adjList[i].head
            for (i in 0 until adjList[i].size) {
                if ( pointer?.value == null){
                    break
                }else {
                    adjList[pointer.value]
                }
            }
        }
        return undirectedGraph
    }

}