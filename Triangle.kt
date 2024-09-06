import kotlin.math.sqrt

abstract class Triangle(_name: String) : Shape(_name) {
    var sideOne : Double = 0.0
    var sideTwo : Double = 0.0
    var sideThree : Double = 0.0

    fun setDimensions(_sideOne : Double, _sideTwo : Double, _sideThree : Double) {
        sideOne = _sideOne
        sideTwo = _sideTwo
        sideThree = _sideThree
    }

    override fun printDimensions() {
        println("Side One : $sideOne, Side Two : $sideTwo, Side Three : $sideThree")
    }

    override fun getArea(): Double {
        var s = (sideOne + sideTwo + sideThree) * 0.5
        return sqrt(s* ((s - sideOne) * (s - sideTwo) * (s - sideThree)))
    }
}