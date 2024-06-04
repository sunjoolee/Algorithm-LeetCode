class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //<target - nums[i], i>
        val needed = mutableMapOf<Int, Int>()
        nums.forEachIndexed{i, num ->
            if(needed.containsKey(num)) return intArrayOf(needed[num]!!, i)
            needed[target-num] = i
        }
        return intArrayOf() //no answer
    }
}