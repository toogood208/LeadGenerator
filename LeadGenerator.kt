class LeadGenerator {
    // this class randomly generate Nigerian phone numbers for cold calling

    // a method to randomly choose number codes i.e 0803,0802 etc
    private fun generateRandomPhoneNumberCode():String{

        val phoneCode:Array<String> = arrayOf("0803","0703","0903","0813","0810","0814","0816","0806",
        "0805","0705","0905","0807","0815","0811","0905", "0809","0909","0807","0815","0811","0905",
        "0802","0902","0701","0808","0708","0812")

        val randomNum = (Math.random() * phoneCode.size).toInt()
        return phoneCode[randomNum]

    }

    // a method to generate the first three didgit
    private fun generateThreeDigitNumber(): Int {
        val minValue = 100
        val maxValue = 999

        return minValue + (Math.random() * (maxValue - minValue)).toInt()
    }

    // a method to generate the last three digit
    private fun generateFourDigitNumber():Int{

        val minValue = 1000
        val maxValue = 9999

        return minValue + (Math.random() * (maxValue - minValue)).toInt()


    }

    // a method to compile result and pass them to a array list
    fun compileResult(howManyNumbers:Int){

        // pass a mutable set to remove duplicates
        val amount = mutableSetOf<String>()


        // loop through while adding the numbers
        for (x in 1..howManyNumbers){

            amount.add("${generateRandomPhoneNumberCode()}-" +
                    "${generateThreeDigitNumber()}-" +
                    "${generateFourDigitNumber()}")
        }
        println(amount)
    }

}


// running the project
fun main(){
    val phone = LeadGenerator()
    phone.compileResult(2)
}