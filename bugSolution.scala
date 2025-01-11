```scala
class MyClass(val x: Int) {
  def this(s: String) = try {
    this(s.toInt)
  } catch {
    case e: NumberFormatException =>
      println("Invalid input string. Using default value.")
      this(0) // Or some other default value
  }
}

val myInstance = new MyClass("42")
val myInstance2 = new MyClass("abc") // This will now handle the exception gracefully
```