object Addition extends App{
    def sum(n:Int,s:Int=0):Int = n match{
        case 0 => s;
        case _ => sum((n-1),(n+s))
    }

    print(sum(5));
}
