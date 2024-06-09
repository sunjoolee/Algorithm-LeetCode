class Solution {
    fun arrayPairSum(nums: IntArray) = 
        nums
        .toList()
        .sorted()
        .filterIndexed{ index, it ->
            index % 2 == 0
        }
        .sum()
}

