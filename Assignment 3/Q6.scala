object Fibonacci extends App{
    def fib(n:Int):Int=n match{
        case x if x==0 => 0;
        case x if x==1 => 1;
        case x => fib(x-1)+fib(x-2);
    }

    def printFib(n:Int,i:Int=0):Unit = {
        if(i==n){
            printf("%d ",fib(i));
            return;
        }
        if(i<n){
            printf("%d ",fib(i));
        }
        printFib(n,i+1);
    }
    printFib(5);
}
