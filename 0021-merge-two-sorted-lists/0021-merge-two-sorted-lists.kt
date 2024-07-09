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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null) return list2
        if(list2 == null) return list1


        val mergedHead = ListNode(-1) 
        var mergedNode = mergedHead
        var head1 = list1
        var head2 = list2

        while((head1 != null) && (head2 != null)){
            if(head1.`val` < head2.`val`){
                mergedNode.next = head1
                head1 = head1.next
            } else{
                mergedNode.next = head2
                head2 = head2.next
            }
            mergedNode = mergedNode.next
        }
        while(head1 != null){
            mergedNode.next = head1
            head1 = head1.next
            mergedNode = mergedNode.next
        }
        while(head2 != null){
            mergedNode.next = head2
            head2 = head2.next
            mergedNode = mergedNode.next
        }
        return mergedHead.next
    }
}