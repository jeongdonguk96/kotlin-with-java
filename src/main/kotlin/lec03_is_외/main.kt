package lec03_is_외

import com.lannstark.lec03.Person

fun main() {
    // 기본 타입의 경우
    // 자바는 묵시적 형변환이 가능했지만
    // 코틀린은 명시적으로 toString(), toLong(), .. 등을 사용해주어야 한다.
    val num1 = 3
    val num2 = num1.toLong() ?: 0L

    val person = Person("동욱", 30)
    printAgeIfPerson(person)
    printIfNotPerson(person)

    val person2 = null
    printIfNotPerson(person2)
}


fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj
        println("사람의 나이는 = " +person.age)
    }
}

fun printIfNotPerson(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.name)
}

// 1.
// obj is Person는 obj instanceof Person과 같다.
// obj !is Person는 obj !instanceof Person과 같다.

// 2.
// obj as Person은 obj를 Person 타입으로 형변환하라는 의미다.
// obj as? Person은 obj가 nullable하다는 의미다.
