package lec04_비교

import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(2_000L)
    val money4 = JavaMoney(2_000L)

    isTheySame(money1, money2)
    isTheySame(money1, money3)
    isTheySame(money2, money3)
    isTheySame(money3, money4)

    isTheyEqual(money1,money2)
    isTheyEqual(money1,money3)
    isTheyEqual(money2,money3)
    isTheyEqual(money3,money4)
}

// 객체의 주소값을 비교할 때는 ===로 한다.
fun isTheySame(money1: JavaMoney, money2: JavaMoney) {
    if (money1 === money2) {
        println("두 객체는 동일합니다.")
    } else {
        println("두 객체는 동일하지 않습니다.")
    }
}

// 객체의 값을 비교할 때는 ==로 한다.
fun isTheyEqual(money1: JavaMoney, money2: JavaMoney) {
    if (money1 == money2) {
        println("두 객체는 동등합니다.")
    } else {
        println("두 객체는 동등하지 않습니다.")
    }
}

// 1.
// 자바에서는 ==가 주소 비교, equals가 값 비교였는데,
// 코틀린에서는 ===가 주소 비교, ==가 값 비교이다.