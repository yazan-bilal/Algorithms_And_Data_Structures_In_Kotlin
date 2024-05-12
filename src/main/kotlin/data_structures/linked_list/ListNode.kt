package data_structures.linked_list
/***
 A class for implementing the Node in the linked list.
 We have two functions :
    - first : toString() -> so when we print the class we have a meaningful output , How it works ?
        - by returning the value if the next value is null or returning the value and the next node with calling to string function (recursive)
    - second : printInReverse() -> just printing the values in a reverse sequence , How it works ?
        - we recall the function printInReverse() until we reach a null value (the base case is next is null) then print the arrow if the value
        in the recursive is not null then we print each value...
 ***/

class ListNode<T>(
    var value:T,
    var next: ListNode<T>? = null,
) {
    override fun toString(): String {
        return if (next != null){
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }

    fun printInReverse(){
        next ?.printInReverse()

        if (next != null){
            print(" -> ")
        }
        print(value.toString())
    }

}