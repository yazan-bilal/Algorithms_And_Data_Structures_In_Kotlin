package Algorithms.search

fun List<Int>.max():Int{
    var max = this[0]
    for (i in this){
        if(max < i)
            max = i
    }
    return max
}