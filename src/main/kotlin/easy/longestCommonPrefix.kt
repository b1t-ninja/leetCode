package ninja.b1t.easy

//fun longestCommonPrefix(strs: Array<String>): String {
//  var longestKnownPrefix = ""
//  val elem = strs[0]
//  val left = 0
//
//  for (right in elem.indices) {
//    val slice = elem.slice(left..right)
//    if (strs.all {it.startsWith(slice)}) {
//      longestKnownPrefix = if (slice.length > longestKnownPrefix.length)
//        slice
//      else
//        longestKnownPrefix
//    }
//  }
//
//  return longestKnownPrefix
//}

fun longestCommonPrefix(strs: Array<String>): String {
  return strs.reduce { acc, str ->
    acc.commonPrefixWith(str)
  }
}

fun String.commonPrefixWith(other: String): String {
  return zip(other) // Pairs characters up to the length of the shorter string
    .takeWhile { it.first == it.second } // Takes characters while they match
    .map { it.first } // Maps to the characters themselves
    .joinToString("") // Joins them into a single string
}