package data_structures.linked_list

class LinkedList<T:Any>{
    private var head :ListNode<T>? = null
    private var tail : ListNode<T>? = null
    var size = 0

    fun isEmpty():Boolean = size== 0

    override fun toString(): String {
        return if (isEmpty()){
            "empty "
        }else {
            head.toString()
        }
    }

    // push is adding to front
    fun push(value:T):LinkedList<T> {
        head = ListNode (value ,this.head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

    //append adding to the end of Linked list

    fun append(value: T):LinkedList<T> {
        if(isEmpty()){
            push(value)
            return this
        }
        tail!!.next = ListNode(value , null)
        tail = tail!!.next
        size++
        return this
    }

}