package lec14_다양한클래스

fun main() {
    handleCountry(Country.KOREA)
}

fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA -> println("한국입니다.")
        Country.AMERICA -> println("미국입니다.")
    }
}

// 코틀린의 enum 클래스
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}