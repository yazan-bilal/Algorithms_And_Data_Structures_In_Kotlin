package data_structures.Trees

class TreeNode<T>(
    val value: T
) {
    private val children:MutableList<TreeNode<T>>  = mutableListOf()

    fun add(child:TreeNode<T>){
        children.add(child)
    }
    fun forEachLevelOrder(
        visit:Visitor<T>
    ) {
        visit(this)
        children.forEach{
            it.forEachLevelOrder (visit)
        }
    }
}


typealias Visitor<T> = (TreeNode<T>) -> Unit
