class AccountHolder(fName: String, lName: String, id: Int, balancec: Double, balances: Double) : User(fName, lName, id){
    var c1 = Checking(balancec)

    var s1 = Savings(balances)

}