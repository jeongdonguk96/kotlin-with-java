package lec19_그외

fun main() {

    // 아래의 break는 내부의 반복문을 멈춘다.
    for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break
            }
            println("${i}, ${j}")
        }
    }

    // label을 사용한 아래의 break는 label이 명시된 반복문을 멈춘다.
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            println("${i}, ${j}")
        }
    }
}

// 1.
// label을 이용한 jump는 매우 강력한 기능이지만,
// 복잡도와 유지보수를 위해 지양하는 것을 권장한다.