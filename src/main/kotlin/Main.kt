import data_structures.Queue
import data_structures.linked_list.LinkedList

fun main(args: Array<String>) {

    val queue = Queue<Int>().enqueue(5).enqueue(6).enqueue(8).enqueue(7).enqueue(8).enqueue(9)
    println(queue)
    queue.dequeue()
    queue.dequeue()
    queue.dequeue()
    println(queue)
    var workers = mutableListOf<String>(
        "Yazan, Ahmad",
        "Yara Mohammad, Julia",
        "Yamamah, Yara Maia",
        "Yasmin, Yara Razok",
        "Walaa, Sarah"
    )
}

fun assignTasks(list: MutableList<String>) {
    for (i in list.indices) {
        var person = list.random()
        list.remove(person)
        println("${i + 1}- $person ")
    }
}
