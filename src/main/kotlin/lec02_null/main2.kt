package lec02_null

import com.lannstark.lec02.Person

fun main() {
    val person = Person("동욱")
    startsWithA(person.name)
}

// 주로 자바와 호환해 사용할 때,
// 자바에서 타입이 null인지 아닌지를 구분하지 않은 값.
// 즉, 코틀린 입장에서 값의 null 여부 알 수 없는 것을 플랫폼 타입이라 한다.
// 이런 플랫폼 타입은 컴파일 시점에 알 수 없기 떄문에 런타임에서 NPE를 발생키실 수 있다.
fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}