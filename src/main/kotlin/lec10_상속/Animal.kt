package lec10_상속

abstract class Animal (
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}