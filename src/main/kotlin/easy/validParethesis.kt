package ninja.b1t.easy

fun isValid(s: String): Boolean {
    return s.count { it == '(' || it == '[' || it == '{' } == s.count { it == ')' || it == ']' || it == '}' }
}