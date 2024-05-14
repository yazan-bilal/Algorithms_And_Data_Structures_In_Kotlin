package algorithms.graph_algorithms

import data_structures.graph_adj_list.DirectedGraph

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
    graph.dfsCounter = 0
}

fun DirectedGraph.dfs(x: Int) {
    state[x] = VertexState.ACTIVE
    dfsNumber[x] = dfsCounter
    dfsCounter++
    for (w in adjList[x]) {
        if (state[w] == VertexState.NEW) {
            dfs(w)
        }
    }
    state[x] = VertexState.FINISHED
    finishNumber[x] = finishedCounter
    finishedCounter++
}


enum class VertexState {
    NEW, ACTIVE, FINISHED
}