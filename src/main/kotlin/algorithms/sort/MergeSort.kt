package algorithms.sort


fun mergeSort(arr:Array<Int>,f:Int,l:Int){
    if(l<=f){
        return
    }
    var m = (l+f)/2
    mergeSort(arr, f , m)
    mergeSort(arr, m+1 , l)
    merge(arr,f,m,l)
}

fun merge(arr:Array<Int>,f:Int ,m:Int ,l:Int){
    var n1 = m-f + 1
    var n2 = l-m
    var arr1 = Array(size = n1+1){0}
    var arr2 = Array(size = n2+1){0}
    for(i in 0 until n1){
        arr1[i] = arr[f+i]
    }
    for(i in 0 until n2){
        arr2[i] = arr[m+i+1]
    // this +1 one here is not taking the same element twice
    // because we reach a state where m = f so the same elements will be taken
    }
    arr1[n1]= Int.MAX_VALUE
    arr2[n2]= Int.MAX_VALUE
    var i = 0
    var j = 0
    for (k in f..l){
        if (arr1[i] <= arr2[j]){
            arr[k] = arr1[i]
            i++
        }else {
            arr[k] = arr2[j]
            j++
        }
    }
}