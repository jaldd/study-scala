object DataType {

  def main(args: Array[String]): Unit = {

    val byte: Byte = 1;

    println(byte)

    def uf(): Unit = {
      println("unit")
    }

    println(uf())

    val a: Unit = uf()
    println(a)

    def nothing(n: Int): Nothing = {

      throw new NullPointerException();
    }

//    var b = nothing(0)
//    println(b)

    def nothing2(n: Int): Int = {
      if (n == 0) {

        throw new NullPointerException();
      } else {
        return n
      }
    }
    val c = nothing2(1)
    println(c)
  }

}
