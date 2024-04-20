package algorithms.sort

fun  Array<Int>.insertionSort(
){
    for(i in 1 until this.size){ // looping through the list
        var key = this[i] //saving the number we are in
        var j = i -1 // the pointer to the numbers before the list
        while (j>=0 && this[j]>key){ //looping through the numbers behined
            this[j+1] = this[j]  // swaping between the number in the index j+1 and j
            this[j] = key
            j -= 1
        }
    }
}

// I believe when you understand how the swap happens it will be much more eaiser to understand