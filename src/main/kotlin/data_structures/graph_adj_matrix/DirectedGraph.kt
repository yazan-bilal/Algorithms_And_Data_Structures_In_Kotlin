package data_structures.graph_adj_matrix

class DirectedGraph(
    var nodes:Int = 0,
    var edges:Int = 0
) {
    private var adjMatrix  = Array(nodes) { IntArray(nodes){0} }
    private fun alreadyExist(from:Int , to:Int) = adjMatrix[from][to] == 1
    fun addEdge(from:Int , to:Int) {
        if (from <nodes && to <nodes && !alreadyExist(from,to)) {
            adjMatrix[from][to] = 1
            edges++
        }else {
            println("edge is out of bounds")
        }
    }
    fun deleteEdge(from:Int , to:Int){
        if (from <nodes && to <nodes) {
            adjMatrix[from][to] = 0
            edges--
        }else {
            println("edge is out of bounds")
        }
    }
    fun addVertex(){
        val newAdjMatrix = Array(adjMatrix.size +1){IntArray(adjMatrix.size + 1){0} }
        for (i in adjMatrix.indices){
            for(j in adjMatrix[i].indices){
                if ( adjMatrix[i][j]  == 1 ){
                    newAdjMatrix[i][j] = 1
                }
            }
        }
        nodes++
        adjMatrix = newAdjMatrix
    }
    fun deleteVertex(index:Int){
        val newAdjMatrix = Array(adjMatrix.size -1){IntArray(adjMatrix.size -1 ){0} }
        var newEdges = 0
        for (i in adjMatrix.indices){
            if (i == index)
                continue
            for (j in adjMatrix[i].indices){
                if (j == index)
                    continue
                if(adjMatrix[i][j]== 1){
                    newAdjMatrix[i][j] = 1
                    newEdges++
                }
            }
        }
        edges = newEdges
        nodes--
        adjMatrix = newAdjMatrix
    }

    fun toUndirectedGraph():UndirectedGraph{
        val newGraph = UndirectedGraph(nodes)
        for (i in adjMatrix.indices){
            for(j in adjMatrix[i].indices){
                if ( adjMatrix[i][j]  == 1 ){
                    newGraph.addEdge(i,j)
                }
            }
        }
        return newGraph
    }
}