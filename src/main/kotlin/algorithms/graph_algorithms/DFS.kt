package algorithms.graph_algorithms

import data_structures.graph_adj_list.DirectedGraph
import data_structures.linked_list.LinkedList

fun DirectedGraph.depthFirstSearch() {
    depthFirstSearchInit(this)
    for (x in adjList.indices) {
        if (state[x] == VertexState.NEW){
            this.dfs(x)
        }
    }
}

fun depthFirstSearchInit(graph: DirectedGraph) {
    graph.state = Array(graph.nodes) { VertexState.NEW }
    graph.dfsNumber = Array(graph.nodes) { 0 }
    graph.finishNumber = Array(graph.nodes) { 0 }
    graph.dfsCounter = 0
    graph.finishedCounter = 0
    graph.treeEdge = LinkedList()
    graph.forwardEdge = LinkedList()
    graph.BackwordEdge = LinkedList()
    graph.crossEdge = LinkedList()
}

fun DirectedGraph.dfs(x: Int) {
    state[x] = VertexState.ACTIVE
    dfsNumber[x] = dfsCounter
    dfsCounter++
    for (w in adjList[x]) {
        if (state[w] == VertexState.NEW) {
            this.treeEdge.add(Pair(x,w))
            dfs(w)
        }else if (state[w] == VertexState.ACTIVE) {
            this.BackwordEdge.add(Pair(x,w))
        }else {
            if (dfsNumber[x] < dfsNumber[w]) {
                this.forwardEdge.add(Pair(x,w))
            }else {
                this.BackwordEdge.add(Pair(x,w))
            }
        }
    }
    state[x] = VertexState.FINISHED
    finishNumber[x] = finishedCounter
    finishedCounter++
}


enum class VertexState {
    NEW, ACTIVE, FINISHED
}