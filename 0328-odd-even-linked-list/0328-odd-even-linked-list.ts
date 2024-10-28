/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function oddEvenList(head: ListNode | null): ListNode | null {
    const oddHead = new ListNode(0) //dummy head
    const evenHead = new ListNode(0) // dummy head

    let oddPrev = oddHead
    let evenPrev = evenHead
    let cur = head
    let isOdd = true
    while(cur){
        if(isOdd){ // add to odd list
            oddPrev.next = cur
            oddPrev = cur
        }
        else{ // add to even list
            evenPrev.next = cur
            evenPrev = cur
        }
        // move cur node
        isOdd = !isOdd
        cur = cur.next
    }
    oddPrev.next = evenHead.next // concat odd list & even list
    evenPrev.next = null // cut cycle
    return oddHead.next 
};