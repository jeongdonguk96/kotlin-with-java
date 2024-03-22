package lec15_배열과컬렉션

fun main() {

    // 불변 Set: 값으로 타입을 추론하기 때문에 타입 명시는 옵션이다.
    val set1 = setOf(100, 200)
    println(set1)

    // 가변 Set: 값으로 타입을 추론하기 때문에 타입 명시는 옵션이다.
    val set2 = mutableSetOf(100, 200)
    println(set2)

    // 빈 Set: 값이 없기에 타입을 추론하지 못해 타입을 명시해주어야 한다.
    val set3 = emptySet<Int>()
    println(set3)
}