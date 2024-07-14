import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean {
        val brackets = mapOf(
            ')' to '(', 
            '}' to '{', 
            ']' to '['
            )

        val st = Stack<Char>()
        for(ch in s){
            if(st.isEmpty() || ch in brackets.values){
                st.push(ch)
            }
            else if(ch in brackets.keys){
                if(st.isEmpty()) return false

                if(st.peek() == brackets[ch]!!) st.pop()
                else st.push(ch)
            }
            else return false //wrong input
        }
        return st.isEmpty()
    }   
}