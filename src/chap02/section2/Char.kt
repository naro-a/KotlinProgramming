package chap02.section2

fun main() {
    val ch = 'c'
    val ch2: Char  //변수를 선언만 한 경우 자료형을 반드시 명시

    val ch3 = 'A'
    println(ch3 + 1)  //B

    //val chNum: Char = 65  //숫자를 사용해 선언하는 것 금지

    val code: Int = 65
    val chFromCode: Char = code.toChar()  //code에 해당하는 문자 할당. 정수 자료형 이용하여 문자 자료형 선언
    println(chFromCode)

    //val ch4: Char = 'ab'  //2개 이상의 문자는 담을 수 없음

    val ch4 = '\uD55C'  //유니코드 표기법 '한', 이스케이프 문자\u 와 16진수 4자리를 이용해 문자 표현
    println(ch4)
}