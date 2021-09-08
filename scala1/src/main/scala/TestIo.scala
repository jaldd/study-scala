import java.io.{File, PrintWriter}
import scala.io.Source

object TestIo {

  def main(args: Array[String]): Unit = {
    Source.fromFile("scala1\\src\\main\\resources\\test.txt").foreach(print);
    val writer=new PrintWriter(new File("scala1\\src\\main\\resources\\out.txt"))
    writer.write("hello")
    writer.close()
  }
}
