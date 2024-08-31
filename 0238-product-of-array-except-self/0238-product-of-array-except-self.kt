class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val zeroCount = nums.count{it == 0}
        
        if(zeroCount > 1){ // case1: nums includes more than one zeros
            return IntArray(nums.size){0}
        }
        
        val ans = mutableListOf<Int>()
        var totalProduct = 1L
        nums.forEach{ num ->
            if(num != 0) totalProduct *= num.toLong() 
        }
        println(totalProduct)
        
        if(zeroCount == 1){ // case2: nums includes one zero
        	nums.forEach{ num ->   
        		if(num == 0) ans.add(totalProduct.toInt())
                else ans.add(0)
        	}
        }
        else{ // case3: nums includes no zero
            nums.forEach{ num ->
                ans.add((totalProduct/num).toInt())
            }
        }
        
        return ans.toIntArray()
    }
}
