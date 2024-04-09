import kotlin.math.*

fun main(){
    val greetFunction:(String) -> Unit = {name:String -> println("Welcome $name")}

    greetFunction("My dogie")

    val circleAreaPow: (Double) -> Unit = { x: Double -> println ("The area is ${(x.pow( 2.0) * Math.PI)}, another pow solution") }

    val circleArea: (Double) -> Unit = { x: Double -> println ("The area is ${(Math.pow(x, 2.0) * Math.PI)}") }

    val circleAreaInt: (Int) -> Unit = {x: Int -> println("The area is ${((x*x) * Math.PI)}, this is the integer solution")}

    circleAreaInt (20)
    circleArea (20.0)
    circleAreaPow (20.0)

    val eqTriangleRec: (Double) -> Unit = { x: Double -> println("The area of the Triangle is: ${(sqrt(3.0)/4)*(x*x)}")}

    //eqTriangle()
    eqTriangleRec(reqPar())
    val dodecahedron: (Double) -> Unit = { x: Double -> println("The area of a Dodecahedron is : ${(sqrt((25 + 10 * sqrt(5.0)))*3) * (x*x)}")}
    dodecahedron(reqPar())

    val pentagon: (Double) -> Unit = {x: Double -> println("The area of a pentagon is: ${
        ((x * x) * (sqrt(
            25 + (10 * sqrt(
                5.0
            ))
        ))) / 4
    }")}
    pentagon(reqPar())
}
fun reqPar (): Double{
    println("Enter the side of the geometric figure")
    val x = readln().toDouble()
    return x
}

