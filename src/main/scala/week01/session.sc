object session {
  def abs(x: Double) = if (x < 0 ) -x else x

  def sqrt(x:Double) = {

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)
  }

  def factorial(n:Int): Int =
    if (n==0) 1 else n * factorial(n-1)

  def fibonacci(n:Int): Int =
    if (n == 1 || n == 0) 1 else fibonacci(n-2) + fibonacci(n-1 )

  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)

  factorial(4)
  factorial(5)

  fibonacci(0)
  fibonacci(1)
  fibonacci(2)
  fibonacci(3)
  fibonacci(4)
  fibonacci(5)
}