/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun isPalindrome(head: ListNode?): Boolean = 
        isPalindrome(linkedListToString(head))

    private fun linkedListToString(head: ListNode?):String{
        var curNode = head
        val str = StringBuilder()
        while(curNode != null){
            str.append(curNode.`val`)
            curNode = curNode.next
        }
        return str.toString()
    }

    private fun isPalindrome(str:String):Boolean {
        val n = str.length
        for(i in 0 until n/2){
            if(str[i] != str[n-i-1]) return false
        }
        return true
    }
}
