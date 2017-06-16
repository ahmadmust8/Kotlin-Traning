/**
 * Created by ahmad on 17/06/17.
 */

fun main(args:Array<String>){

    if (true){
        println("Something!")
    }


    if (5 >= 6){
        println(5)
    }else{
        println("nothing")
    }

    // in this if statement one block will be execute
    if (false){
        println(false)
    }else if (true){
        println(true) // just this one will executed
    }else if (true){
        println("true 2")
    }else{
        println("the last else 1")
    }


    // this is another kind of If statement in variables
    var str:String = "Ahmad"
    //               |     the condition       |    true     |  or  | put this value in [name].
    var name:String = if (str.equals("Ahmad")) "it's me (:* "  else       "it's not me!"
    println(name)

    // another example
    var num:Int = 10
    var num2:Int = 5
    //            | the condition |s = num | or   | s = num2
    var s : Int = if (num > num2)    num     else   num2
    println(s)


}
