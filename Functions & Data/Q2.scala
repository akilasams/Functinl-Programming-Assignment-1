object Q2 extends App {

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println("x :"+x)
  println("x :"+y)
  println("x :"+z)

  val ans = x-y-z

  println("x-y-z :"+ans)
}

class Rational(n:Int,d:Int){

  require(d>0, " d must be greater than 0")

  def gcd(a:Int,b:Int):Int={
    val p = {if(a<0) -a else a}
    if (b==0) a else this.gcd(b,p%b)
  }
  
  def numer = n/gcd(n,d)
  def denom= d/gcd(n,d)

  def neg=new Rational(-this.numer,this.denom)

  def +(that:Rational) = new Rational(this.numer * that.denom + this.denom * that.numer , this.denom * that.denom)

  def -(that:Rational) = new Rational(this.numer * that.denom - this.denom * that.numer , this.denom * that.denom)

  override def toString=numer+"/"+denom

}
