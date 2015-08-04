import scala.io.Source
import java.io.InputStream
import scala.collection.parallel.immutable.ParVector

object Hello {

  def main(args: Array[String]): Unit = {

    parallelFromFile

  }

  def parallelFromFile: Unit = {
    println("Loading Data from file to Vector")

    val vector: ParVector[String] = Source.fromFile("src/main/resource/test.txt").getLines.toVector.par

    println(vector.mkString("|"))
  }

  def parallelFromStream: Unit = {

    println("Loading Data from stream to Vector")

    val stream: InputStream = getClass.getResourceAsStream("/src/main/resource/test.txt")
    val vector: ParVector[String] = scala.io.Source.fromInputStream(stream).getLines.toVector.par

    println(vector.mkString("|"))
  }

}
