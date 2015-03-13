package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Pascal triangle
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (r == 0 && c == 0) 1 //my solution, usual solution is if c == 0 || c == r for first and last column
    else if (r == 0) 0
    else pascal(c, r-1) + pascal(c-1, r-1);

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = ???

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
