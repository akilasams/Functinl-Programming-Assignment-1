import scala.math.sqrt

object  MyApp extends App{
  val p1=Point(4,5);
  val p2=Point(2,6);

  print("p1 : ");
  println(p1);

  print("p1 : ");
  println(p2);

  val sumPoint=p1+p2;
  print("Sum : ");
  println(sumPoint);

  val movedP1=p1.move(3,6);
  print("Moved P1 : ");
  println(movedP1);

  val distance = p1.distance(p2);
  print("Distance Between P1 & P2 : ");
  println(distance);

  val invertedP2 = p2.invert();
  print("Inverted P2 : ");
  println(invertedP2);
}

case class Point(a:Int,b:Int){
  def x: Int = a;
  def y: Int = b;

  def +(that:Point)=Point(this.x+that.x,this.y+that.y);
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);
  def distance(p:Point)=sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
  def invert()=Point(this.y,this.x);

}
