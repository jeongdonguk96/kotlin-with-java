package lec16_함수

fun main() {
    var num = 3

    // 일반적인 방법으로 함수 사용를 호출할 수 있지만,
    // 중위 표기법을 사용해 호출할 수도 있다.
    println(num.add(3))
    println(num add 3)
}

// 중위함수
infix fun Int.add(other: Int): Int {
    return this + other
}