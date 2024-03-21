package lec02_null

fun main() {


    val str: String? = "ABC"
    str?.length // Safe Call 사용 (nullable 인스턴스 사용 시 인스턴스에 ? 붙이는 것)
    println(str?.length ?: "안녕하세요~") // Elivs 연산자 앞의 값이 null이면 뒤의 것을 사용

    println(startsWithA1WithSafeCallAndElvis(str))
    println(startsWithA2WithSafeCallAndElvis(str))
    println(startsWithA3WithSafeCallAndElvis(str))

    val str2: String = "ABC"
    println(startsWithA4WithSafeCallAndElvis(str2))
    println(startsWithA5WithNotNull(str2))
}

// 1. 넘어오는 파라미터가 nullable함
// 2. 반환 값이 nullable하지 않음
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalAccessException("값이 null입니다.")
    }

    return str.startsWith("A")
}

fun startsWithA1WithSafeCallAndElvis(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalAccessException("값이 null입니다")
}

// 1. 넘어오는 파라미터가 nullable함
// 2. 반환 값이 nullable함
fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

fun startsWithA2WithSafeCallAndElvis(str: String?): Boolean? {
    return str?.startsWith("A")
}

// 1. 넘어오는 파라미터가 nullable함
// 2. 반환 값이 nullable하지 않음
fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }

    return str.startsWith("A")
}

fun startsWithA3WithSafeCallAndElvis(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// 1. 넘어오는 파라미터가 nullable하지 않음
// 2. 반환 값이 nullable하지 않음
fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA4WithSafeCallAndElvis(str: String): Boolean {
    return str.startsWith("A")
}

// 1. 넘어오는 파라미터를 ?로 선언했지만, 실제로 절대 null이 오지 않을 경우
// 2. 사용할 시점 변수에 !!를 붙임으로써 절대 null이 오지 않음을 명시
fun startsWithA5WithNotNull(str: String?): Boolean {
    return str!!.startsWith("A")
}

// 1.
// 매서드 선언부 타입에 따라 파라미터나 응답 값의 null 여부를 알 수 있다.