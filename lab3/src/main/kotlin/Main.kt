data class Figure(val width: Int, val height: Int, private var _area: Int = 0) {
    val area: Int
        get() = _area

    private fun calculateArea() {
        _area = width * height
    }

    init {
        calculateArea()
    }
}
//Создал список из дата классов Figure и пересчитал общую сумму полей area в цикле
fun main() {
    val figures = listOf(
        Figure(3, 4),
        Figure(5, 6),
        Figure(7, 8)
    )

    var totalArea = 0
    for (figure in figures) {
        totalArea += figure.area
    }
    println("Total area: $totalArea")

    sealed class Shape
    data class Rectangle(val width: Int, val height: Int) : Shape()
    data class Oval(val width: Int, val height: Int) : Shape()
    data class Line(val length: Int) : Shape()

    val shapes = listOf(
        Rectangle(3, 4),
        Oval(5, 6),
        Line(7)
    )

    // используем фильты
    val rectanglesFilter = shapes.filterIsInstance<Rectangle>()
    val ovalsFilter = shapes.filterIsInstance<Oval>()
    val linesFilter = shapes.filterIsInstance<Line>()
    println("Filter results: rectangles=${rectanglesFilter.size}, ovals=${ovalsFilter.size}, lines=${linesFilter.size}")

  
    var rectangles = 0
    var ovals = 0
    var lines = 0
    for (shape in shapes) {
        when (shape) {
            is Rectangle -> rectangles++
            is Oval -> ovals++
            is Line -> lines++
        }
    }
    println("When results: rectangles=$rectangles, ovals=$ovals, lines=$lines")
}

