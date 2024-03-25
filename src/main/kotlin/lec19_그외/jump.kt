package lec19_그외

fun main() {
    val numbers = listOf(1, 2, 3)

    // 일반적인 forEach에서는 break나 continue를 사용할 수 있다.
    for (number in numbers) {
        if(number == 2)
            break
    }

    // 스트림의 forEach에서는 break나 continue같은 키워드를 사용할 수 없다.
//    numbers.forEach { number ->
//        if(number == 2)
//            break
//    }

    // break와 동일한 기능의 사용법 JUMP
    run {
        numbers.forEach { number ->
            if(number == 2)
                return@run
        }
    }

    // continue와 동일한 기능의 사용법 JUMP
    numbers.forEach { number ->
        if(number == 2)
            return@forEach
    }

}


// 1.
// JUMP 기법을 사용하면 스트림의 forEach 내에서 break와 continue를 사용할 수 있으나
// 가독성있고 보편적인 코드를 위해
// 웬만하면 전통적인 for문이나 forEach문을 사용하도록 한다.