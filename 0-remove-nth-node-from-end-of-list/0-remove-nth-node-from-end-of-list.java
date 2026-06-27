
// using fast and slow pointer
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        // n == len
        if(fast == null) return head.next;
        // move slow and fast together
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    return head;
    }
}