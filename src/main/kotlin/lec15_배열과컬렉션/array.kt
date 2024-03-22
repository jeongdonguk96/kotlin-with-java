package lec15_배열과컬렉션

fun main() {

    val array = arrayOf(100, 200)

    // 배열에 값을 더할 수 있다.
    val array2 = array.plus(arrayOf(300, 400))
    val array3 = array2.plus(500)

    // 기존의 자바처럼 인덱스만을 사용할 수 있다.
    for (i in array3.indices) {
        println("${i} : ${array3[i]}")
    }

    // 인덱스와 그 인덱스의 값까지 쌍을 이용할 수 있다.
    for ((idx, value) in array3.withIndex()) {
        println("${idx} : ${value}")
    }
}