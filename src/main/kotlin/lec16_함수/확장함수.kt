package lec16_함수

import com.lannstark.lec16.Person

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("동욱", "정", 0)
    println(person.nextYearAge())
}

// 확장함수를 사용해 기존 String이 제공하는 API에 커스텀 API를 하나 추가했다.
// this는 호출하는 객체 즉, 수신객체
fun String.lastChar(): Char {
    return this[this.length - 1]
}


fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}