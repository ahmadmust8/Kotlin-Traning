fun main(args:Array<String>){

    //Byte varaibles
    var s:Byte = 45
    println("Byte" + s)

    // Integer varaibles
    var ids:Int = 25
    var ids1 = 25

    // Char varaibles
    var ch:Char = 'f'
    var ch1 = 'f'

    // Float varaibles
    var fl3:Float = 66f
    var fl1 = 82.5f

    //Short varaibles
    var sh:Short = 55

    //Double varaibles
    var d1:Double = 55.0
    var d2 = 25.2

    // Long varaibles
    var l1:Long = 55L
    var l2 = 55L

    val ddf:String
    ddf = "dd"
    // to get data type name
    println(ddf.javaClass.name)

    /**
     * numbers format and fraction
     */

    // the underscore in this number is to make this number readable for you.
    var num:Int = 1_000_000_000

    // you have to convert one of this numbers to double.
    var num2:Double = 52552 / 545.0
    var num3:Double = 52552 / 545.toDouble()

    // we use format when want for example tow decimal numbers after the value.
    // like this as you want.
    println("%.0f".format(num3)) // it will prints 96
    println("%.1f".format(num3)) // it will prints 96.4
    println("%.2f".format(num3)) // it will prints 96.43
    println("%.3f".format(num3)) // it will prints 96.435














}