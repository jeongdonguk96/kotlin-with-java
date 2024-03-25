package lec20_scopfunction

import com.lannstark.lec02.Person

fun main() {
    var str: String? = "A"
    val length = str?.let {
        str.length
    }
    println("${str}의 길이는 ${length}입니다.")

}

fun printPerson(person: Person?) {

    person?.let {
        println(person.name)
    }

    if (person != null) {
        println(person.name)
    }
}

// 1.
// scope function에는 5가지의 종류가 있다.
// let, run, also, apply, with
// 여기서 with를 제외한 4가지는 확장함수다.

// 2.
// let, run은 람다의 결과를 반환하고,
// also, apply는 객체를 반환한다.