package chap02.section2

fun main() {
    val num05 = 127 //Int형
    val num06 = -32768  //Int형
    val num07 = 212244321  //Int형
    val num08 = 922337720368547758  //Long형

    val exp01 = 123 //Int형
    val exp02 = 123L  //접미사 L 사용해 Long형
    val exp03 = 0x0f //접두사 0x를 사용해 16진 표기가 사용된 Int형
    val exp04 = 0b00001011 //접두사 0b를 사용해 2진 표기가 사용된 Int형

    val exp08: Byte = 127  //명시적으로 Byte형으로 지정
    val exp09 = 32767  //명시적으로 자료형 지정하지 않을 경우 Short 범위의 값도 Int형으로 추론
    val exp10: Short = 32767  //명시적으로 자료형을 지정

    //부호가 없는 정수 자료형(양수만 존재)
    //값에 식별자 사용해야 함
    val uint: UInt = 153u
    val ushort: UShort = 65234u
    val ulong: ULong = 12345678uL
    val ubyte: UByte = 123u

    //자릿값 표시할 때 사용하는 언더스코어(_)
    val number = 1_000_000
    val cardNum = 1234_5678_9012_3456L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val exp011 = 3.14  //Double형(기본)
    val exp012 = 3.14F  //Float형

    //부동소수점
    val exp11 = 3.14E-2  //왼쪽으로 소수점 2칸 이동, 0.0314, 3.14E:가수, -2:지수
    val exp12 = 3.14e2  //오른쪽으로 소수점 2칸 이동, 314, 지수의 +기호는 생략 가능

    //부동 소수점의 오차
    var num: Double = 0.1

    for(x in 0..999){
        num += 0.1
    }

    println(num)  //표현 비트의 제한으로 인해 100이 되지 않고 오차가 존재
}