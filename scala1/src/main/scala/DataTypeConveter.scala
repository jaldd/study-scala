object DataTypeConveter {
  def main(args: Array[String]): Unit = {

    val a1: Byte = 10
    val b1: Long = 2353L
    var result: Long = a1 + b1
    var result1: Int = (a1 + b1).toInt

    val a2: Byte = 10
    val b2: Int = a2

    val c2: Byte = b2.toByte

    val a3: Byte = 10
    val b3: Char = 'b'
    val c3: Byte = b3.toByte
    val c33: Int = b3

    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'

    val result4 = a4 + b4
    val result44 = a4 + b4 + c4
    println(result4)
    println(result44)


    val n1: Int = 2.5.toInt
    println(n1)

    val n2: Int = (2.6 + 3.7.toInt).toInt
    println(n2)

    val n3: Int = 130
    val b: Byte = n3.toByte
    println(b)

    val result2: Int = 10 / 3
    println(result2)
    val result3: Double = 10 / 3
    println(result3)
    val result5: Double = 10.0 / 3
    println(result5)

    val s1: String = "hello"
    val s2: String = new String("hello")
    val isEqual = s1 == s2;
    println(isEqual)
    println(s1.equals(s2))
    println(s1.eq(s2))

    def m(n: Int): Int = {
      println("m")
      return n
    }

    val n = 1
    println((4 > 5) && m(n) > 0)
    println((6 > 5) && m(n) > 0)

    def isNotEmpty(str: String): Boolean = {
      return str != null && !("".equals(str.trim))
    }

    println(isNotEmpty(null))
  }
}
