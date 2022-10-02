import java.util.*


open class User (fName: String, lName: String, id: Int){

    var firstName = fName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var lastName = lName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var userId = id


    fun printUser() {

        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("User Id: $userId")

    }


}