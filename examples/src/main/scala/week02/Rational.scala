package week02

/**
 * Created by hugomarques on 16/3/15.
 */
class Rational(x:Int, y:Int) {

  private def gcd(a:Int, b:Int): Int = if (b == 0) a else gcd(b , a%b)
  private val g= gcd(x, y)

  def num = x /g
  def denom = y /g

  def add(that:Rational) =
    new Rational(num * that.denom + that.num * denom, denom*that.denom)

  def subtract(that:Rational) = add(that.neg())

  def neg () = new Rational(-1 * num, denom)

  override def toString() =
    num + "/" + denom
}
