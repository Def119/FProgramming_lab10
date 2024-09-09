// class Rational(n: Int, d: Int) {
//   require(d != 0, "Denominator must be non-zero")

//   private val g = gcd(n.abs, d.abs)
//   val numer: Int = n / g
//   val denom: Int = d / g

//   // neg method
//   def neg: Rational = new Rational(-numer, denom)

//   def this(n: Int) = this(n, 1) 

//   override def toString: String = s"$numer/$denom" 
//   //to override the deafulat printing way of the class

// //   GCD fucntion
//   private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
// }

// @main def main()={
//     val x = new Rational(3, 4);
//     println(x.neg)
//     val y = new Rational(12, 4);
//     println(y.neg)
// }


