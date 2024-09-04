package ninja.b1t.easy

fun isIsomorphic(s: String, t: String): Boolean {
  val map = mutableMapOf<Char, Char>()
  val reverseMap = mutableMapOf<Char, Char>()

  s.zip(t).forEach { (charS, charT) ->
    when {
      map.containsKey(charS) -> {
        if (map[charS] != charT) return false
      }
      reverseMap.containsKey(charT) -> {
        if (reverseMap[charT] != charS) return false
      }
      else -> {
        map[charS] = charT
        reverseMap[charT] = charS
      }
    }
  }
  return true
}