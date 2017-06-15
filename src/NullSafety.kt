

fun main (args:Array<String>){

    /**
     * Null Safety in kotlin.
     *
     * the Question mark [ ? ] after var name and type means this Variable maybe have value or not.
     *
     * the double Exclamation marks [ !! ] in var [ F ] value means this Variable have to have value
     * if the value for this Variable is null
     * throw KotlinNullPointerException.
    */
    var name0:String? = null
    var f = name0!!.length // this line of code will causes KotlinNullPointerException.

   // println(f)// the output will be KotlinNullPointerException.

    name0 = "try now?"
    f = name0!!.length

    println(f)// the output will be 8 because the [name0] has new value.


    /**
     * the Question  mark in Variable [ i ]'s value we called "Secure Code"
     * that means if the value of this Variable has value return that value
     * or return null.
     *
     * and Variable [ i ] must be has Question mark after it's type
     * because it's also maybe has null value or not
     *
     * we can also initial Variable [ i ] like this { var i = name2?.length }
     */

    var name2:String? = null
    var i:Int? = name2?.length

    println(i)// Here Variable [i] will prints  "null"

    name2 = "something"
    println(i)  // Here will prints [9] because  [name2] reassignment.

    // what is the difference between this tow Variables [ num & num2 ] ?
    var some:String? =null

    var num:Int? = some?.length // this line of code will returns "null".

    var num2:Int = some!!.length // this line of code will causes KotlinNullPointerException.

    // done.
}