// class Account(var balance: Double) {

//   def deposit(amount: Double): Unit = {
//     balance += amount
//   }

//   def withdraw(amount: Double): Unit = {
//     if (amount <= balance) balance -= amount else println("Insufficient funds")
//   }

//   def transfer(amount: Double, to: Account): Unit = {
//     if (amount <= balance) {
//       this.withdraw(amount)
//       to.deposit(amount)
//     } else {
//       println("Insufficient funds for transfer")
//     }
//   }

//   override def toString: String = s"Balance: $balance"
// }



// @main def main()={
    
//     val acc1 = new Account(500)
//     val acc2 = new Account(300)
//     acc1.transfer(200, acc2)

//     println(acc1) 
//     println(acc2) 

//     acc1.transfer(400,acc2)

//     print(acc1)
// }