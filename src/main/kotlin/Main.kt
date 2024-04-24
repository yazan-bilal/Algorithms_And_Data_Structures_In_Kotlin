import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {
    var linkedList = LinkedList<Int>()
    linkedList.append(0).append(1).append(2).append(3).append(4).append(5)
    linkedList.insert(10,3)
    linkedList.deleteAt(4)
    linkedList.deleteLast()
    print(linkedList.nodeAt(0))
}
