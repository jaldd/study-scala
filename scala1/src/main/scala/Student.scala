class Student(name: String, age: Int) {

  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }

}

object Student {
  val school: String = "asd"

  def main(args: Array[String]): Unit = {
    new Student("ldd", 18);
  }

}
