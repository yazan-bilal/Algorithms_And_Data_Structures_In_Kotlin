package algorithms.graph_algorithms

fun depthFirstSearch(nodes:Int){
    val state = Array(nodes){VertexState.NEW}
    val dfsNumber = Array(nodes){0}
    val finishNumber = Array(nodes){0}
    //learn how to iterate in Linked list
    // learn how to use higher order functions in kotlin
}

enum class VertexState {
    NEW,ACTIVE,FINISHED
}