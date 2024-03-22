package lec12_Object키워드

import com.lannstark.lec12.Movable

fun main() {
    moveSomething(object : Movable {
        override fun fly() {
            println("날아가요")
        }

        override fun move() {
            println("걸어가요")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}