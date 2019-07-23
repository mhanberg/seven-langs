object Main {
  def fib(a: Int, b: Int, sum: Int): Int = a match {
    case a if a > 4000000 => sum
    case a if a % 2 == 0 => fib(b, b + a, sum + a)
    case _ => fib(b, b + a, sum)
  }

  def main(args: Array[String]) {
    val result = fib(1, 2, 0)

    println(result)
  }
}
