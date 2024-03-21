package lec09_클래스

fun main() {
    val person = Person("동욱", 30)
    println(person.name)
    println(person.age)

    person.age = 25
    println(person.age)

    val person2 = Person("동욱")
    println(person2.name)
    println(person2.age)

    val person3 = Person()
    println(person3.name)
    println(person3.age)
}

// 주 생성자는 반드시 존재해야 한다.
class Person (
    val name: String = "동욱",
    var age: Int = 1
) {
    // init 블록은 생성자 호출 시에 같이 호출된다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}살 이하일 수 없습니다.")
        }
        println("초기화 호출")
    }

    // 기본 값을 주고 싶을 경우 아래처럼 부 생성자를 사용한다.
    // 부 생성자는 최종적으로 this로 주 생성자를 호출해야 한다.
    constructor(name: String): this(name, 1)

    // 생성자 내부에 바디로 무언가를 포함할 수 있다.
    constructor(): this("삼체인") {
        println("삼체인 생성")
    }

    // 하지만 부 생성자를 사용하기 보단 주 생성자에 디폴트 파라미터를 사용하는 것이 더 권장된다.
}