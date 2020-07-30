object Q4 extends App {

  var bankAcc1 = new bankAccount("967842207V",9000011,50000)
  var bankAcc2 = new bankAccount("978463272V",9000012,15000)
  var bankAcc3 = new bankAccount("904657297V",9000013,-16.10)
  var bankAcc4 = new bankAccount("938402849V",9000014,4500.60)
  var bankAcc5 = new bankAccount("973637200V",9000015,-10.50)
  var bankAcc6 = new bankAccount("982163536V",9000016,-64.90)

  val bank:List[bankAccount]=List[bankAccount](bankAcc1,bankAcc2,bankAcc3,bankAcc4,bankAcc5,bankAcc6)

  val find =(id:String,bank:List[bankAccount])=>bank.filter(ac=>ac.nic.equals(id))
  val overdraft=(bank:List[bankAccount])=>bank.filter((ac=>ac.balance<0))
  val balance=(bank:List[bankAccount])=>bank.reduce((ac1,ac2)=> new bankAccount(ac1.nic,ac1.accNumber,ac1.balance + ac2.balance))
  val interest = (bank:List[bankAccount])=>bank.map(ac=>if(ac.balance>0) ac.balance*1.05 else ac.balance*1.1)

  println("List of Negative Balance :"+ overdraft(bank))
  println("Sum Of All Account Balance Rs:"+ balance(bank).balance)
  println("Final Balance of all accounts after apply the interest:"+interest(bank))


}

class bankAccount(p:String,q:Int,r:Double){

  var nic:String = p
  var accNumber:Int = q
  var balance:Double = r

  override def toString= nic + " : "+accNumber+" : "+balance

}
