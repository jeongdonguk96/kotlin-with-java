package lec03_is_외

import com.lannstark.lec03.Person

fun main() {

    // ${} 표현식을 string interpolation라 부른다.
    // 문자열 내에 표현식을 사용할 수 있다.
    val person = Person("동욱", 30)
    val name = person.name
    val log = "이 사람의 이름은 $name 이고 나이는 ${person.age}살 입니다."
    println(log)

    // 문자열의 자릿수를 가져오는 방법이다.
    // 자바와 달리 배열과 같이 문자열 자체의 자릿값 인덱스를 가져와 사용할 수 있다.
    val str = "ABC"
    println(str[0])
    println(str[2])

}

// 1.
// Any는 자바의 Object와 같이 최상위 타입이다.
// Any는 기본적으로 null을 허용하지 않아 Any?를 사용해야 한다.

// 2.
// Unit은 자바의 void와 같은 역할을 한다.
// void와 달리 Unit은 그 자체로 타입 인자로 사용할 수 있다.

// 3.
// Nothing은 함수가 정상적으로 끝나지 않았다는 걸 표현한다.
// 무조건 예외를 반환하거나 무한 루프에 사용한다.

// 4.
// Nothing은 함수가 정상적으로 끝나지 않았다는 걸 표현한다.
// 무조건 예외를 반환하거나 무한 루프에 사용한다.

// 5.
// 문자열 안에 ${} 표현식을 사용하면 변수의 값을 가져와 사용할 수 있다.
// ${변수}와 $변수 두 사용법이 있는데, 가독성을 위해 전자를 사용하는 게 좋다.