import io.StdIn._
object CaesarCipherAssignment extends App{
  var alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //ENCRYPTION
  val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

  //DECRYPTION
  val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

  //Take Input
  var s=readLine("Enter the Message : ")
  print("Enter the Shift : ")
  var key=readInt()

  print("The Encrypted Message : ")
  val cipherText=cipher(E,s,key,alphabet)
  println(cipherText)

  print("The Decrypted Message : ")
  val plainText=cipher(D,cipherText,key,alphabet)
  println(plainText)

}
