object TakeHomeSalary extends App{
    def normalSalary(h:Int):Int=h*150;
    def otSalary(h:Int):Int=h*75;
    def totalIncome(h1:Int,h2:Int):Int=normalSalary(h1)+otSalary(h2);
    def taxAmount(i:Int):Double=i*0.1;
    def takeHomeSal(h1:Int,h2:Int):Double=totalIncome(h1,h2)-taxAmount(totalIncome(h1,h2));

    println("Take Home Salary : %f",takeHomeSal(40,20));
}
