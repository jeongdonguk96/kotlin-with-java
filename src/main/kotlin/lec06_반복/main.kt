package lec06_반복

fun main() {
    val numbers = listOf(1L, 2L, 3L)

    // for 문
    for (i in 1..3) {
        println(i)
    }

    // for 문 역순
    for (i in 3 downTo 1) {
        println(i)
    }

    // for 문
    for (i in 1..10 step 2) {
        println(i)
    }

    // for-each 문
    for (number in numbers) {
        println(number)
    }

    // while 문
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}