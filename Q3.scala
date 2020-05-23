object Book extends App{
    def wholesaleprice(x:Int)=((24.95*x)-(24.95*x)*0.4)+3+((x-50)*0.75);
    println(wholesaleprice(60));
}
