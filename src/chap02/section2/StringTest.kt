package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    //String의 경우  힙 영역의 String Pool이라는 공간에 문자열을 저장해 둔 후, 스택에 해당 주소값을 참조하도록 만든다.
    //참조 비교 연산자 === 통해 확인
    println("str1 === str2: ${str1 === str2}") //false
    println("str1 === str3: ${str1 === str3}")  //true

    //변수 값이나 표현식 문자열 안에 넣어 출력하기
    var a =1
    val s1 = "a is $a"  //String 자료형의 s1을 선언하고 초기화. 변수 a가 사용됨.

    val str4 = "a = $a"  //문자열에 변수 값 사용할 때 $ 사용
    val str5 = "a = ${a + 2}"  //문자열에 표현식 사용할 때 중괄호({}) 사용

    println("str4: \"$str4\" , str5: \"$str5\"")   //이스케이프 문자 \을 사용해 큰 따옴표(")를 문자열안에 표현

    val special = "\"hello\", I have \$15"
    println(special)  //"hello", I have $15

    val special2 = "${'"'}${'$'}9.99${'"'}"  //${''} 이용해 큰따옴표나 $ 기호 표현하기, "$9.99"
    println(special2)
}