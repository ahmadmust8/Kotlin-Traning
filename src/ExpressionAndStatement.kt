/**
 * Created by ahmad on 30/06/17.
 */

/**
 * Statements and expressions
 *
 * In Kotlin, if is an expression, not a statement. The difference between a statement
 * and an expression is that an expression has a value, which can be used as part of
 * another expression, whereas a statement is always a top-level element in its enclosing
 * block and does not have its own value. In Java, all control structures are statements.
 * In Kotlin, most control structures, except for the loops (for, do, and do/
 * while) are expressions. The ability to combine control structures with other expres-
 * sions lets you express many common patterns concisely, as you’ll see later in the book.

 * On the other hand, assignments are expressions in Java and become statements in
 * Kotlin. This helps avoid confusion between comparisons and assignments, which is
 * a common source of mistakes.
 *
 * Kotlin Expressions
 * Expression consist of Variables , operators etc.
 * that evaluates to a single value.
 *
 * Kotlin Statements
 * Statements are everything that
 * make up a complete unit execution
 * and Expressions are  part of Statements.
 *
 * Kotlin Blocks
 * A blocks is a group of Statements (zero or more)
 * that is enclosed in curly braces {}.
 */

/**
 * Q / what is the difference between Expression and Statement ?
 * A / Expression has a value and Statement does not have it's own value.
 */



// this is method is a block
fun main(args : Array<String>){

    // example for Expression
    // {@code [ 52 + 77]} is an expression
    val num1 : Int = 52 + 77
    // the { @code [if (num == 5) 55 else 4] } is an expression.
    // is assigned to {@code result}.
    val result : Int
    result = if (num1 == 5) 55 else 4

    // example Statement
    val num = 58 + 22 // the {@code 58 + 22} is a Statement.
    val mul = 2 * 6 // the {@code val mul = 2 * 6} is Statement.
    val max : Int
    max = if(mul > num) mul else num // this is a Statements.
    println("something") // this is Statements.

    if (true){ // this is block start of if.
        println("it's block")
    }// end of if block.

}// end of main method block.






