fun main() {
    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 2]
} 