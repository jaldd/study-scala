import scala.io.StdIn

object TestStdIn {

  def main(args: Array[String]): Unit = {
    println("name")
    val name=StdIn.readLine();
    println("age")
    val age=StdIn.readLine();
    println(s"${name} name ${age} age")

  }
}
