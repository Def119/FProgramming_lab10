// class Rational(n: Int, d: Int) {
//   require(d != 0, "Denominator must be non-zero")
  
//   private val g = gcd(n.abs, d.abs)
//   val numer: Int = n / g
//   val denom: Int = d / g
  
//   def this(n: Int) = this(n, 1)

//   override def toString: String = s"$numer/$denom"

//   private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

//   // Subtract method : ADDED Q2
//   def sub(arg: Rational): Rational = new Rational(
//     numer * arg.denom - arg.numer * denom,
//     denom * arg.denom
//   )
  
// }



// @main def main()={
    
//     val x = new Rational(3, 4)
//     val y = new Rational(5, 8)
//     val z = new Rational(2, 7)

//     val result = x.sub(y).sub(z)
//     println(f"result of $x - $y - $z = " + result)

//     val result2 = y.sub(x).sub(z);
//     println(f"result of $y - $x - $z = " + result2)
// }
