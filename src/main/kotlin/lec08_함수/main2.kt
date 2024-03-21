package lec08_함수

fun main() {
    // 모든 값을 넣고 함수를 호출한다.
    repeat("Hello World",5, true)

    // 디폴트 값을 넣지 않고 함수를 호출한다.
    repeat("Hello World")

    // named argument
    // 선택적으로 갑을 넣고 함수를 호출한다.
    // 이 경우 파라미터 순서가 맞지 않기 때문에 이름을 부여한다.
    repeat("Hello World", userNewLine = true)
}

// 디폴트 파라미터를 사용할 수 있다.
// 매서드가 호출될 때, 값이 명시되지 않는 파라미터에 대해 기본값을 부여한다.
fun repeat(
    str: String,
    num: Int = 3,
    userNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}