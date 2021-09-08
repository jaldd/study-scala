object TestVariable {

  def main(args: Array[String]): Unit = {

    var a: Int = 10
    var a1 = 10
    val b = 1
    a = 2


    val ldd = new Student("ldd", 18)
    //    ldd.age = 19
    ldd.printInfo()

    val name = "ldd"
    val age = 17
    printf(name * 3)
    println()
    printf("%s name is %d 了", name, age)
    println()
    printf(s"${name} name is ${age} 了")
    println()

    var numd: Double = 1.21
    var numf: Float = 1.21f
    println(s"num ： ${numd}")
    println(f"num ： ${numd}%2.2f")
    println(raw"num ： ${numd}%2.2f")


    var str =
      """
        |a
        |换行
        |b""".stripMargin
    println(str)
  }

}
