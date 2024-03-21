package lec05_조건

// if else를 하나의 표현식처럼 사용한다.
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "Pass"
    } else {
        "Fail"
    }
}

// if else if를 하나의 표현식처럼 사용한다.
fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

// in a..b를 이용해 값의 범위를 다룬다.
fun validate(score: Int) {
    if (score in 0..100) {
        println("값의 범위는 0~100입니다.")
    }
}

// when 구문을 통해 값을 도출한다.
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

// when 구문을 통해 값을 도출한다.
fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// when 구문을 통해 값을 도출한다.
fun judgeNumber(number: Int) {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("-1, 0, 1이 아닙니다.")
    }
}

// when 구문을 통해 값을 도출한다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

// 1.
// 자바에서는 if - else를 statement로 간주하지만,
// 코틀린에서는 Expression으로 간주한다.

// 2.
// 자바에서는 switch문을 통해 여러 조건 사이에 값을 도출하지만,
// 코틀린에서는 when문을 통해 도출한다.