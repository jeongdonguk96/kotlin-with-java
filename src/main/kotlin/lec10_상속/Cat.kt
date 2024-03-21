package lec10_상속

// 상속 시 extends를 사용하지 않고 콜론을 사용한다.
class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 걸어갑니다.")
    }
}