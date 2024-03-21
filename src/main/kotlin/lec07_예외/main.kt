package lec07_예외

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

}


// 기본적으로 문법 구조는 자바와 코틀린은 유사하다.
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}


// return을 하나의 Expression으로 간주한다.
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// 코틀린에는 Checked Exception이 없다.모두 Unchecked Exception이다.
// 즉, 매서드 선언부에서 명시적으로 예외를 던지지 않는다.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// 자바의 try-with-resource가 코틀린에는 없다.
// 단, Closeable 인터페이스를 구현한 확장 함수인 use를 사용한다.
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}