import scala.annotation.tailrec

object tailrecurssion {

  /**
   * Not optimized
   * @param n
   * @return
   */
  def factorial(n:Int): Int =
    if (n==0) 1 else n * factorial(n-1)

  /**
   * Optimized in space use.
   * @param n
   * @return
   */
  def factorialTail(n:Int): Int = {
    def loop(n:Int, accumulator:Int): Int =
      if (accumulator == 0) accumulator
      else loop(n-1, accumulator*n)
    loop(n,1)
  }

  def fibonacci(n:Int): Int =
    if (n == 1 || n == 0) 1 else fibonacci(n-2) + fibonacci(n-1 )

  factorialTail(4)
  factorialTail(5)

  fibonacci(0)
  fibonacci(1)
  fibonacci(2)
  fibonacci(3)
  fibonacci(4)
  fibonacci(5)

}