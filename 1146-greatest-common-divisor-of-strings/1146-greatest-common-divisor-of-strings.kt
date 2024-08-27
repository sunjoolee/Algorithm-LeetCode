import kotlin.math.*

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        val maxLen = str2.length.toDouble() // max length of x
        var repeat = 1 // repeat count of x
        while(true){
            val xLen = floor(maxLen/repeat).toInt()
            if(xLen == 0) break

            val x = str2.take(xLen)
            // check if x divides str1 & str2
            if(
                (str2.chunked(xLen).all{it == x}) &&
                (str1.chunked(xLen).all{it == x})
            ) return x

            repeat++
        }
        return "" 
    }
}