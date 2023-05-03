data class Figure(val width: Int, val height: Int) {
    private var _area: Int = width*height

    val area: Int
        get() = _area
        private set(value) {
            _area = value
        }

}


enum class ShapeType {
    data class R
    Rectangle, Oval, Line
}

sealed class Shape
    data class Rectangle(val width: Int, val height: Int) : Shape()
    data class Oval(val radiusX: Int, val radiusY: Int) : Shape()
    data class Line(val length: Int) : Shape()
    abstract fun draw()


fun main() {
    val figures = listOf(
        Figure(2, 3),
        Figure(4, 7),
        Figure(11, 3)

    )

    var totalArea = 0
    for (figure in figures) {
        totalArea += figure.area
    }
    println("Total area : $totalArea")

    val shapes = listOf(
        Shape.Rectangle(),
        Shape.Oval(),
        Shape.Line(),
        Shape.Rectangle(),
        Shape.Oval()
    )

    var rectangleCount = 0
    var ovalCount = 0
    var lineCount = 0
    for (shape in shapes) {
        when (shape) {
            is Shape.Rectangle -> rectangleCount++
            is Shape.Oval -> ovalCount++
            is Shape.Line -> lineCount++
        }
    }
    println("Number of Rectangle instances: $rectangleCount")
    println("Number of Oval instances: $ovalCount")
    println("Number of Line instances: $lineCount")
}
