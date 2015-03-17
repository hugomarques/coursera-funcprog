import week02.Rational
object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.subtract(y).subtract(z)

  y.add(y)

}