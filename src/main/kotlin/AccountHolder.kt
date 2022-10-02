/*
This account holder class inherits from the user class and gives the account holder a checking and savings account.
it creates an account holder object
 */

class AccountHolder(fName: String, lName: String, id: Int, balancec: Double, balances: Double) : User(fName, lName, id){
    var c1 = Checking(balancec)

    var s1 = Savings(balances)

}