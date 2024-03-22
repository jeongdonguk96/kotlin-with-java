package lec17_람다

import com.lannstark.lec17.Fruit

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_100),
        Fruit("사과", 1_200),
        Fruit("사과", 1_300),
        Fruit("사과", 1_400),
        Fruit("사과", 1_500),
        Fruit("바나나", 2_900),
        Fruit("바나나", 3_300),
        Fruit("바나나", 3_000),
        Fruit("수박", 10_000),
        Fruit("수박", 11_000),
    )

    // 함수를 호출하는 방법
    println(isApple(fruits[0]))
    println(isApple2.invoke(fruits[0]))
    val filteredFruits = filterFruits(fruits, isApple)

    for (fruit in filteredFruits) {
        println("과일은 ${fruit.name}이고 가격은 ${fruit.price}다.")
    }


}

// (Fruit) -> Boolean: Fruit을 받아 Boolean을 반환한다.
// 익명 함수를 이용한 람다
val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name === "사과"
}

// 화살표를 이용한 람다
val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name === "사과" }

// 매개변수에 함수를 넣을 수 있다.
private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {

    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}


