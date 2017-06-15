/**
 * Created by ahmad on 08/06/17. Welcome Kotlin
 */


fun main(args:Array<String>){

    print("Enter name :")
    var name = readLine()
    print("Enter Age :")
    /**
     * readLine()!!.toInt() means we make sure this value is not null
     * */
    var age:Int= readLine()!!.toInt()
    print("Enter Dep :")
    var dep = readLine()
    println("***** output *****")
    println("your name :" + name)
    println("your Age :" + age)
    print("your Dep :" + dep)











}