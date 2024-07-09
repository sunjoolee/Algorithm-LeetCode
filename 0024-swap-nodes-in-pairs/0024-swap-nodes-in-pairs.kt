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
    fun swapPairs(head: ListNode?): ListNode? {
        var swapHead = ListNode(-1)
        swapHead.next = head

        var i = swapHead
        while(i.next != null && i.next.next != null){
            var a = i
            var b = i.next
            var c = i.next.next

            //swap
            a.next = c
            b.next = c.next
            c.next = b

            i = i.next.next
        }
        return swapHead.next
    }
}