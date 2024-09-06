import java.util.Scanner

fun main() {
    //Initialize objects in each class
    var bob = Square("Bob")
    //EquilateralTriangle IS A triangle, but a triangle is NOT ALWAYS an equilateral triangle
    var anna : Triangle = EquilateralTriangle("Anna")
    var ann  = EquilateralTriangle("Ann")
    var carol  = Circle("Carol")

    //Stored each instance into Shape variables
    var bobShape : Shape = bob
    var annaShape : Shape = anna
    var annShape : Shape = ann
    var carolShape : Shape = carol

    //Variables for the Scanner/User Input
    val reader = Scanner(System.`in`)
    var dimensionsList = arrayListOf<Double>()
    var input = 0.0

    //An array of the objects and their corresponding number of parameters for setDimensions()
    var shapes = arrayOf(Pair(bob, 2), Pair(anna, 3), Pair(ann, 1), Pair(carol, 1))

    //Loop through each shape in the array and get the dimensions from the user by
    //using a for-loop of the shape's dimension parameters
    //Then add these dimensions in another array to access later
    for (shape in shapes) {
        println("Current Shape: " + shape.first.name)
        for (i in 1..shape.second) {
            println("Please type a number for dimension $i: ")
            input = reader.nextDouble()
            dimensionsList.add(input)
        }
        println()
    }

    //Using the temporary array, call the setDimensions() function using the values in the dimensionsList.
    bob.setDimensions(dimensionsList[0], dimensionsList[1])
    anna.setDimensions(dimensionsList[2], dimensionsList[3], dimensionsList[4])
    ann.setDimensions(dimensionsList[5])
    carol.setDimensions(dimensionsList[6])


    //Print area, dimensions, and name
    println("Shapes' Summary List")
    println("----------------------")
    for (shape in shapes) {
        println("Name: " + shape.first.name)
        shape.first.printDimensions()
        println("Area: " + shape.first.getArea())
        println()
    }
}
