package algorithms.search

fun binarySearch(arr: Array<Int>, value: Int, f: Int = 0, l: Int = arr.lastIndex): Int {
    var mid = (l + f) / 2
    if (arr[mid] == value) {
        return mid
    }
    return if (value <= arr[mid]) {
        binarySearch(arr, value, f, mid)
    } else {
        binarySearch(arr, value, mid + 1, l)
    }

}