object CaesarCipher extends App{
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ" //The alphabet we use to encrypt and decrypt

  print("Enter the Shift : ") //Enter the number of shifts we want to shift it down or up in the alphabet
  val size=alphabet.size
  val shift=(scala.io.StdIn.readInt()+size)%size

  print("Enter Message : ") //Enter the Text you want to Encrypt or Decrypt
  val message=scala.io.StdIn.readLine()

  //Output
  val outputmsg=message.map((c:Char)=>{
    val x=alphabet.indexOf(c.toUpper)
    if(x == -1){ //If c is not found in the alphabet we leave it as it is
      c
    }else{ //If c is found we encrypt it
      alphabet((x+shift)%size) //if (x+shift) exceeds the size of alphabet
    }
  })

  print(outputmsg)
}
