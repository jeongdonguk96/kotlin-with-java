package lec15_배열과컬렉션

fun main() {

    // 빈 가변 map
    val map = mutableMapOf<Int, String>()
    map[1] = "MONDAY"
    map[2] = "TUESDAY"

    for (key in map.keys) {
        println("${key}: ${map[key]}")
    }
    for ((key, value) in map.entries) {
        println("${key}: ${value}")
    }

    // 불변 map
    val map2 = mapOf(1 to "MONDAY", 2 to "TUESDAY")
    for (mutableEntry in map2) {
        println("${mutableEntry.key}: ${mutableEntry.value}")
    }

}