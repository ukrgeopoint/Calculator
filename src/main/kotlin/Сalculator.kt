fun main() {
    print("Enter first number: ")
    val firstNumber = readln().toInt()

    print("Enter second number: ")
    val secondNumber = readln().toInt()

    println("Choose an action operator: ")
    println("+ plus")
    println("- minus")
    println("* multiply")
    println("/ divide")
    println("% remainder")
    val mathOperator = readln()

    val result = calculateResult(firstNumber, secondNumber, mathOperator)
    println("Calculation result: $result")
}

fun calculateResult(firstNumber: Int, secondNumber: Int, mathOperator: String): String {
    /* val result =
        if (mathOperator == "+") {
            plusNumber(firstNumber, secondNumber)
        } else if (mathOperator == "-") {
            minusNumber(firstNumber, secondNumber)
        } else if (mathOperator == "*") {
            multiplyNumber(firstNumber, secondNumber)
        } else if (mathOperator == "/") {
            divideNumber(firstNumber, secondNumber)
        } else if (mathOperator == "%") {
            remainderNumber(firstNumber, secondNumber)
        } else {
            "Enter Invalid"
        }
    return result */

    val result = when (mathOperator) {
        "+" -> plusNumber(firstNumber, secondNumber)
        "-" -> minusNumber(firstNumber, secondNumber)
        "*" -> multiplyNumber(firstNumber, secondNumber)
        "/" -> divideNumber(firstNumber, secondNumber)
        "%" -> remainderNumber(firstNumber, secondNumber)
        else -> "Enter Invalid"
    }
    return result
}

private fun plusNumber(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber + secondNumber
    return result.toString()
}

private fun minusNumber(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber - secondNumber
    return result.toString()
}

private fun multiplyNumber(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber * secondNumber
    return result.toString()
}

private fun divideNumber(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber / secondNumber
    return result.toString()
}

private fun remainderNumber(firstNumber: Int, secondNumber: Int): String {
    val result = firstNumber % secondNumber
    return result.toString()
}

















