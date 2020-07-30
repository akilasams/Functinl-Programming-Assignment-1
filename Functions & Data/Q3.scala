object Q3 extends App {

  var bankAcc1 = new Account("967842207V",9273417,50000)
  println(" Account details [NIC : Account Number : Balance] ->"+bankAcc1)

  var bankAcc2 = new Account("987645234V",9700907,70000)
  println(" Account details [NIC : Account Number : Balance] ->"+bankAcc2)

  var transaction = bankAcc1.transfer(bankAcc2,10000)

  println(" Account details of after the money transfer [NIC : Account Number : Balance] ->"+bankAcc1)
  println(" Account details of after the money transfer [NIC : Account Number : Balance] ->"+bankAcc2)

}

class Account(p:String,q:Int,r:Double){

  var nic:String = p
  var accNumber:Int = q
  var balance:Double = r

  override def toString= nic + " : "+accNumber+" : "+balance

  def withdraw(a:Double)={this.balance -= a}

  def deposit(a:Double)={this.balance += a}

  def transfer(a:Account, b:Double)={
    this.balance -= b
    a.balance += b
  }
}
