package lec13_중첩클래스

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 내부 클래스는 별도의 지시자 없이 내부에 작성한다.
    class LivingRoom(
        private val area: Double
    )
}

// 1.
// 자바에서 사용하는 중첩클래스는 주로 클래스 내부에 static 키워드를 가진 클래스를 가지는데
// 코틀린에서는 내부에 별도의 키워드 없이 class만 사용한다.