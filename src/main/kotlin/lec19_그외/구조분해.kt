package lec19_그외

fun main() {
    val person = Person("동욱", 30)


    // 이 구조분해 코드와
//    val (name, age) = person

    // 이 코드는 동일한 의미의 코드이다.
    val name = person.component1()
    val age = person.component2()

    println("이 사람은 ${name}이고 나이는 ${age}살 입니다.")




    val person2 = Person2("민수", 100)
    val (name2, age2) = person2
    println("이 사람은 ${name2}이고 나이는 ${age2}살 입니다.")
}

data class Person(
    val name: String,
    val age: Int
)

class Person2(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}


// 1.
// data class는 내부의 필드들을 component로 갖고 있는데
// 이를 이용해 구조분해를 사용할 수 있다.

// 2.
// data class가 아닌 일반 class도 구조분해를 사용할 수 있는데,
// 클래스 바디 내에 오퍼레이터 함수를 만들어 변형하는 방식으로 사용하면 된다.

// 3.
// EntryMap의 (key, value)와
// 리스트의 (idx, value)도
// 구조분해를 사용한 것이다.