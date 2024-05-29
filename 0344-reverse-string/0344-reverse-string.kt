class Solution {
    fun reverseString(s: CharArray): Unit {
        val n = s.size
        var tmp: Char = ' '
        for(i in 0 until (n/2)){
            tmp = s[i]
            s[i] = s[n-i-1]
            s[n-i-1] = tmp
        }
    }
}