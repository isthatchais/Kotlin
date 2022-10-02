import java.util.*
/*
This program asks the user for a first name last name and account number than
allows them to update checking and savings account balances
 */


fun main(args: Array<String>) {

    // This block of code initializes the account holders array list and asks for users name etc and creates a user object
    var accountHolders = ArrayList<AccountHolder>()

    var reader = Scanner(System.`in`)
    println("Please enter the first name: ")
    var u1fname = reader.next()
    println("Please enter the last name: ")
    var u1lname = reader.next()
    println("Please the user ID: ")
    var u1id = reader.nextInt()
    var u1 = User(u1fname, u1lname, u1id)
    u1.printUser()

    // This initializes the command variable to use for the menu
    var command: String = "y"

    // This function asks the user if they would like to work with checking or savings account and returns a string
    fun account(){

        println("which account would you like to work with?")
        println("Enter 'c' for checking or 's' for savings or 'q' to save and quit")
        command = reader.next()
        command = command.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
    }

    //  This block of code initializes the variable for the account holder and finds it if it is already in the array list
    var h1 = AccountHolder(u1fname, u1lname, u1id, 0.0, 0.0)
    var a1 = 0
    if (accountHolders.contains(u1)){
        var a1 = accountHolders.indexOf(u1)
        var h1 = accountHolders[a1]
    }

    // This block of code runs the menu for the checking and savings accounts
    while(command != "q") {
        account()

        // this block of code runs when the user selects 'c' for checking and allows the user to update the checking account balance.
        if (command == "c") {

            println("you selected Checking.")
            println("Current balance: $ %.2f".format(h1.c1.balance))
            var nextCommand: String = "y"

            // this function asks the user what they would like to do with the checking account and returns a string.
            fun checking() {
                println("Enter 'd' for deposit, 'w' for withdrawal, 'b' to check your balance, or 'q' to quit")
                nextCommand = reader.next()
                nextCommand =
                    nextCommand.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
            }

            // this block of code runs the menu for the checking account deposit, show balance, and with draw.
            while(nextCommand != "q") {
                checking()
                if(nextCommand == "d") {
                    var deposit: Double = 0.0
                    println("Enter the amount of your deposit.")
                    deposit = reader.nextDouble()
                    h1.c1.deposit(deposit)
                }
                else if(nextCommand == "w"){
                    var withdrawal: Double = 0.0
                    println("Enter the amount of your withdrawal.")
                    withdrawal = reader.nextDouble()
                    h1.c1.withdrawal(withdrawal)
                }
                else if(nextCommand == "b"){
                    h1.c1.balance()
                }
            }

            // This block of code is to update the user information in the array
            if (a1 == 0){
                accountHolders.add(h1)
            }
            else{
                accountHolders[a1] = h1
            }
        }

        // this block of code runs when the user selects 's' for savings and allows the user to update the checking account balance.
        else if (command == "s") {

            println("you selected Savings.")
            println("Current balance: $ %.2f".format(h1.s1.balance))
            var nextCommand: String = "y"

            // This function asks the user what they would like to do with the savings account and returns a string.
            fun savings() {
                println("Enter 'd' for deposit, 'w' for withdrawal, 'b' to check your balance, or 'q' to quit")
                nextCommand = reader.next()
                nextCommand =
                    nextCommand.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
            }


            // this block of code runs the menu for the savings account deposit, show balance, and with draw.
            while(nextCommand != "q") {
                savings()
                if(nextCommand == "d") {
                    var deposit: Double = 0.0
                    println("Enter the amount of your deposit.")
                    deposit = reader.nextDouble()
                    h1.s1.deposit(deposit)
                }
                else if(nextCommand == "w"){
                    var withdrawal: Double = 0.0
                    println("Enter the amount of your withdrawal.")
                    withdrawal = reader.nextDouble()
                    h1.s1.withdrawal(withdrawal)
                }
                else if(nextCommand == "b"){
                    h1.s1.balance()
                }
            }

            // This block of code is to update the user information in the array
            if (a1 == 0){
                accountHolders.add(h1)
            }
            else{
                accountHolders[a1] = h1
            }
        }
    }

    println("Good bye")
}

