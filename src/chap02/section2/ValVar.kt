package chap02.section2

fun main() {
    val number = 10 //Int형으로 추론. 값 변경 불가.
    var language = "Korean" //String으로 추론. 값 변경 가능.
    val secondNumber: Int = 20  //Int형으로 명시적 지정
    language = "English"  //var 키워드로 선언한 변수 값 다시 할당 가능

    //var test  //자료형을 지정하지 않은 변수는 추론할 값을 꼭 지정해야 사용 가능.

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}