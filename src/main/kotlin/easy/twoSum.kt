package ninja.b1t.easy

fun twoSum(nums: IntArray, target: Int): IntArray {
  val sumMap = mutableMapOf<Int, Int>()
  nums.forEachIndexed { index, num ->
    val complement = target - num
    if (sumMap.containsKey(complement)) {
      return intArrayOf(sumMap[complement]!!, index)
    }
    sumMap[num] = index
  }
  return intArrayOf()
}
