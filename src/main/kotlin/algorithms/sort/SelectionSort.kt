package algorithms.sort

fun Array<Int>.selectionSort(
){
    var count = 0
    while(count<this.size){
        var  maxIndex  = 0
        for (i in 0 until this.size-count){
            if (this[maxIndex]<this[i]){
                maxIndex = i
            }
        }
        this.swap(maxIndex,this.lastIndex - count)
        count++
    }
}

fun <T> Array<T>.swap(index1:Int  , index2:Int){
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}