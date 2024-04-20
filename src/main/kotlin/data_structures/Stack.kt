package data_structures

class  Stack {
    val stack:ArrayList<Int> = ArrayList()
    fun push(value:Int){
        stack.add(value)
    }
    fun pop():Int{
        return stack.removeLast()
    }

    fun top():Int{
        return stack.last()
    }
}