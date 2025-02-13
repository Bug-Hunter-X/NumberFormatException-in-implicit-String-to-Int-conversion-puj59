```scala
class MyClass(val x: Int) {
  def this(s: String) = try {
    this(s.toInt)
  } catch {
    case e: NumberFormatException => 
      println(s"Error converting '$s' to Int: ${e.getMessage}")
      this(0) // or handle the error appropriately
  }
}

val myObject = new MyClass("123") // Works fine
println(myObject.x) // Outputs 123

val myObject2 = new MyClass("abc") // Handles the exception
println(myObject2.x) // Outputs 0
```