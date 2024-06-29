//  2. Inheritance and Polymorphism:
Create an abstract class Shape with an abstract method area. Create two subclasses Rectangle and Circle that implement the area method. Add another method perimeter in both subclasses and demonstrate polymorphism.

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.141 * radius * radius
    }
}

fun main() {
    val shapes: List<Shape> = listOf(Rectangle(5.0, 10.0), Circle(7.0))

    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}