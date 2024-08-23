package ninja.b1t.easy

fun romanToInt(roman: String): Int {
  var total = 0
  var previousValue = 0
  val romanToIntegerMap: Map<Char, Int> = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
  )

  roman.reversed().forEach{ value ->
    val currentValue = romanToIntegerMap[value] ?: 0
    total += if (currentValue < previousValue) -currentValue else currentValue
    previousValue = currentValue
  }

  return total
}