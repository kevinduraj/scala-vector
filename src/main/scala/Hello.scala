import scala.io.Source
import java.io.InputStream

object Hello {

  def main(args: Array[String]): Unit = {

    println("Loading Data to Vector")
    //val vector: Vector[String] = Source.fromFile("/resources/test.txt").getLines.toVector

    val stream : InputStream = getClass.getResourceAsStream("/test.txt")
    val vector = scala.io.Source.fromInputStream( stream ).getLines.toVector

    println(vector.mkString("|"))

  }

}
