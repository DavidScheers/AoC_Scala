object Main {

  def main(args: Array[String]): Unit = {
    runDay1()
  }

  def runDay1(): Unit = {
    val day1 = new Day1()
    val allInts = readLines("input.txt")
      .map(line => line.toInt)

    day1.run1(allInts).foreach(result => println(result))
    day1.run2(allInts).foreach(result => println(result))
  }

  def readLines(fileName: String): Seq[String] = {
    val bufferedSource = scala.io.Source.fromResource(fileName)
    val lines = bufferedSource.getLines().toSeq
    bufferedSource.close()
    lines
  }

}
