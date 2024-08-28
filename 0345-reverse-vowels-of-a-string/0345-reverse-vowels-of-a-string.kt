class Solution {
    fun reverseVowels(s: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        var l = 0
        var r = s.length -1
        var ans = StringBuilder(s)
        while(l < r){
            val isLVowel = s[l] in vowels
            val isRVowel = s[r] in vowels 
            if(isLVowel && isRVowel){
                // swap vowels
                ans.set(l, s[r])
                ans.set(r, s[l])
            }
            else if(isLVowel){
                r--
                continue
            }
            else if(isRVowel){
                l++
                continue
            }
            l++
            r--
            
        }
        return ans.toString()
    }
}