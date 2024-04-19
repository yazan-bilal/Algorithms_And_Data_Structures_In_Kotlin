package Algorithms.sort

fun insertionSort(
     list:List<Int>,
):List<Int>{
    val list1 = list.toMutableList()
    for(i in 1 until list1.size){ // looping through the list
        var key = list1[i] //saving the number we are in
        var j = i -1 // the pointer to the numbers before the list
        while (j>=0 && list1[j]>key){ //looping through the numbers behined
            list1[j+1] = list1[j]  // swaping between the number in the index j+1 and j
            list1[j] = key
            j = j-1
        }
    }
    return list1.toList()
}

// I believe when you understand how the swap happens it will be much more eaiser to understand