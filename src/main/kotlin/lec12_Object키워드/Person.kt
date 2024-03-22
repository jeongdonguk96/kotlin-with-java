package lec12_Object키워드

fun main() {

    // companion object의 newBaby() 함수에 @JvmStatic 어노테이션을 사용했기 때문에
    // 객체를 타고 들어가지 않고 스태틱으로 사용할 수 있게 해준다.
    Person.newBaby("동욱")

    // 싱글톤 객체를 스태틱처럼 바로 불러 사용할 수 있다.
    println(SingletonObject.num)
    SingletonObject.num += 10
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    // 자바의 static과 같은 역할을 한다.
    companion object {
        private const val MIN_AGE = 0

        // 객체를 타고 들어가지 않고 스태틱으로 사용할 수 있게 해준다.
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

object SingletonObject {
    var num = 0
}

// 1.
// 자바에서는 static 키워드를 사용했지만
// 코틀린에서는 companion object를 사용한다.

// 2.
// @JvmStatic 어노테이션을 사용하면
// 객체를 타고 들어가지 않고 스태틱으로 사용할 수 있게 해준다.

// 3.
// 싱글톤 객체는 인스턴스가 하나이기 때문에
// 별도로 인스턴스화하지 않고 스태틱처럼 바로 접근한다.
