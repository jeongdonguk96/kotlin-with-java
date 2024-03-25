package lec19_그외

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

    val apples = filterFruits(fruits, isApple)
    for (apple in apples) {
        println(apple)
    }

}

val isApple: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name === "사과" }

// typealias 사용
typealias FruitFiler = (Fruit) -> Boolean
typealias USPKCMap = Map<String, UltraSuperPowerKingClass>

private fun filterFruits(
    fruits: List<Fruit>, filter: FruitFiler
): List<Fruit> {
    return fruits.filter(filter)
}

data class UltraSuperPowerKingClass(
    val name: String
)