import scala.io.Source
import java.io.InputStream

object Hello {

  def main(args: Array[String]): Unit = {

    fromFile

  }

  def fromFile: Unit = {
    println("Loading Data from file to Vector")

    val vector: Vector[String] = Source.fromFile("src/main/resource/test.txt").getLines.toVector
    println(vector.mkString("|"))
  }

  def stream: Unit = {
    println("Loading Data from stream to Vector")
    val stream: InputStream = getClass.getResourceAsStream("/src/main/resource/test.txt")
    val vector = scala.io.Source.fromInputStream(stream).getLines.toVector
    println(vector.mkString("|"))
  }
}
