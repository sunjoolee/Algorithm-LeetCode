class Solution {
    fun compress(chars: CharArray): Int {
        val compressedChars = StringBuilder()
        var cnt = 1
        for(i in 0 until chars.size-1){
            if(chars[i] == chars[i+1]){
                cnt++
            }
            else{
                compressedChars.append(chars[i])
                if(cnt > 1) compressedChars.append(cnt.toString())
                cnt = 1
            }
        }
        compressedChars.append(chars.last())
        if(cnt > 1) compressedChars.append(cnt.toString())

        compressedChars.forEachIndexed{index, ch ->
            chars[index] = ch
        }
        return compressedChars.toString().length
    }
}