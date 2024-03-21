package lec10_상속

// 상속과 구현 모두 콜론을 이용한다.
class Penguin(
    species: String
) : Animal(species, 2), Swimmable, Flyable {

    private val wingCount = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

}