package data_structures.binary_tree_array

open class BinaryTreeA<T:Any>(
    var binaryTree:Array<T>
) {
    fun root () = binaryTree.first()
    fun parentIndex(childIndex:Int):Int = childIndex/2

    fun parent(childIndex:Int):T = binaryTree[parentIndex(childIndex)]

    fun rightIndex(parentIndex: Int):Int = parentIndex*2+1
    fun rightChild(parentIndex :Int):T = binaryTree[rightIndex(parentIndex)]

    fun leftIndex(parentIndex: Int):Int = parentIndex*2+1
    fun leftChild(parentIndex :Int):T = binaryTree[leftIndex(parentIndex)]
}