package lec14_다양한클래스

fun main() {
    val personDto1 = PersonDto(name = "정동욱", age = 1)
    val personDto2 = PersonDto("정동욱", 1)
    println(personDto1 === personDto2)
    println(personDto1 == personDto2)
    println(personDto1)

    val personDto3 = PersonDto2(name = "정동욱", age = 1)
    println(personDto3)
}

// data 클래스를 사용하면 equals, toString, hashCode를 자동으로 생성해준다.
data class PersonDto(
    val name: String,
    val age: Int
)

class PersonDto2(
    val name: String,
    val age: Int
)

// 1.
// 자바의 Dto 클래스(record)를 코틀린에서는 data class라고 한다.
// equals(), toString(), hashCode()를 제공한다.