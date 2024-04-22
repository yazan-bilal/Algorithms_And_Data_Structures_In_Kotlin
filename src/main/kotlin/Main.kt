import data_structures.linked_list.LinkedList
import data_structures.linked_list.ListNode

fun main(args: Array<String>) {
    var linkedList = LinkedList<Int>()
    linkedList.append(5).append(6).append(7)
    print(linkedList)
}
