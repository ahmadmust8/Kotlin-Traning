/**
 * Created by ahmad on 19/06/17.
 */

/**
 * When Expression
 * {@code when} is an expression in kotlin
 * an expression can be used as part of another expression.
 */

fun main(args:Array<String>){

    // for example
    val i : Int = 5
    //
    val x = when(i){ 45-> 4 else-> 5}

    print("Enter Number : ")
    var num = readLine()?.toLong()
    // the when statement in Kotlin is like S
    when(num){

        55525255585->
                println("Zero")

        55858555555->
                println("One")

        100000000000->
                println("Tow")

        2123123112313212->
                println("Hello Ahmad, how it's going?")

        else->
                println("Other Number....")

    }
}