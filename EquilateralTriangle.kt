class EquilateralTriangle(_name: String) : Triangle(_name) {
    //Equilateral Triangle takes the same types of variables in Triangle

    fun setDimensions(_equalSides : Double) {
        super.setDimensions(_equalSides, _equalSides,_equalSides)
    }

    override fun printDimensions(){
        super.printDimensions()
    }

    override fun getArea(): Double {
        return super.getArea()
    }
}