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
        if (isEmpty()) {
            push(value)
            return this
        }
        tail!!.next = ListNode(value, null)
        tail = tail!!.next
        size++
        return this
    }

    // insert a value in a specific place :
    fun insertNode(value:T,index:Int):LinkedList<T>{
        var pointer  = head
        if (isEmpty()){
            push(value)
        }
        if (index >= size){
            println("index out of bounds")
            return this
        }
        for (i in 0..index){
            pointer = pointer?.next
            if ( i== index -1 ){
                pointer!!.next = ListNode(value , pointer.next )
            }
        }
        return this
    }

    fun nodeAt(index:Int):ListNode<T> {
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode !!
    }

    fun insert1(value:T , afterNode:ListNode<T>):ListNode<T>{
        if (tail == afterNode){
            append(value)
            return tail !!
        }
        val newNode = ListNode(value = value, next = afterNode)
        afterNode.next = newNode
        size ++

        return newNode
    }

    fun insert (value: T, index:Int = 0 ):LinkedList<T>{
        if (size-1  == index || isEmpty()){
            append(value)
        } else {
            val newNode = ListNode(value , nodeAt(index))
            nodeAt(index -1).next = newNode
            size++
        }
        return this
    }

    // deleting values :
    fun pop():ListNode<T>?{
        if (head == null )
            return null
        val deletedNode = head
        head = head?.next
        size--
        return deletedNode
    }
    fun deleteLast():ListNode<T>? {
        if (isEmpty()){
            return null
        }
        if (tail == head ){
            return pop()
        }
        tail = nodeAt(size -2 )
        val deletedNode = tail
        tail!!.next = null
        size--
        return deletedNode
    }

    fun deleteAt(index: Int):ListNode<T>{
        return if(size == 1 ){
            deleteLast() !!
        }else{
            val previousNode = nodeAt(index-1)
            val deletedNode = previousNode.next
            previousNode.next = previousNode.next!!.next
            size--
            deletedNode!!

        }
    }
}