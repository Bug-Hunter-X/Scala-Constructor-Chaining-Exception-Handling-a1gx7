# Scala Constructor Chaining Exception Handling

This repository demonstrates a common, yet subtle, error in Scala related to constructor chaining and exception handling. The `MyClass` constructor attempts to handle a String input by converting it to an integer. However, it fails to gracefully handle cases where the conversion is not possible (e.g., non-numeric input).

## Bug Description

The primary constructor of `MyClass` expects an integer. The secondary constructor aims to create an instance from a String, attempting to parse the string into an integer using `toInt`.  The problem arises when the given String is not a valid integer representation.  In this case, a `NumberFormatException` will be thrown, potentially causing the application to crash.  The code lacks appropriate exception handling within the secondary constructor. 

## Solution

The solution involves adding a `try-catch` block within the secondary constructor to handle `NumberFormatException`. This ensures that the application does not crash and can potentially provide a more meaningful error message or default behavior.