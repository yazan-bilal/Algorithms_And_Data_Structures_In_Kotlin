package data_structures

class LinkedList(val listNode:ListNode?){
    val head = listNode
    val tail:ListNode? = listNode?.next
}