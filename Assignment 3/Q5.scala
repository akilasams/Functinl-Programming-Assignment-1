object OddEven extends App{
    def isEven(n:Int):Boolean = n match{
        case 0 => true;
        case _ => isOdd(n-1);
    }

    def isOdd(n:Int):Boolean={!(isEven(n));}

    def addEven(n:Int,s:Int=0):Any=n match{
        case 0 => s;
        case x if (isEven(x)) => addEven((x-1),(x+s));
        case _ => addEven((n-1),s);
    }

    print(addEven(10));
}
