package algorithms.sort

fun bucketSort(arr:Array<Int>,counts:Array<Int>){
    for(i in arr){
        counts[i] +=1
    }
    var i = 0
    for (n in counts.indices){
        if(counts[n]!= 0 ){
            for(j in 0 until counts[n]){
                arr[i] = n
                i++
            }
        }
    }
}