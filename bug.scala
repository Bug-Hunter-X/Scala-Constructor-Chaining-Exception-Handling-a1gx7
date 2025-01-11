```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val myInstance = new MyClass("42")
```