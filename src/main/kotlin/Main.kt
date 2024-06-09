
import algorithms.graph_algorithms.cheriyanMehlhornGabow
import algorithms.graph_algorithms.depthFirstSearch
import algorithms.graph_algorithms.largestStronglyConnectedGraph
import data_structures.graph.Edge
import data_structures.graph.Graph
import data_structures.graph.Vertex
import data_structures.graph_adj_list.DirectedGraph


fun main(args: Array<String>) {
    var graph = Graph<Int>()
    graph.createVertex(0)
    graph.createVertex(1)
    graph.createVertex(2)
    graph.createVertex(3)
    graph.createVertex(4)
    graph.addDirectedEdge(graph.getVertexByData(0)!! ,graph.getVertexByData(1)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(1)!! ,graph.getVertexByData(2)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(2)!! ,graph.getVertexByData(0)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(0)!! ,graph.getVertexByData(4)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(2)!! ,graph.getVertexByData(3)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(3)!! ,graph.getVertexByData(4)!! , null  )
    graph.addDirectedEdge(graph.getVertexByData(4)!! ,graph.getVertexByData(3)!! , null  )
    println("numbe of edges : ${graph.eCount} number of vertexes  ${graph.vCount} ")
    graph.cheriyanMehlhornGabow()
    val new = graph.largestStronglyConnectedGraph()
    println("numbe of edges : ${new.eCount} number of vertexes  ${new.vCount} ")

}
