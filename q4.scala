// class Account(var balance: Double) {
//   def deposit(amount: Double): Unit = balance += amount
//   def withdraw(amount: Double): Unit = if (amount <= balance) 
//     balance -= amount else println("Insufficient funds")
//   override def toString: String = s"Balance: $balance"
// }

// object Bank {
  
//   def negativeBalances(accounts: List[Account]): List[Account] =
//     accounts.filter(_.balance < 0)

//   def totalBalance(accounts: List[Account]): Double =
//     accounts.map(_.balance).sum

//   def applyInterest(accounts: List[Account]): List[Account] =
//     accounts.map { account =>
//       if (account.balance > 0) account.deposit(account.balance * 0.05)
//       else account.deposit(-account.balance.abs * 0.1)
//       account
//     }
// }




// @main def main()={

//     val acc1 = new Account(100)
//     val acc2 = new Account(-50)
//     val acc3 = new Account(-200)
//     val acc4 = new Account(330)

//     val accounts = List(acc1, acc2, acc3, acc4)

//     println("Negative balance account: " + Bank.negativeBalances(accounts))
//     println("Total balance: " + Bank.totalBalance(accounts))

//     Bank.applyInterest(accounts)
//     accounts.foreach(acc => println(s"Final balance: ${acc.balance}"))
// }