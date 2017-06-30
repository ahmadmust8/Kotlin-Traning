/**
 * Created by ahmad on 29/06/17.
 */

fun main(args : Array<String>){

}

// this function has a "block body".
fun max(num : Int , num2 : Int) : Int {
    return if(num > num2) num else num2
}

// this function has an "expression body".
fun min(num: Int , num2 : Int) : Int = if(num < num2) num else num2


fun printAfgs(word : String) : String = when(word){ "Ahmad" -> word + " Hello" else -> word }

// we can remove "return type" because {@Code when} is an Expression in Kotlin
fun printAfgs1(word : String) = when(word){ "Ahmad" -> word + " Hello" else -> word }