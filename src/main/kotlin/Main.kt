import Algorithms.sort.insertionSort

fun main(args: Array<String>) {
   val list =  listOf<Int>(5,4,2,3,12,1,4)
    print(testFunction(list))
}

fun testFunction(
    list:List<Int>
):List<Int> {
    val list1 = list.toMutableList()
    var j = list.lastIndex -1
    var key = list.last()
    while (j!=1){
        list1[j+1] = list1[j]
        list1[j] = key
        j-=1
    }
    return list1.toList()
}