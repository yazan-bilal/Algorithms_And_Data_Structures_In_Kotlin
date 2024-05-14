
import algorithms.graph_algorithms.depthFirstSearch
import algorithms.graph_algorithms.depthFirstSearchInit
import data_structures.graph_adj_list.DirectedGraph


fun main(args: Array<String>) {
    var graph :DirectedGraph = DirectedGraph(nodes = 6)
    graph.addEdge(1,0)
    graph.addEdge(0,2)
    graph.addEdge(3,2)
    graph.addEdge(3,1)
    graph.addEdge(3,5)
    graph.addEdge(4,3)
    graph.addEdge(4,5)
    graph.addEdge(5,1)
    graph.depthFirstSearch()
    println(graph.state[3])

}
