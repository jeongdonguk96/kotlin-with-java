package lec08_함수

// 아래 4개의 함수는 모두 동일한 기능을 수행하지만, 다른 형태의 함수다.
// 기본형
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

// 단일 표현식 함수
fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// 반환 타입을 생략한 단일 표현식 함수
fun max3(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

// 최대한 생략한 단일 표현식 함수
fun max4(a: Int, b: Int) = if (a > b) a else b
