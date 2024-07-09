class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        var oddHead = ListNode(-1)
        var evenHead = ListNode(-1)

        var i = head
        var odd = oddHead
        var even = evenHead
        var flag = true //true: odd, false: even

        while(i != null){
            if(flag) {
                odd.next = i
                odd = odd.next
            }
            else{
                even.next = i
                even = even.next
            } 
            i = i.next
            flag = !flag
        }
        odd.next = evenHead.next
        even.next = null
        return oddHead.next
    }
}