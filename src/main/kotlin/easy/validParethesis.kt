package ninja.b1t.easy
fun isValid(s: String): Boolean {
    val matchingPairs = mapOf(')' to '(', '}' to '{', ']' to '[')

    return s.fold(emptyList<Char>()) { stack, char ->
        when(char) {
            in matchingPairs -> if (stack.lastOrNull() == matchingPairs[char])
                stack.dropLast(1) else return false
            else -> stack + char
        }
    }.isEmpty()
}