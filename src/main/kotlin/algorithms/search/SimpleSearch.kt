package algorithms.search

fun List<Int>.max():Int{
    var max = this[0]
    for (i in this){
        if(max < i)
            max = i
    } 
    return max
}

fun List<Int>.min():Int{
    var min = this[0]
    for (i in this){
        if(min > i)
            min = i
    }
    return min
}
