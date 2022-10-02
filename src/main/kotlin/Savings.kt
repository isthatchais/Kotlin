open class Savings (balance: Double) {

    open var balance = balance

    open fun balance(){

        println("Current savings balance: $ %.2f".format(balance))

    }

    fun deposit(deposit: Double){

        balance += deposit
        balance()
    }

    fun withdrawal(withdrawal: Double){

        balance -= withdrawal
        balance()

    }

}