package lec15_배열과컬렉션

fun main() {

    // 불변 List: 값으로 타입을 추론하기 때문에 타입 명시는 옵션이다.
    val numbers = listOf(100, 200)
    printNumbers(numbers)
    println(numbers[0])
    println(numbers[1])

    // 가변 List: 값으로 타입을 추론하기 때문에 타입 명시는 옵션이다.
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)
    printNumbers(numbers2)

    // 빈 List: 값이 없기에 타입을 추론하지 못해 타입을 명시해주어야 한다.
    val numbers3 = emptyList<Int>()
    printNumbers(numbers3)
}

private fun printNumbers(numbers: List<Int>) {
    for (number in numbers) {
        println(number)
    }
}