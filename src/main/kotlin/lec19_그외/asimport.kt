package lec19_그외

// importas를 이용해
// 동일한 이름의 매서드를 가져다 쓸 때
// 다른 이름으로 사용한다.
import lec19_그외.b.printHelloWorld as printHelloWorldB
import lec19_그외.a.printHelloWorld as printHelloWorldA

fun main() {
    printHelloWorldA()
    printHelloWorldB()
}