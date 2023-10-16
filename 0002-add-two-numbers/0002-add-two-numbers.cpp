/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode* result_head = new ListNode();

        ListNode* result_cur = result_head;
        while(l1 != nullptr && l2 != nullptr){
            int sum = l1->val + l2->val;
            l1 = l1->next; l2 = l2->next;

            sum += carry;
            carry = sum / 10;
            result_cur->next = new ListNode(sum % 10);
            result_cur = result_cur->next;
        }
        while(l1 != nullptr){
            int sum = l1->val + carry;
            l1= l1->next;
            
            carry = sum / 10;
            result_cur->next = new ListNode(sum % 10);
            result_cur = result_cur->next;
        }
        while(l2 != nullptr){
            int sum = l2->val + carry;
            l2= l2->next;

            carry = sum / 10;
            result_cur->next = new ListNode(sum % 10);
            result_cur = result_cur->next;
        }

        if(carry) result_cur->next = new ListNode(carry);

        return result_head->next;
    }
};