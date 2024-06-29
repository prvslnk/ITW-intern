// 3. Interface Implementation:
Create an interface Drawable with a method drawInfo. Implement this interface in two classes Square and Triangle and print the info about the shapes.

interface Drawable {
    fun drawInfo()
}

class Square(private val side: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side $side")
    }
}

class Triangle(private val base: Double, private val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
    }
}

fun main() {
    val shapes: List<Drawable> = listOf(Square(4.0), Triangle(5.0, 8.0))

    for (shape in shapes) {
        shape.drawInfo()
    }
}