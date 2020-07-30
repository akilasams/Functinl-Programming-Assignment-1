object Q1 extends App {

  val x = new RationalNum(2,3)
  println("Rationan Number x :"+x)
  println("Rational Number -x :"+x.neg)
}

class RationalNum(n:Int,d:Int){

  require(d>0, " d must be greater than 0")

  def numer = n
  def denom= d

  def neg=new RationalNum(-this.numer,this.denom)
  override def toString=numer+"/"+denom

}
