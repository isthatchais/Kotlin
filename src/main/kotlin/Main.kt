import java.util.*

fun main(args: Array<String>) {

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

    var command: String = "y"

    fun account(){

        println("which account would you like to work with?")
        println("Enter 'c' for checking or 's' for savings or 'q' to save and quit")
        command = reader.next()
        command = command.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
    }

    var h1 = AccountHolder(u1fname, u1lname, u1id, 0.0, 0.0)
    var a1 = 0
    if (accountHolders.contains(u1)){
        var a1 = accountHolders.indexOf(u1)
        var h1 = accountHolders[a1]
    }

    while(command != "q") {
        account()

        if (command == "c") {

            println("you selected Checking.")
            println("Current balance: $ %.2f".format(h1.c1.balance))
            var nextCommand: String = "y"

            fun checking() {
                println("Enter 'd' for deposit, 'w' for withdrawal, 'b' to check your balance, or 'q' to quit")
                nextCommand = reader.next()
                nextCommand =
                    nextCommand.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
            }

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
            if (a1 == 0){
                accountHolders.add(h1)
            }
            else{
                accountHolders[a1] = h1
            }
        }
        else if (command == "s") {

            println("you selected Savings.")
            println("Current balance: $ %.2f".format(h1.s1.balance))
            var nextCommand: String = "y"

            fun savings() {
                println("Enter 'd' for deposit, 'w' for withdrawal, 'b' to check your balance, or 'q' to quit")
                nextCommand = reader.next()
                nextCommand =
                    nextCommand.replaceFirstChar { if (it.isTitleCase()) it.lowercase(Locale.getDefault()) else it.toString() }
            }

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

