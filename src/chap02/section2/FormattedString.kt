package chap02.section2

//자료형에 별명 붙이기(can’t be nested inside a class, object, interface, or other code block)
//변수의 자료형이 복잡할 때 주로 사용
typealias Username = String  //String을 Username이라는 별명으로 대체

fun main() {
    val num = 10

    //"""기호를 사용해 줄바꿈, 공백까지 모두 출력
    val formattedString = """
        var a = 6
        var b = "Kotlin
        println(a + $num)
        """
    println(formattedString)

    //자료형에 별명 붙이기
    val user: Username = "Kildong"
}