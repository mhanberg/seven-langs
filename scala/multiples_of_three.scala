object Main {
  def multiplesOfThree(sum: Int, count: Int): Int = count match {
    case count if (count % 3) == 0 => sum + count
    case count if (count % 5) == 0 => sum + count
    case _ => sum
  }

  def main(args: Array[String]) {
    val result = Range(1, 1000).foldLeft(0)(multiplesOfThree)

    println(result)
  }
}
