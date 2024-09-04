package ninja.b1t.easy

fun singleNumber(nums: IntArray) = nums.reduce { acc, i -> acc.xor(i) }