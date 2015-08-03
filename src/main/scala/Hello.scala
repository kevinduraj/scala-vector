import scala.io.Source

object Hello {

  def main(args: Array[String]): Unit = {

    println("Loading Data to Vector")

    val vector: Vector[String] = Source.fromFile("/Users/kduraj/github/scala-vector/src/main/resources/test.txt").getLines.toVector
    println(vector.mkString("|"))

  }

}
