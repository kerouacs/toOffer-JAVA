/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //记得判断边界条件
    //写完后记得检查循环加一减一等
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode fast = head;
        ListNode low = head;
        while(fast.next!=null){
            if(k>1){
                fast=fast.next;
                k--;
            }else{
                fast=fast.next;
                low=low.next;
            }
        }
        return low;   
    }
}