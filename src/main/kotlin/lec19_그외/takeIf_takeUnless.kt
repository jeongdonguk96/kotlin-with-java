package lec19_그외

// 파라미터의 값이 1 이상이면 해당 변수를,
// 1 미만이면 null을 반환하는 단순한 매서드다.
fun getNumberOrNull(number: Int): Int? {
    return if (number > 0) {
        number
    } else {
        null
    }
}

// 위 매서드를 takeIf를 이용해 간단히 줄일 수 있다.
// takeIf는 주어진 조건을 만족하면 그 값을,
// 만족하지 않으면 null을 반환하는 함수이다.
fun getNumberOrNull2(number: Int): Int? {
    return number.takeIf { number > 0 }
}

// 반대로 takeUnless는 주어진 조건을 만족하지 않으면 그 값을,
// 만족하면 null을 반환하는 함수이다.
fun getNumberOrNull3(number: Int): Int? {
    return number.takeUnless { number <= 0 }
}