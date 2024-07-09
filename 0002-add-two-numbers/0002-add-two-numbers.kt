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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val sumHead = ListNode(-1)
        var cur = sumHead

        var head1 = l1
        var head2 = l2
        var carry = 0
        while(head1 != null || head2 != null){
            var sum = (head1?.`val` ?: 0) + (head2?.`val` ?: 0) + carry
            head1 = head1?.next
            head2 = head2?.next

            if(sum >= 10){
                sum -= 10
                carry = 1
            }else{
                carry = 0
            }
            cur.next = ListNode(sum)
            cur = cur.next
        }
        if(carry != 0) cur.next = ListNode(1)

        return sumHead.next
    }
}